package day12.spherecalcmulticlientapp;

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
			Socket socket = new Socket("localhost", 9101);
			
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
			
			Scanner scanner = new Scanner(System.in);
			
			DecimalFormat dp = new DecimalFormat("#.##");
			
			while(true)		// Forever loop for sphere calculator app
			{
				System.out.print("\nPlease enter the radius value: ");
				double radius = scanner.nextDouble();
				
				toServer.writeDouble(radius);	// Sending the radius value to the server
				
				double volume = fromServer.readDouble();
				
				System.out.println("Sent radius: " + radius);
				System.out.println("Received volume: " + dp.format(volume));
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
