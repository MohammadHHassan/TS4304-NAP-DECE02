package day12.circlecalculatorapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server
{
	public static void main(String[] args)
	{
		try
		{
			// Declaration of Server Socket with Port Number 9101
			ServerSocket socketServer = new ServerSocket(9101);
			// Display the time and date when the server is started
			System.out.println("Server started at " + new Date());
			
			// Accepting the socket request from client
			Socket socket = socketServer.accept();
			// Display message that a client has been connected
			System.out.println("Client has been connected.");
			
			// Enable reading data from the client
			DataInputStream fromClient = new DataInputStream(socket.getInputStream());
			// Enable writing data to the client
			DataOutputStream toClient = new DataOutputStream(socket.getOutputStream());
			
			while(true)			// Forever loop
			{
				// Receive the radius value from the client
				double radius = fromClient.readDouble();
				
				// Calculate the area of circle using the received radius value
				double area = Math.PI*Math.pow(radius, 2);
				
				// Sending area value to the client
				toClient.writeDouble(area);
				
				System.out.println("\nReceived radius: " + radius);
				System.out.println("Sent area: " + area);
			}
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
