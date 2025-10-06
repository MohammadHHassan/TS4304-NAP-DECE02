package day13.chatapplication;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			// Requesting socket to server with IP address and port number 9101
			Socket socket = new Socket("localhost", 9101);
			
			// Enable reading data from server
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());
			// Enable writing data to server
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
			
			Scanner scanner = new Scanner(System.in);		// Enable user input
			
			System.out.print("Please enter your chat ID: ");
			String chatID = scanner.nextLine();		// Store user's chat ID
			toServer.writeUTF(chatID);				// Send chat ID to the server
			
			// Display the name of other client
			System.out.println("You are connected with " + fromServer.readUTF());
			
			// Implement thread to allow receiving and sending messages simultaneously
			new Thread(new Runnable()
			{
				@Override
				public void run()
				{
					while(true)			// Forever loop to accept multiple messages
					{
						try
						{
							if(fromServer.available()>0)	// If there is any incoming text
							{
								String receivedMsg = fromServer.readUTF();	// Read the text
								System.out.println(">>> " + receivedMsg);	// Display text
							}
						} 
						catch (IOException e)
						{
							e.printStackTrace();
						}
					}
				}
			}).start();
			
			while(true)		// Forever loop to enable writing text anytime
			{
				String msg = scanner.nextLine();		// Store user's text
				toServer.writeUTF(msg);					// Send the text to the server
			}
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}
