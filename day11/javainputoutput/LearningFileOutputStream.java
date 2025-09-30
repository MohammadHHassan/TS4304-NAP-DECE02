package day11.javainputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LearningFileOutputStream
{
	public static void main(String[] args) throws IOException
	{
		try
		{
			FileOutputStream output = new FileOutputStream("test.dat");
			
			for(int i=1 ; i<=100 ; i++)
			{
				output.write(i);		// Writing data inside the test.dat file
			}
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}		
	}
}
