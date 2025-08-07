package day3;

import java.util.Scanner;

public class LearningDoWhileWithScanner
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int value, count=0;
		
		do
		{
			System.out.print("Please enter the number 5: ");
			value = scanner.nextInt();
			
			if(value!=5)
			{
				System.out.println("You have entered the wrong value.");
				System.out.println("Please try again.");
				count++;
			}
			
		}while(value!=5);		// Keep on asking the user while it is not equal to 5
		
		System.out.println("You entered the correct value.");
		System.out.println("Number of times you entered an incorrect value: " + count);
		
		scanner.close();
	}
}
