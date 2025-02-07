/*
 * Created on: Mar 12, 2024
 *
 * ULID: <sadibos>
 * Class: IT 179 
 */
package edu.ilstu;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 * <This class contains all the necessary methods to run the snakes and ladders
 * game>
 *
 * @author <Adiboshi Shalom;
 *
 */
public class Game
{
	private Square start; /// Square reference to the starting square in the board
	private ArrayList <Square> position; //An ArrayList of square references for the players positions
	private int currentPlayer;
	
	private static class Square
	{
		private Square previous, next; // Reference to previous and next square
		private int current, jumpValue; // current square number and jump value
		
		public Square(int squareNumber, int jumpValue, Square previousSquare)
		{
			this.jumpValue = jumpValue;
			previous = previousSquare;
			current = squareNumber;
		}
	}
	
	public Game(int numPlayers)
	{
		position = new ArrayList<>();
		generateBoard();
		
		for (int i = 0; i < numPlayers; i++) //Takes number of players and instantiates the players ArrayList with that number
		{
			position.add(start);
		}
	}
	
	private void generateBoard()
	{
		Random rand = new Random();
		int goldenSquare = rand.nextInt(1, 101);
		Square temp = null;
		int jumpValue = 0;
		
		for (int i = 1; i<=100; i++)
		{
			int randNum = rand.nextInt(1, 101);
			
			if (randNum <= 75)
			{
				jumpValue = 0;	
			}
			else
			{
				int high = 100 - i;
				int low = 1- i;
				jumpValue = rand.nextInt(low, high+1);
			}
			
			if (start == null)
			{
				Square s1 = new Square(i, jumpValue, null);
				start = s1;
				temp = start;
			}
			else
			{
				while (temp.next != null)
				{
					temp = temp.next;
				}
				Square s2 = new Square(i, jumpValue, temp);
				temp.next = s2;
			}
		}		
	}
	
	public void play()
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		boolean playerWin = false;
		
		while (playerWin == false)
		{
			System.out.println("Player " + (currentPlayer+1) + " press any key to roll the die");
			String input = scan.next();
			System.out.println("Rolling die");
			
			boolean win = move(currentPlayer, rand.nextInt(1, 7));
			printBoard();
			if (win == true)
			{
				playerWin = true;
				System.out.println("Player " + (currentPlayer + 1) + " has won the game.");
			}
			else if (currentPlayer < position.size()-1)
			{
				currentPlayer++;
			}
			else
			{
				currentPlayer = 0;
			}
		}
	}
	
	private void printBoard()
	{
		
		for (int i = 1; i <= 100; i++)
		{
			boolean print = false;
			for (int j = 0; j <position.size(); j++)
			{
				Square temp = position.get(j);
				
				if (temp.current == i)
				{
					System.out.print("p" + (j+1) + " ");
					print = true;
					break;
				}
			}
			if (print == false)
			{
				System.out.print("- ");
			}
			if (i%10 == 0)
			{
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public boolean move(int playerNumber, int move)
	{
		Square current = position.get(playerNumber);
		Square temp = current;
		int jumpVal = temp.jumpValue;
		
		for (int i = 0; i < move; i++) 
		{
			if (temp != null && temp.next!= null)
			{
				temp = temp.next;
			}
			else
			{
				break;
			}
		}
		
		
		if (jumpVal != 0)
		{
			if (jumpVal > 0)
			{
				for (int i = 0; i < jumpVal; i++) 
				{
					temp = temp.next;
				}
			}
			else
			{
				for (int i = 0; i > jumpVal; i--) 
				{
					temp = temp.previous;
				}
			}
		}
		
		if (temp != null)
		{
			position.set(playerNumber, temp);
			
			System.out.println("You rolled a: " + move);
			System.out.println("Start location: " + current.current);
			System.out.println("End location: " + temp.current);
			System.out.println("Jumps taken: " + jumpVal);
			
			if (temp.current >= 100)
			{
				return true;
			}
		}
			return false;
	}
}
