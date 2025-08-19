package day8.shape2d3dapplication;

public class Sphere extends Shape implements Shape3D
{
	double radius;
	
	public Sphere(String colour, double radius) 
	{
		super(colour);
		this.radius = radius;
	}

	@Override
	public double getSurfaceArea() 
	{
		return 4.0*Math.PI*Math.pow(radius, 2);
	}

	@Override
	public double getVolume() 
	{
		return (4.0/3.0)*Math.PI*Math.pow(radius, 3);
	}

	@Override
	public String toString() {
		return "Sphere [ Radius = " + radius + ", Colour = " + colour + ", Surface Area = " + df.format(getSurfaceArea())
				+ ", Volume = " + df.format(getVolume()) + " ]";
	}
}
