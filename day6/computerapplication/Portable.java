package day6.computerapplication;

public class Portable extends Computer
{
	int batteryCapacity=0;		// Instance variable
	
	// Constructor of Portable with parameter variable operatingSystem
	public Portable(String operatingSystem)
	{
		super(operatingSystem);		// Inherited attribute from Computer
	}
	
	public int getBatteryCapacity()		// Method to retrieve the battery capacity value
	{
		return batteryCapacity;		// Return the battery capacity value
	}
	
	public void chargeBattery(int percentage)	// Charge the battery by the parameter percentage
	{
		batteryCapacity = batteryCapacity+percentage;
		
		if(batteryCapacity>100)
		{
			batteryCapacity=100;		// Battery capacity maxed at 100%
		}
	}
	
	public void useBattery()
	{
		batteryCapacity -= 10;		// Decrease the battery by 10%
		
		if(batteryCapacity<0)
		{
			batteryCapacity=0;		// Avoid negative value on battery capacity
		}
	}
}
