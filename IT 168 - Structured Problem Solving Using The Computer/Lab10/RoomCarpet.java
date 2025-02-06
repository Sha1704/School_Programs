/*
 * Created on: Oct 24, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * < This class holds the relevant data that is needed to create cost of carpet
 * for a room.
 *
 * @author <Shalom Adiboshi and Mike Veleta;
 *
 */
public class RoomCarpet
{
	private double costPerSquareFoot;
	private RoomDimension room;

	public RoomCarpet(RoomDimension room, double costPerSquareFoot)
	{
		this.room = room;
		this.costPerSquareFoot = costPerSquareFoot;
	}

	public double getTotalCost()
	{
		double tc = room.getArea() * costPerSquareFoot;
		return tc;
	}

	public double getCostPerSquareFoot()
	{
		return costPerSquareFoot;
	}

	public String toString()
	{
		return room.toString() + ". The price per square foot is: " + getCostPerSquareFoot()
				+ ". And the total cost of carpeting this room is " + getTotalCost();
	}
}
