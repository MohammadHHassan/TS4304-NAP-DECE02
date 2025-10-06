package day13.chatapplication;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

// Implement Runnable to be able to run multiple session simultaneously
public class ChatSession implements Runnable
{
	// Instance variable socket for client1 & client2
	private Socket client1, client2;
	// Class variable to count the number of sessions created
	private static int sessionNumber=0;
	
	// Constructor for chat session
	public ChatSession(Socket client1, Socket client2)
	{
		this.client1 = client1;		// Store client1 parameter to instance variable
		this.client2 = client2;		// Store client2 parameter to instance variable
	}
	
	@Override
	public void run()
	{
		try
		{
			// Enable reading data from client 1
			DataInputStream fromClient1 = new DataInputStream(client2.getInputStream());
			// Enable writing data to client 1
			DataOutputStream toClient1 = new DataOutputStream(client2.getOutputStream());
			
			// Enable reading data from client 2
			DataInputStream fromClient2 = new DataInputStream(client1.getInputStream());
			// Enable writing data to client 2
			DataOutputStream toClient2 = new DataOutputStream(client1.getOutputStream());
			
			String chatID1 = fromClient1.readUTF();		// Receive chat ID from client 1
			String chatID2 = fromClient2.readUTF();		// Receive chat ID from client 2
			
			// Display the clients who have been connected
			System.out.println("\n" + chatID1 + " has been connected with " + chatID2);
			sessionNumber++;		// Increment the session number created
			System.out.println("Chat Session No. " + sessionNumber + " has started.\n");
			
			toClient1.writeUTF(chatID2);		// Send chat ID 2 to client 1
			toClient2.writeUTF(chatID1);		// Send chat ID 1 to client 2
			
			while(true)		// Forever loop to enable reading & writing texts between the clients
			{
				if(fromClient1.available()>0)	// If there is any incoming text from client 1
				{
					String msg1 = fromClient1.readUTF();	// Received the text from client 1
					toClient2.writeUTF(msg1);				// Send the text to client 2
				}
				
				if(fromClient2.available()>0)	// If there is any incoming text from client 2
				{
					String msg2 = fromClient2.readUTF();	// Received the text from client 2
					toClient1.writeUTF(msg2);				// Send the text to client 1
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
