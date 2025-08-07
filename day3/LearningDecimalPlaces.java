package day3;

import java.text.DecimalFormat;		// DecimalFormat library

public class LearningDecimalPlaces
{
	public static void main(String[] args)
	{
		double pi = 3.14159;
		
		System.out.println("Pi = " + pi);
		System.out.printf("Pi in 2 d.p = %.2f\n", pi);
		
		DecimalFormat a = new DecimalFormat("#.##");	// a (2 d.p)
		DecimalFormat b = new DecimalFormat("#.#");		// b (1 d.p)
		
		System.out.println("Using DecimalFormat, pi in 2 d.p = " + a.format(pi));
		System.out.println("2.55555555 in 2 d.p = " + a.format(2.55555555));
		System.out.println("Math.PI in 2 d.p = " + a.format(Math.PI));
		
		System.out.println("190.98765 in 1 d.p = " + b.format(190.98765));
		System.out.println("Math.PI in 1 d.p = " + b.format(Math.PI));
	}
}
