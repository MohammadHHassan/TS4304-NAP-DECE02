package day1;

public class LearningAssignmentOperator
{
	public static void main(String[] args)
	{
		int x=1;
		System.out.println("1. Initially, x = " + x);
		
		x = x+1;		// New x = Old x + 1
		System.out.println("2. Incremented, x = " + x);
		
		x++;			// Increase x by 1
		System.out.println("3. Incremented, x = " + x);
		
		x+=1;			// Increase x by 1
		System.out.println("4. Incremented, x = " + x);
		
		x = x-1;		// New x = Old x - 1
		System.out.println("5. Decremented, x = " + x);
		
		x--;			// Decrease x by 1
		System.out.println("6. Decremented, x = " + x);
		
		x-=1;			// Decrease x by 1
		System.out.println("7. Decremented, x = " + x);
	}
}
