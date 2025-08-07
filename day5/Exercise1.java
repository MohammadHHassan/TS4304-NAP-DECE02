/* Declare LocalDate class using variable now
 * Declare Scanner class to allow user's input
 * 
 * Ask the user to enter their birth year and store it properly
 * Print out the age of the user this year
 */

package day5;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise1
{
	public static void main(String[] args)
	{
		LocalDate now = LocalDate.now();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your birth year: ");
		int birthYear = scanner.nextInt();
		
		System.out.println("You are " + (now.getYear()-birthYear) + " years old this year.");
		
		scanner.close();
	}
}
