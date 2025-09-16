package day10.datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessingApplication
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> guessedNumber = new ArrayList<Integer>();
		
		int randomNumber = 1 + (int)(Math.random()*((10-1)+1));
		System.out.println("A random number between 1-10 has been generated.\n");
		
		while(true)		// Forever loop
		{
			System.out.print("Cuba teka: ");
			int guess = scanner.nextInt();
			
			if(guess == randomNumber)
			{
				System.out.println("Lurus!");
				break;		// Break out/exit from the loop (while true)
			}
			else
			{
				// Loop to check/compare the guessed number one by one
				for(int i=0 ; i<guessedNumber.size() ; i++)
				{
					if(guessedNumber.get(i) == guess)
					{
						System.out.println("Sudah Teka.");
						break;		// Exit from the loop (for loop)
					}
				}
				
				guessedNumber.add(guess);
				System.out.println("Salah teka. Sila cuba lagi.\n");
			}
		}
	}
}
