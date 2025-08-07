package day5;

import java.time.LocalDate;		// Import LocalDate Library
import java.util.Date;

public class LearningLocalDate
{
	public static void main(String[] args)
	{
		LocalDate now = LocalDate.now();	// Declaration of LocalDate class
		
		System.out.println(now);
		System.out.println("Year = " + now.getYear());
		System.out.println("Month = " + now.getMonth());
		System.out.println("Month value = " + now.getMonthValue());
		System.out.println("Day of the month = " + now.getDayOfMonth());
		System.out.println("Day of the year = " + now.getDayOfYear());
		System.out.println("Day of the week = " + now.getDayOfWeek());
		
		System.out.println("The time and date now is " + new Date());
	}
}
