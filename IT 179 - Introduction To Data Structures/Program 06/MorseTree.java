/*
 * Created on: Apr 29, 2024
 *
 * ULID: <sadibos>
 * Class: IT 179 
 */
package edu.ilstu;


/**
 * <This class has the methods needed to encode and decode the morse codes>
 *
 * @author <Adiboshi Shalom;
 *
 */
public class MorseTree
{
	private Node n1;
	private class Node
	{
		private char current;
		private Node left;
		private Node right;
		
		public Node (char current)
		{
			this.current = current;
			left = null;
			right = null;
		}
	}
	
	public MorseTree()
	{
		n1 = new Node(' ');
	}

	public void insert(char c, String code)
	{
		add(n1, c,  code);
	}
	private void add(Node n1, char character, String code)
	{
		if(code.isEmpty())
		{
			n1.current = character;
			return;
		}
		
		if (!code.isEmpty() && code.charAt(0) == '.')
		{
			if (n1.left == null)
			{
				n1.left = new Node(character);
			}
			add(n1.left, character, code.substring(1));
		}
		else
		{
			if (n1.right == null)
			{
				n1.right = new Node(character);
			}
			add(n1.right, character, code.substring(1));
		}
	}
	
	public char decodeMessage(String code)
	{
		return decode(n1, code);
	}
	private char decode(Node n1, String code)
	{
		if (n1 == null)
		{
			return ' ';
		}
		
		if (code.isEmpty())
		{
			return n1.current;
		}
		
		if (code.charAt(0) == '.')
		{
			return decode(n1.left, code.substring(1));
		}
		else if (code.charAt(0) == '-')
		{
			return decode(n1.right, code.substring(1));
		}
		else
		{
			System.out.println("Your input is not morse code");
			return ' ';
		}
	}
}
