package day9.studentapplication;

public class Student
{
	private int id;			// instance variable id (private)
	private String name;	// instance variable name (private)
	private int age;		// instance variable age (private)
	private static int numberOfStudents=0;		// Class variable to count the number of students
	
	public Student(String name, int age)
	{
		this.name = name;
		editAge(age);
		numberOfStudents++;		// Increment numberOfStudents by 1 each time a student object is created
		this.id = numberOfStudents;		// Store the current value of numberOfStudents as their id
	}
	
	public int getId()		// Method to retrieve the id of the student (getter)
	{
		return id;
	}
	
	public String getName()		// Method to retrieve the name of the student (getter)
	{
		return name;
	}
	
	public int getAge()		// Method to retrieve the age of the student (getter)
	{
		return age;
	}
	
	public void editAge(int age)	// Method to edit the age of the existing student (setter)
	{
		this.age = age;
	}
}
