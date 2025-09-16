package day9.studentapplication;

public class Module
{
	private String code;
	private String name;
	private Student [] students;		// Creating array of students
	private int currentNumberOfStudents=0;
	
	public Module(String code, String name, int maxNumberOfStudents)
	{
		editCode(code);
		editName(name);
		students = new Student[maxNumberOfStudents];	// Declaration of student array
													// with the limit number of students
	}
	
	public String getCode()		// Method to retrieve the module code (getter)
	{
		return code;
	}
	
	public String getName()		// Method to retrieve the module name (getter)
	{
		return name;
	}
	
	public Student [] getStudents()		// Method to retrieve the students data (getter)
	{
		return students;
	}
	
	public void editCode(String code)	// Method to modify the module code (setter)
	{
		this.code = code;
	}
	
	public void editName(String name)	// Method to modify the module name (setter)
	{
		this.name = name;
	}
	
	public boolean addStudent(Student student)
	{
		if(currentNumberOfStudents >= students.length)		// If the capacity is full
		{
			return false;		// Fail to enroll the student
		}
		
		for(int i=0 ; i<students.length ; i++)
		{
			if(students[i] != null)		// If the student array is not empty
			{
				if(students[i].getId() == student.getId())	// If there is a duplicate
				{
					return false;		// Fail to enroll the student
				}
			}
		}
		
		students[currentNumberOfStudents] = student;	// Enrolling the student in the module
		currentNumberOfStudents++;		// Increment the number of student in the module
		return true;					// Successfully enrolled the student
	}
}
