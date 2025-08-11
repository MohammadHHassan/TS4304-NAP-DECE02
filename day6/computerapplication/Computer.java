package day6.computerapplication;

public class Computer
{
	String operatingSystem; // Instance variable
	boolean powerState; // Instance variable

	// Constructor for computer class with operatingSystem parameter
	public Computer(String operatingSystem) 
	{
		this.operatingSystem = operatingSystem;		// Storing from parameter variable to instance variable
		shutDown();		// Turn off power everytime computer object is created
	}
	
	public void shutDown()
	{
		powerState = false;		// Power off
	}
	
	public void bootUp()
	{
		powerState = true;		// Power on
	}
}
