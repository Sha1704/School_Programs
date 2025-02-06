/*
 * Created on: Oct 10, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * <this class is about to find calculations for a circles area, diameter, and
 * circumference>
 *
 * @author <Shalom Adiboshi and Sarah Akanbi;
 *
 */
public class Circle
{
	private double radius;
	public final double PI = 3.14159;

	/**
	 * Creates a circle object that takes in radius.
	 *
	 * @param the radius of the circle to be created
	 * 
	 */
	public Circle(double radius)
	{
		this.radius = radius;
	}

	/**
	 * Returns the radius of a given circle.
	 *
	 * 
	 * @return the radius of the circle
	 */
	public double getRadius()
	{
		return this.radius;
	}

	/**
	 * sets the radius for the circle
	 *
	 * @param the new radius of the circle
	 * 
	 */

	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	/**
	 * Calculate the area of the circle
	 *
	 * 
	 * @return area of the circle as a double
	 */

	public double calculateArea()
	{
		return PI * (radius * radius);
	}

	/**
	 * Calculates the diameter of the circle
	 *
	 * 
	 * @return diameter of the circle as a double
	 */
	public double calculateDiameter()
	{
		return radius * 2;
	}

	/**
	 * Calculate the circumference of a circle
	 *
	 * 
	 * @return circumference of the circle as a double
	 */

	public double calculateCircumfrence()
	{
		return 2 * PI * radius;
	}

	public String toString()
	{
		String result = "Area = " + this.calculateArea() + "\nDiameter = " + this.calculateDiameter()
				+ "\nCircumference = " + this.calculateCircumfrence();
		return result;
	}
}
