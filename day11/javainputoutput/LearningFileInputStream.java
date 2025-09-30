package day11.javainputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LearningFileInputStream
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			FileInputStream input = new FileInputStream("test.dat");
			
			int value;
			value = input.read();
			
			while(value!=-1)		// While there is still data inside the file to be read
			{
				System.out.println(value);
				value = input.read();
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
