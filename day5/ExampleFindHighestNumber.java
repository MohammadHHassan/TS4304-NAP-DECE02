package day5;

import java.util.Scanner;

public class ExampleFindHighestNumber
{
	static int firstNumber, secondNumber;		// Class variable
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		askInput();
		findAndPrintHighest();
	}
	
	public static void askInput()
	{
		System.out.print("Please enter the first number: ");
		firstNumber = scanner.nextInt();
		
		System.out.print("Please enter the second number: ");
		secondNumber = scanner.nextInt();
	}
	
	public static void findAndPrintHighest()
	{
		String text = "The highest number between the two is ";
		
		if(firstNumber>secondNumber)
		{
			System.out.println(text + firstNumber);
		}
		else
		{
			System.out.println(text + secondNumber);
		}
	}
}
