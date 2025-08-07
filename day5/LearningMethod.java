package day5;

public class LearningMethod
{
	public static void main(String[] args)		// Main method
	{
		int sum1=0;
		
		for(int i=1 ; i<=5 ; i++)
		{
			sum1 = sum1+i;			// 1+2+3+4+5
		}
		
		System.out.println("Sum from 1-5 = " + sum1);
		
		int sum2=0;
		
		for(int j=10 ; j<=15 ; j++)
		{
			sum2 = sum2+j;			// 10+11+12+13+14+15
		}
		
		System.out.println("Sum from 10-15 = " + sum2);
		
		int sum3=0;
		
		for(int k=20 ; k<=30 ; k++)
		{
			sum3 = sum3+k;			// 20+21+22+23+24+25+26+27+28+29+30
		}
		
		System.out.println("Sum from 20-30 = " + sum3);
	}
}
