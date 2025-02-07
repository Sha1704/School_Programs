/*
 * Created on: Apr 29, 2024
 *
 * ULID: <sadibos>
 * Class: IT 179 
 */
package edu.ilstu;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;

/**
 * <This is the main class, it has everything needed to run the program, it also has a build tree adn decode method>
 *
 * @author <Adiboshi Shalom;
 *
 */
public class MainClass
{
	private static MorseTree mt;
	
	public static void main(String[] args)
	{
		mt = buildTree("morse_codes.txt");
		
		if (mt == null)
		{
			System.out.println("Can't build tree");
			return;
		}
		try
		{
			Scanner scan = new Scanner (System.in);
			System.out.println("Enter message or stop to exit: ");
			
			while (scan.hasNextLine())
			{
				
				String code = scan.nextLine().trim();
				
				if (code.equalsIgnoreCase("stop"))
				{
					System.out.println("Thank you for using a decoder");
					break;
				}
				
				String decodedMessage = decode(code);
				if (decodedMessage.equals(""))
				{
					System.out.println("This morse code is not valid");
				}
				else
				{
					System.out.println("Decoded code: " + decodedMessage);
				}
				System.out.println("Enter another message or stop to exit: ");
			}
		}
		catch (InputMismatchException e)
		{
			System.out.println("Input mismatch " + e.getMessage());
		}
	}
	
	public static MorseTree buildTree(String fileName)
	{
		MorseTree mt2 = new MorseTree();
		try
		{
			Scanner scan = new Scanner (new File(fileName));
			while (scan.hasNextLine())
			{
				String line = scan.nextLine();
				char letter = line.charAt(0);
				String code = line.substring(2);
				mt2.insert(letter, code);
			}
			return mt2;
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found " + e.getMessage());
			return null;
		}
	}
	
	private static String decode(String code)
	{
		StringBuilder s1 = new StringBuilder();
		String [] alphabet = code.split(" ");
		
		for (int i = 0; i < alphabet.length; i++)
		{
			s1.append(mt.decodeMessage(alphabet[i]));
		}
		return s1.toString();
	}

}
