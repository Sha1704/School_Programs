/*
 * Created on: Apr 3, 2024
 *
 * ULID: <sadibos>
 * Class: IT 179 
 */
package edu.ilstu;

/**
 * <This is a recursive class that prints my name repeatedly>
 *
 * @author <Adiboshi Shalom;
 *
 */
public class NamePrinter
{
	public static void main(String[] args)
	{
		printName(10);
	}
	
	public static void printName(int count)
	{
		System.out.println("My name is Adiboshi Shalom");
		
		if (count != 1) // added to code to repair it
		{
			printName(count -1); // added to code to repair it
		}
	}
}
