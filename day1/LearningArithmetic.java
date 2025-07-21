package day1;

public class LearningArithmetic
{
	public static void main(String[] args)
	{
		int a, b, c;
		a=9;
		b=4;
		c = a/b;
		System.out.println("int c = 9/4 = " + c);
		
		double d=9, e=4, f;
		f = d/e;
		System.out.println("double f = 9.0/4.0 = " + f);
		
		System.out.println("9/4 = " + (9/4));
		System.out.println("9.0/4.0 = " + (9.0/4.0));
		
		double g = Math.pow(2,4);
		System.out.println("Math.pow(2,4) = " + g);
		
		System.out.println("Math.pow(3,5) = " + Math.pow(3,5));
		
		System.out.println("Square root of 16 = " + Math.sqrt(16));
		
		System.out.println("The value of Pi = " + Math.PI);
		
		System.out.println("Remainder of 9/4 = " + (9%4));
	}
}
