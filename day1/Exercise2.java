/* Exercise 2
 * Implement a Scanner class.
 * Prompt the user to enter their name
 * and age.
 * Store the input in two separate variables.
 * Print out the name and age.
 */

package day1;

import java.util.Scanner;

public class Exercise2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String name = scanner.nextLine();
		
		System.out.print("Please enter your age: ");
		int age = scanner.nextInt();
		
		System.out.println("Your name is " + name + " and you are " + age + " years old.");
		
		scanner.close();
	}
}
