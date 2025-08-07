package day3;

public class LearningString
{
	public static void main(String[] args)
	{
		String a = "ABC123";
		System.out.println("a = " + a);
		
		String b = "abc123";
		System.out.println("b = " + b);
		
		boolean c = a.equals(b);	// Comparing a and b whether it is equal or not
		System.out.println("Is a equal to b? " + c);
		
		boolean d = a.equalsIgnoreCase(b);	// Comparing while ignoring case
		System.out.println("Is a equal to b (ignoring case)? " + d);
		
		String e = "Communication";
		String f = "cat";
		
		int g = e.indexOf(f);	// Checking whether f is inside e or not
		System.out.println("g = " + g);		// -1 means not included
		
		if(g==-1)
		{
			System.out.println(f + " is not included in " + e);
		}
		else
		{
			System.out.println(f + " is included in " + e);
		}
	}
}
