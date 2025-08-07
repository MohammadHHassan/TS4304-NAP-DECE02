package day4;

import java.util.Scanner;

public class LearningArrays2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String [] month = {"January", "February", "March", "April", "May", "June", 
				"July", "August", "September", "October", "November", "December"};
		
		System.out.print("Please enter your birth month value: ");
		int value = scanner.nextInt();
		
		if(value>=1 && value<=12)
		{
			System.out.println("Your birth month is " + month[value-1]);
		}
		else
		{
			System.out.println("Invalid value.");
		}
	}
}
