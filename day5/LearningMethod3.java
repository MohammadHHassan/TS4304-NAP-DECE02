package day5;

public class LearningMethod3
{
	public static void main(String[] args)
	{
		displayName("Haji Mohammad");
		System.out.println(printName("Haji Hassan"));
	}
	
	public static void displayName(String name)
	{
		System.out.println("My first name is " + name);
	}
	
	public static String printName(String name)
	{
		String text = "My last name is " + name;
		return text;
	}
}
