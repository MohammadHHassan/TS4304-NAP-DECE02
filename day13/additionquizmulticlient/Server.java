package day13.additionquizmulticlient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DecimalFormat;
import java.util.Date;

public class Server
{
	public static void main(String[] args)
	{
		try
		{
			// Declaration of server socket with port number 9101
			ServerSocket socketServer = new ServerSocket(9101);
			// Display the time and date when the server is started
			System.out.println("Server started at " + new Date());
			
			// Declaration of decimal format in 2 decimal places
			DecimalFormat df = new DecimalFormat("#.##");
			
			while(true)		// Forever loop to accept multiple clients
			{
				// Accepting the socket request from client
				Socket socket = socketServer.accept();
				
				// Implement thread to serve multiple clients simultaneously
				new Thread(new Runnable()
				{
					@Override
					public void run()
					{
						try
						{
							// Enable reading data from client
							DataInputStream fromClient = new DataInputStream(socket.getInputStream());
							// Enable writing data to client
							DataOutputStream toClient = new DataOutputStream(socket.getOutputStream());
							
							String name = fromClient.readUTF();		// Receive the user's name from client
							System.out.println("\n" + name + " has been connected.\n");
							
							int questionNumber=0;
							
							while(true)		// Forever loop to send and receive data to and from the client
							{
								questionNumber++;		// Increment the question number in sequence
								
								// Generate 2 random numbers between 10-99 and send to client
								int randomNumber1 = 10 + (int)(Math.random()*((99-10)+1));
								int randomNumber2 = 10 + (int)(Math.random()*((99-10)+1));
								toClient.writeInt(randomNumber1);
								toClient.writeInt(randomNumber2);
								
								int answer = fromClient.readInt();		// Receive user's answer
								
								String text = "\n" + name + "'s Q" + questionNumber + ": " + randomNumber1 + " + " + randomNumber2 + "?";
								
								if(answer==(randomNumber1+randomNumber2))		// If the answer is correct
								{
									System.out.println(text + " answered " + answer + " [CORRECT]");
								}
								else		// If the answer is incorrect
								{
									System.out.println(text + " answered " + answer + " [INCORRECT]");
								}
								
								double totalMarks = fromClient.readDouble();
								System.out.println(name + " current marks: " + df.format(totalMarks) + "%");
							}
						}
						catch (IOException e)
						{
							e.printStackTrace();
						}
					}
				}).start();
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
