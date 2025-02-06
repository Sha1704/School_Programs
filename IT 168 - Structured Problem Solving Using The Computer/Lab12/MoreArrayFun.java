/*
 * Created on: Nov 14, 2023
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
import java.util.Scanner;

public class MoreArrayFun
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		ArrayManager a1 = new ArrayManager();
		a1.fillArray();
		System.out.println("Smallest value in the array " + a1.findSmallestValue());
		System.out.println("Largest value in the array " + a1.findLargestValue());

		int val = 0;

		while (val != -999)
		{
			System.out.println("Enter a value to look for: (Enter -999 to quit)");
			val = scan.nextInt();
			if (a1.findIndex(val) == -1)
			{
				System.out.println("Not found");
			} else
			{
				System.out.println(val + " can be found at index " + a1.findIndex(val));
			}
		}
	}

}
