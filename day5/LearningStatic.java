package day5;

public class LearningStatic
{
	// static member (variable, method, class) is shared by all objects in the class.
	static int y=10;		// Class variable
	
	public static void main(String[] args)
	{
		int x=5;		// Local variable
		
		System.out.println("1. x = " + x);		// Initially, x=5
		System.out.println("2. x = " + incrementBy10(x));	// Increment x by 10 temporarily
		System.out.println("3. x = " + incrementBy10(x));	// Increment x by 10 temporarily
		System.out.println("4. x = " + x);		// Value of x doesn't change
		
		System.out.println("\n1. y = " + y);	// Initially, y=10
		System.out.println("2. y = " + incrementYBy20());	// y+20 permanently
		System.out.println("3. y = " + incrementYBy20());	// y+20 permanently
		System.out.println("4. y = " + y);		// Final value of y
	}
	
	public static int incrementBy10(int value)
	{
		return value+10;		// Increment the value by 10 and return to main		
	}
	
	public static int incrementYBy20()
	{
		return y = y+20;
	}
}
