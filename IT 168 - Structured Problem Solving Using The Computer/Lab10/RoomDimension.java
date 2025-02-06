/*
 * Created on: Oct 24, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * <This class holds the relevant data that is needed to create the dimensions
 * of the room.
 *
 * @author <Shalom Adiboshi and Mike Veleta;
 *
 */
public class RoomDimension
{
	private double length, width;

	public RoomDimension(double length, double width)
	{
		this.length = length;
		this.width = width;
	}

	public double getLength()
	{
		return length;
	}

	public double getWidth()
	{
		return width;
	}

	public double getArea()
	{
		return length * width;
	}

	public String toString()
	{
		return "The length of the room is: " + length + " and the width of the room is: " + width;
	}
}
