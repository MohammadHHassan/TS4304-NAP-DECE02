package day8.shape2d3dapplication;

public class Circle extends Shape implements Shape2D
{
	double radius;		// Instance variable for circle
	
	public Circle(String colour, double radius)		// Circle constructor with 2 parameters
	{
		super(colour);				// Colour attribute inherit from Shape
		this.radius = radius;		// Transfer data from parameter to instance variable
	}

	@Override
	public double getArea()
	{
		return Math.PI*Math.pow(radius, 2);		// Return the area of circle value
	}

	@Override
	public double getPerimeter()
	{
		return 2.0*Math.PI*radius;				// Return the perimeter of circle value
	}

	@Override
	public String toString() {
		return "Circle [ Radius = " + radius + ", Colour = " + colour + ", Area = " + df.format(getArea()) + ", Perimeter = "
				+ df.format(getPerimeter()) + " ]";
	}
}
