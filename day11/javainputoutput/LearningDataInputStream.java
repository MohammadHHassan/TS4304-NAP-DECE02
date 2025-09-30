package day11.javainputoutput;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LearningDataInputStream
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			DataInputStream input = new DataInputStream(new FileInputStream("data.dat"));
			
			while(input.available() != 0)	// While there is still data to be read
			{
				System.out.println(input.readUTF());
				System.out.println(input.readDouble());
				System.out.println(input.readBoolean());
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
