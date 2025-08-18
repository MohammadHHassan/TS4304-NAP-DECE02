package day7.shapeapplication;

public class Circle extends Shape
{
	double radius;
	
	public Circle(String colour, double radius)
	{
		super(colour);
		this.radius = radius;
	}
	
	public double getArea()
	{
		return Math.PI*Math.pow(radius, 2);
	}
	
	public double getPerimeter()
	{
		return 2.0*Math.PI*radius;
	}
}
