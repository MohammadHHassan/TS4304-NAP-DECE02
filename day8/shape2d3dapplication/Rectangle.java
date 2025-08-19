package day8.shape2d3dapplication;

public class Rectangle extends Shape implements Shape2D
{
	double length, width;
	
	public Rectangle(String colour, double length, double width)
	{
		super(colour);
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea()
	{
		return length*width;
	}

	@Override
	public double getPerimeter()
	{
		return (2*length)+(2*width);
	}

	@Override
	public String toString() {
		return "Rectangle [ Length = " + length + ", Width = " + width + ", Colour = " + colour + ", Area = " + df.format(getArea())
				+ ", Perimeter = " + df.format(getPerimeter()) + " ]";
	}
}
