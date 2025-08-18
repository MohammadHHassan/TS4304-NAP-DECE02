package day7.shapeapplication;

public class Rectangle extends Shape	// Rectangle inherits from Shape class
{
	double length, breadth;
	
	public Rectangle(String colour, double length, double breadth)
	{
		super(colour);
		this.length = length;		// Store from parameter variable to instance variable
		this.breadth = breadth;
	}
	
	public double getArea()
	{
		return length*breadth;
	}
	
	public double getPerimeter()
	{
		return (2*length)+(2*breadth);
	}
}
