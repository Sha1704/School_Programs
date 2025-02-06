/**
 * 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * @author sadibos Adiboshi Shalom
 */
public class SumNeg {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int sum = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Please enter a number (-999 to quit): ");
		int num = scan.nextInt();
		
		while (num != -999)
		{
			if (num < 0)
			{
				sum += num;
			}
			
			System.out.print("Please enter a number (-999 to quit): ");
			num = scan.nextInt();
		}
		System.out.println("The sum of the negative values is: " + sum);
	}

}
