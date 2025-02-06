/*
 * Created on: Sep 19, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <This programs reads a web address and checks if it's a
 * government,university,business,organization or web address of another entity>
 *
 * @author <Shalom Adiboshi and Julio Cebrero and Nick Himmell;
 *
 */
public class URLChecker
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String webAddress;
		System.out.print("Enter web address: ");
		webAddress = input.nextLine();
		if (webAddress.substring(webAddress.length() - 4, webAddress.length()).equals(".gov"))
		{
			System.out.println("Its a government web address");
		} else if (webAddress.substring(webAddress.length() - 4, webAddress.length()).equals(".edu"))
		{
			System.out.println("Its a university web address");
		} else if (webAddress.substring(webAddress.length() - 4, webAddress.length()).equals(".com"))
		{
			System.out.println("Its a business web address");
		} else if (webAddress.substring(webAddress.length() - 4, webAddress.length()).equals(".org"))
		{
			System.out.println("Its an organization web address");
		} else
		{
			System.out.println("Another entity web address");
		}

	}

}
