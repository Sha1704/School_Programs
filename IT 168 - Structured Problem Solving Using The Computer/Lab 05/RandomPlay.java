/*
 * Created on: Sep 19, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Random;

/**
 * <This program compares two randomly generated numbers>
 *
 * @author <Shalom Adiboshi and Julio Cebrero and Nick Himmell.;
 *
 */
public class RandomPlay
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Random ran = new Random();
		int num1;
		int num2;
		num1 = ran.nextInt(201) + 1;
		System.out.println(num1);
		if (num1 % 2 == 0)
		{
			System.out.println("Number 1 is even");
		} else
		{
			System.out.println("Number 1 is odd");
		}
		if (num1 > 100)
		{
			System.out.println("Number 1 is large");
		} else
		{
			System.out.println("Number 1 is small");
		}
		num2 = ran.nextInt(201) + 1;
		System.out.println(num2);
		if (num2 > num1)
		{
			System.out.println("Number 2 is larger than number 1");
		} else
		{
			System.out.println("Number 2 is not larger than number 1");
		}

	}

}
