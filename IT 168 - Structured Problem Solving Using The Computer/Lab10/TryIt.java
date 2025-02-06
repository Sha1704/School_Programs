/*
 * Created on: Oct 24, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * <1. We should use the equals method to determine if 2 strings are the same.
 * 2. yes 3. no>
 *
 * @author Shalom Adiboshi and Mike Veleta;
 *
 */
public class TryIt
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String s1 = "Bob";
		String s2 = "Larry";
		String s3 = "Bob";

		System.out.println("Testing if == works for identical string. ");
		System.out.println("Expected: true ");
		System.out.println("Actual: " + (s1 == s3));

		System.out.println("Testing if == works for non-identical string. ");
		System.out.println("Expected: false ");
		System.out.println("Actual: " + (s1 == s2));

		System.out.println("Testing if .equals works for identical string. ");
		System.out.println("Expected: true ");
		System.out.println("Actual: " + (s1.equals(s3)));

		System.out.println("Testing if .equals works for non-identical string. ");
		System.out.println("Expected: false ");
		System.out.println("Actual: " + (s1.equals(s2)));

		String s4 = new String("Bob");
		String s5 = new String("Larry");
		String s6 = new String("Bob");

		System.out.println("Testing if == works for identical string. ");
		System.out.println("Expected: true ");
		System.out.println("Actual: " + (s4 == s6));

		System.out.println("Testing if == works for non-identical string. ");
		System.out.println("Expected: false ");
		System.out.println("Actual: " + (s4 == s5));

		System.out.println("Testing if .equals works for identical string. ");
		System.out.println("Expected: true ");
		System.out.println("Actual: " + (s4.equals(s6)));

		System.out.println("Testing if .equals works for non-identical string. ");
		System.out.println("Expected: false ");
		System.out.println("Actual: " + (s4.equals(s5)));

		testTempVars();
	}

	private static void testTempVars()
	{
		BankAccount myAccount = new BankAccount(700, "Yang Wu", "765432");
		System.out.println("Original value of bank account: ");
		System.out.println(myAccount);
		objectPassing(myAccount);
		System.out.println("Value of bank account in objectPassing: ");
		System.out.println(myAccount);

		int originalValue = 107;
		System.out.println(originalValue);
		primitivePassing(originalValue);
		System.out.println("Value of original int variable after primitivePassing executes");
		System.out.println(originalValue);
	}

	private static void objectPassing(BankAccount acct)
	{
		acct.deposit(200);
	}

	private static void primitivePassing(int param)
	{
		System.out.println("primitivePassing value: " + (param - 7));
	}
}
