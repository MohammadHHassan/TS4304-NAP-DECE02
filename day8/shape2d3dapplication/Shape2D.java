package day8.shape2d3dapplication;

public interface Shape2D		// Pure abstraction
{
	// Pure abstraction means completely hiding of implementation details
	// using abstract methods.
	
	public abstract double getArea();			// Method to get the area value
	public abstract double getPerimeter();		// Method to get the perimeter value
}
