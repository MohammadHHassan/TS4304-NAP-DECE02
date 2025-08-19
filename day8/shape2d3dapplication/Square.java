package day8.shape2d3dapplication;

public class Square extends Shape implements Shape2D
{
	double side;
	
	public Square(String colour, double side)
	{
		super(colour);
		this.side = side;
	}

	@Override
	public double getArea()
	{
		return Math.pow(side, 2);
	}

	@Override
	public double getPerimeter()
	{
		return 4.0*side;
	}

	@Override
	public String toString() {
		return "Square [ Side = " + side + ", Colour = " + colour + ", Area = " + df.format(getArea()) + ", Perimeter = "
				+ df.format(getPerimeter()) + " ]";
	}
}
