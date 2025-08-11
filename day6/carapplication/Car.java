package day6.carapplication;

public class Car
{
	// List down attributes
	String brand;
	String model;
	String colour;
	double engineSize;
	int numberOfDoors;
	double currentSpeed=0;
	
	Wheels wheels;			// Adding wheels to your car
	
	@Override
	public String toString() {
		return "[ Brand = " + brand + ", Model = " + model + ", Colour = " + colour + ", Engine Size = " + engineSize
				+ ", Number of Doors = " + numberOfDoors + " ]";
	}
	
	public void pressAccelerator()
	{
		currentSpeed+=10;		// Increase the current speed by 10
	}
	
	public void pressBrake()
	{
		currentSpeed-=5;		// Decrease the current speed by 5
		
		if(currentSpeed<0)
		{
			currentSpeed=0;		// Speed stays 0, no negative
		}
	}
}
