/*
 * Created on: Sep 12, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Random;
/**
 * <insert class description here>
 *
 * @author <Shalom Adiboshi;
 *
 */
import java.util.Scanner;

public class Project01
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Welcome to the password vault!");
		System.out.println("Let's create a new password entry.");

		String webName;
		String userName;
		String email;
		String note;
		String password;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the website name: ");
		webName = scan.nextLine();

		System.out.print("Enter the username: ");
		userName = scan.nextLine();

		System.out.print("Enter the email: ");
		email = scan.nextLine();

		System.out.print("Add a note: ");
		note = scan.nextLine();

		System.out.println("Item Summary ");

		System.out.println("Website Name: " + webName);
		System.out.println("Website URL: https://www." + webName.toLowerCase() + ".net");
		System.out.println("Email: " + email);
		System.out.println("Username: " + userName);

		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		char letter1;
		char letter2;
		char letter3;
		char letter4;
		char letter5;
		String passwordString;
		Random rand = new Random();

		num1 = rand.nextInt(10);
		num2 = rand.nextInt(10);
		num3 = rand.nextInt(10);
		num4 = rand.nextInt(10);
		num5 = rand.nextInt(10);

		letter1 = (char) (rand.nextInt(26) + 65);
		letter2 = (char) (rand.nextInt(26) + 97);
		letter3 = (char) (rand.nextInt(26) + 65);
		letter4 = (char) (rand.nextInt(26) + 97);
		letter5 = (char) (rand.nextInt(26) + 65);

		password = Integer.toString(num1) + Integer.toString(num2) + Integer.toString(num3) + letter1 + letter2
				+ letter3 + letter4 + letter5 + Integer.toString(num4) + Integer.toString(num5);
		System.out.print(password);

	}

}
