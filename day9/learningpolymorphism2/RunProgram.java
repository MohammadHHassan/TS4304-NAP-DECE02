package day9.learningpolymorphism2;

public class RunProgram
{
	public static void main(String[] args)
	{
		Calculator calculator1 = new Calculator();
		
		System.out.println("int: 2+3 = " + calculator1.add(2,3));
		System.out.println("double: 2.5+3.7 = " + calculator1.add(2.5,3.7));
	}
}
