package day2;

public class LearningRandomNumberGenerator
{
	public static void main(String[] args)
	{
		// int randomNumber = min + (int)(Math.random()*((max-min)+1));
		
		// Generate random number between 5-10
		int randomNumber = 5 + (int)(Math.random()*((10-5)+1));
		
		System.out.println("Random number generated = " + randomNumber);
	}
}
