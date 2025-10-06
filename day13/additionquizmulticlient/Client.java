package day13.additionquizmulticlient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			// Requesting socket with port number 9101 to the server
			Socket socket = new Socket("localhost", 9101);
			
			// Declaration of decimal format in 2 decimal places
			DecimalFormat df = new DecimalFormat("#.##");
			
			// Enable user input
			Scanner scanner = new Scanner(System.in);
			
			// Enable reading data from the server
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());
			// Enable writing data to the server
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
			
			// Prompt a message for the user to enter their name and store it
			System.out.print("Please enter your name: ");
			String name = scanner.nextLine();
			
			toServer.writeUTF(name);	// Send user's name to the server
			
			// Declare variable to count the question number and correct answer
			int questionNumber=0, marksCount=0;
			// Declare variable to calculate the percentage of correct answers
			double totalMarks;
			
			while(true)			// Forever loop to send and receive data to and from the server
			{
				questionNumber++;		// Increment question number in sequence
				
				int randomNumber1 = fromServer.readInt();
				int randomNumber2 = fromServer.readInt();
				
				// Prompt the question to the user
				System.out.println("\nQ" + questionNumber + ": " + randomNumber1 + " + " + randomNumber2 + "?");
				System.out.print("Your answer: ");
				int answer = scanner.nextInt();			// Store user's answer
				
				toServer.writeInt(answer);				// Send the user's answer to the server
				
				if(answer==(randomNumber1+randomNumber2))		// If the answer is correct
				{
					marksCount++;			// Increment the marks
					
					totalMarks = ((double)marksCount/questionNumber)*100;
					System.out.println("Correct! :) - Current marks: " + df.format(totalMarks) + "%");
				}
				else
				{
					totalMarks = ((double)marksCount/questionNumber)*100;
					System.out.println("Incorrect! :( - Current marks: " + df.format(totalMarks) + "%");
				}
				
				toServer.writeDouble(totalMarks);
			}
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
