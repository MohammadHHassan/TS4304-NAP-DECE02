package day8.shape2d3dapplication;

import java.text.DecimalFormat;			// Library for decimal format

public abstract class Shape				// Abstract class Shape. Cannot instantiate
{
	DecimalFormat df = new DecimalFormat("#.##");	// Declare decimal format in 2 d.p
	
	String colour;						// Shape attribute declaration. Instance variable

	public Shape(String colour) 		// Shape constructor with parameter colour
	{
		this.colour = colour;			// Store from parameter to instance variable
	}
}
