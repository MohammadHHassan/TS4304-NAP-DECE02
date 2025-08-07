package day5;

import java.util.Scanner;

public class LearningParseInt
{
	public static void main(String[] args)
	{
		// parseInt is a method provided by the Integer class
		// converts String into int
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		String a = scanner.nextLine();
		
		System.out.println("String a = " + a);
		System.out.println("(a+10) = " + (a+10));
		
		int b = Integer.parseInt(a);
		System.out.println("Integer b = " + b);
		System.out.println("(b+10) = " + (b+10));
		
		scanner.close();
	}
}
