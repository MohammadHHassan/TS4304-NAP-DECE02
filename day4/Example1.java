package day4;

import java.util.Scanner;

public class Example1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the number of students in the class: ");
		int numberOfStudents = scanner.nextInt();
		scanner.nextLine();		// To avoid bugs (applies between nextInt/nextDouble/nextChar with nextLine)
		
		String [] names = new String[numberOfStudents];
		
		for(int i=0 ; i<names.length ; i++)
		{
			System.out.print("Please enter the name of student no. " + (i+1) + ": ");
			names[i] = scanner.nextLine();
		}
		
		System.out.println("\n=====================================\n");
		
		for(int j=0 ; j<names.length ; j++)
		{
			System.out.println("Name of student no. " + (j+1) + ": " + names[j]);
		}
	}
}
