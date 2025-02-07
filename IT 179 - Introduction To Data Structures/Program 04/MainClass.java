/*
 * Created on: Mar 25, 2024
 *
 * ULID: <sadibos>
 * Class: IT 179 
 */
package edu.ilstu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * <This is the main class, it runs the snakes and ladders game>
 *
 * @author <Adiboshi Shalom;
 *
 */
public class MainClass
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Welcome to the snakes and ladders game");
		
		try
		{
			System.out.print("How many players are playing the game: ");
			int numPlay = scan.nextInt();
			
			while (numPlay < 1)
			{
				System.out.print("Number of players should be at least 1, please enter the number of players again: ");
				numPlay = scan.nextInt();
			}
			Game g1 = new Game(numPlay);
			g1.play();
			
			//test cases
			//testOutOfBoard(g1);
			//behindBoard(g1);
			//testJumpValue(g1);
		}
		catch (InputMismatchException e)
		{
			System.out.print("You have entered the wrong input, please restart the program.");
		}
	}
	
	public static void testOutOfBoard(Game g)
	{
		System.out.println("Testing if player jumps out of board");
		g.move(0, 200);
		g.play();
	}
	
	public static void behindBoard(Game g)
	{
		System.out.println("Testing if player goes behind board");
		g.move(0, -50);
		g.play();
	}
	
	public static void testJumpValue(Game g)
	{
		System.out.println("Testing what happens if the jump value is positive of negative");
		g.move(0, 15);
		g.move(1, -20);
		g.play();
	}
}
