package assignmenttemplate;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class GameSession implements Runnable
{
	Socket client1, client2;

	public GameSession(Socket client1, Socket client2)
	{
		this.client1 = client1;
		this.client2 = client2;
	}

	@Override
	public void run()
	{
		try
		{
			DataInputStream fromClient1 = new DataInputStream(client1.getInputStream());
			DataOutputStream toClient1 = new DataOutputStream(client1.getOutputStream());
			DataInputStream fromClient2 = new DataInputStream(client2.getInputStream());
			DataOutputStream toClient2 = new DataOutputStream(client2.getOutputStream());
			
			String gameID1 = fromClient1.readUTF();
			toClient2.writeUTF(gameID1);
			
			String gameID2 = fromClient2.readUTF();
			toClient1.writeUTF(gameID2);
			
			System.out.println("\n" + gameID1 + " has been connected with " + gameID2);
			
			while(true)
			{
				String client1Input = fromClient1.readUTF();
				String client2Input = fromClient2.readUTF();
				
				if(client1Input.equalsIgnoreCase("R"))
				{
					if(client2Input.equalsIgnoreCase("R"))
					{
						toClient1.writeUTF("Draw");
						toClient2.writeUTF("Draw");
					}
					else if(client2Input.equalsIgnoreCase("P"))
					{
						toClient1.writeUTF("Lose");
						toClient2.writeUTF("Win");
					}
					else if(client2Input.equalsIgnoreCase("S"))
					{
						toClient1.writeUTF("Win");
						toClient2.writeUTF("Lose");
					}
					else
					{
						toClient1.writeUTF("One of the player has entered an invalid key");
						toClient2.writeUTF("One of the player has entered an invalid key");
					}
				}
				else if(client1Input.equalsIgnoreCase("P"))
				{
					if(client2Input.equalsIgnoreCase("R"))
					{
						toClient1.writeUTF("Win");
						toClient2.writeUTF("Lose");
					}
					else if(client2Input.equalsIgnoreCase("P"))
					{
						toClient1.writeUTF("Draw");
						toClient2.writeUTF("Draw");
					}
					else if(client2Input.equalsIgnoreCase("S"))
					{
						toClient1.writeUTF("Lose");
						toClient2.writeUTF("Win");
					}
					else
					{
						toClient1.writeUTF("One of the player has entered an invalid key");
						toClient2.writeUTF("One of the player has entered an invalid key");
					}
				}
				else if(client1Input.equalsIgnoreCase("S"))
				{
					if(client2Input.equalsIgnoreCase("R"))
					{
						toClient1.writeUTF("Lose");
						toClient2.writeUTF("Win");
					}
					else if(client2Input.equalsIgnoreCase("P"))
					{
						toClient1.writeUTF("Win");
						toClient2.writeUTF("Lose");
					}
					else if(client2Input.equalsIgnoreCase("S"))
					{
						toClient1.writeUTF("Draw");
						toClient2.writeUTF("Draw");
					}
					else
					{
						toClient1.writeUTF("One of the player has entered an invalid key");
						toClient2.writeUTF("One of the player has entered an invalid key");
					}
				}
				else
				{
					toClient1.writeUTF("One of the player has entered an invalid key");
					toClient2.writeUTF("One of the player has entered an invalid key");
				}
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
}
