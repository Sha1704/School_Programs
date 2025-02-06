/*
 * Created on: Oct 24, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * <Carpet Sales gets total cost of carpet from room dimensions.
 *
 * @author <Shalom Adiboshi and Mike Veleta;
 *
 */
public class CarpetSales
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		double width, length, pricePerSquareFoot;

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.print("Enter the length of the room: ");
		length = scan.nextDouble();

		System.out.print("Enter the Width of the room: ");
		width = scan.nextDouble();

		System.out.print("What is the Price per square foot of the designed carpet: ");
		pricePerSquareFoot = scan.nextDouble();

		RoomDimension rd1 = new RoomDimension(length, width);
		RoomCarpet r1 = new RoomCarpet(rd1, pricePerSquareFoot);

		System.out.println(r1);
	}

}
