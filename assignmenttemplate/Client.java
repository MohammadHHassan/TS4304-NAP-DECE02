package assignmenttemplate;

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
			Socket socket = new Socket("localhost", 9101);
			
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Welcome to Rock, Paper & Scissor Game! :-)\n");
			
			System.out.print("Please enter your game ID: ");
			String gameID = scanner.nextLine();
			toServer.writeUTF(gameID);
			
			String opponentID = fromServer.readUTF();
			System.out.println("You are now connected with " + opponentID + "\n");
			
			while(true)
			{
				System.out.println("Press R (Rock)");
				System.out.println("Press P (Paper)");
				System.out.println("Press S (Scissor)");
				
				System.out.print("Enter your choice: ");
				String choice = scanner.nextLine();
				toServer.writeUTF(choice);
				
				String msg = fromServer.readUTF();
				System.out.println(msg + "\n");
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
