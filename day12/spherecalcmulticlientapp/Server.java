package day12.spherecalcmulticlientapp;

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
			ServerSocket socketServer = new ServerSocket(9101);
			System.out.println("Server started at " + new Date());
			
			DecimalFormat dp = new DecimalFormat("#.##");
			
			while(true)		// Forever loop to accept multiple clients
			{
				Socket socket = socketServer.accept();
				System.out.println("Client has been connected.");
				
				// Implement thread to accept inputs and to give outputs
				// from and to multiple clients at the same time
				new Thread(new Runnable()
				{
					@Override
					public void run()
					{
						try
						{
							DataInputStream fromClient = new DataInputStream(socket.getInputStream());
							DataOutputStream toClient = new DataOutputStream(socket.getOutputStream());
							
							while(true)			// Forever loop for sphere calculator app
							{
								double radius = fromClient.readDouble();	// Receiving the radius from client
								
								double volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
								
								toClient.writeDouble(volume);
								
								System.out.println("\nReceived radius: " + radius);
								System.out.println("Sent volume: " + dp.format(volume));
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
