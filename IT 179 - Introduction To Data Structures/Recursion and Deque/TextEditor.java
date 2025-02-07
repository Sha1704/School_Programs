/*
 * Created on: Apr 4, 2024
 *
 * ULID: <sadibos>
 * Class: IT 179 
 */
package edu.ilstu;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <This is a TextEditor class with a Deque named textHistory that stores the history
of text changes>
 *
 * @author <Adiboshi Shalom;
 *
 */
public class TextEditor
{
	private Deque<String> textHistory;
	
	public TextEditor()
	{
		textHistory = new ArrayDeque<>();
	}
	public static void main(String[] args)
	{
		TextEditor t1 = new TextEditor();
		t1.insert("First Word");
		t1.getText();
		t1.insert("Second Word");
		t1.getText();
		t1.undo();
		t1.getText();
	}
	public void insert(String text)
	{
		textHistory.add(text);
	}
	public void getText()
	{
		String text = textHistory.peekLast();
		System.out.println(text);
	}
	public void undo()
	{
		textHistory.removeLast();
	}
}
