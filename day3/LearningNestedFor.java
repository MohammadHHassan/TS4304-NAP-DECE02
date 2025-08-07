package day3;

public class LearningNestedFor
{
	public static void main(String[] args)
	{
		for(int i=1 ; i<=10 ; i++)		// Row
		{
			for(int j=1 ; j<=10 ; j++)	// Column
			{
				System.out.print(i*j + "\t");
			}
			System.out.println();		// Print a new line
		}
	}
}
