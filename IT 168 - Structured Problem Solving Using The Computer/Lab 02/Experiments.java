/*
 * Created on: Aug 29, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * <insert class description here>
 *
 * @author <Shalom Adiboshi;
 *
 */
public class Experiments
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		short aShort = 6;
		long aLong = 105;
		int int1 = 10;
		int int2 = 11;
		float aFloat = 1.5f;
		double aDouble = 100.3;

		// A short cannot be converted to a long.
		// A short cannot be converted to an int.
		// A short cannot be converted to a float.
		// A short cannot be converted to a double.

		// A long can be converted to a short.
		// A long can be converted to an int.
		// A long cannot be converted to a Float.
		// A long cannot be converted to a double.

		// An int can be converted to a short.
		// An int cannot be converted to a long.
		// An int cannot be converted to a float.
		// An int cannot be converted to a double.

		// A float can be converted to a short.
		// A float can be converted to a long.
		// A float can be converted to an int.
		// A float cannot be converted to a double.

		// A double can be converted to a short.
		// A double can be converted to a long.
		// A double can be converted to an int.
		// A double can be converted to a float.

		aDouble = int2 / 2;
		System.out.println("aDouble = int2 / 2; results in: " + aDouble);

		aDouble = int2 / 2.0;
		System.out.println("aDouble = int2 / 2.0; results in: " + aDouble);

		aLong = int1 % 2;
		System.out.println("aLong = int1 % 2; results in: " + aLong);

		aLong = int1 % 4;
		System.out.println("aLong = int1 % 4; results in: " + aLong);

		int1 = int2 % 2;
		System.out.println("int1 = int2 % 2; results in: " + int1);

		int1 = int2 % 3;
		System.out.println("int1 = int2 % 3; results in: " + int1);

		int1 = int2 % 4;
		System.out.println("int1 = int2 % 4; results in: " + int1);

		int1 = 2 + 3 * 4;
		System.out.println("2 + 3 * 4; results in: " + int1);

		int1 = (2 + 3) * 4;
		System.out.println("(2 + 3) * 4; results in: " + int1);

	}

}
