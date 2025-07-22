/* Create a random number generator in which the max and min range values
 * are entered by the user.
 * Print out the random value.
 */

package day2;

import java.util.Scanner;

public class Exercise1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the minimum value: ");
		int min = scanner.nextInt();
		
		System.out.print("Please enter the maximum value: ");
		int max = scanner.nextInt();
		
		int randomNumber = min + (int)(Math.random()*((max-min)+1));
		
		System.out.println("Random number generated = " + randomNumber);
		
		scanner.close();
	}
}
