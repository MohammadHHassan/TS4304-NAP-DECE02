package day8.shape2d3dapplication;

public class Cube extends Shape implements Shape3D
{
	double side;
	
	public Cube(String colour, double side)
	{
		super(colour);
		this.side = side;
	}

	@Override
	public double getSurfaceArea()
	{
		return 6.0*Math.pow(side, 2);
	}

	@Override
	public double getVolume()
	{
		return Math.pow(side, 3);
	}

	@Override
	public String toString() {
		return "Cube [ Side = " + side + ", Colour = " + colour + ", Surface Area = " + df.format(getSurfaceArea()) + ", Volume = "
				+ df.format(getVolume()) + " ]";
	}
}
