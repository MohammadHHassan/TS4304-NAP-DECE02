package day4;

public class LearningArrays
{
	public static void main(String[] args)
	{
		// Array is a set of elements with the same data type
		int [] number = new int[3];		// Declare integer array with 3 elements
		number[0] = 10;
		number[1] = 15;
		number[2] = 20;
		
		System.out.println(number[0] + ", " + number[1] + ", " + number[2]);
		
		for(int i=0 ; i<3 ; i++)
		{
			System.out.print(number[i] + "\t");
		}
		System.out.println();
		
		for(int j=0 ; j<number.length ; j++)
		{
			System.out.print(number[j] + "\t");
		}
		System.out.println();
		
		for(int k : number)			// Temporary variable k (depends on data type)
		{
			System.out.print(k + "\t");
		}
		System.out.println();
		
		String [] name = new String[5];
		name[0] = "Haji";
		name[1] = "Mohammad";
		name[2] = "bin";
		name[3] = "Haji";
		name[4] = "Hassan";
		
		for(String a : name)
		{
			System.out.print(a + " ");
		}
	}
}
