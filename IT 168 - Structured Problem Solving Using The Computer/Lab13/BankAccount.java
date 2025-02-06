/*
 * Filename: BankAccount.java 
 * Last modified on November 15, 2020 
 * 
 * Course: IT 168
 */
package edu.ilstu;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This is a simple bank account class.
 * 
 * @author Lewis and Loftus, Shirley White, Mary Elaine Califf and Adiboshi
 *         Shalom
 * 
 */
public class BankAccount
{
	private double balance;
	private String name;
	private String acctNum;

	/**
	 * Default constructor
	 */
	public BankAccount()
	{
		this(0, "", "");
	}

	/**
	 * @param initBal The initial balance of the account
	 * @param owner   The name on the account
	 * @param number  The account number
	 */
	public BankAccount(double initBal, String owner, String number)
	{
		this.balance = initBal;
		this.name = owner;
		this.acctNum = number;
	}

	/**
	 * Checks to see if balance is sufficient for withdrawal. If so, decrements
	 * balance by amount; if not, prints error message.
	 * 
	 * @param amount to be withdrawn
	 */
	public void withdraw(double amount)
	{
		if (this.balance <= amount)
			this.balance = this.balance - amount;
		else
			System.out.println("Insufficient funds");
	}

	/**
	 * Adds deposit amount to balance.
	 * 
	 * @param amount to be deposited
	 */
	public void deposit(double amount)
	{
		this.balance = this.balance + amount;
	}

	/**
	 * Getter for the balance
	 * 
	 * @return the current balance
	 */
	public double getBalance()
	{
		return this.balance;
	}

	/**
	 * Deducts a $10 fee
	 */
	public void chargeFee()
	{
		this.balance = this.balance - 10;
	}

	/**
	 * Setter for the name
	 * 
	 * @param newName The new name on the account
	 */
	public void setName(String newName)
	{
		this.name = newName;
	}

	public String toString()
	{
		String str = "Account holder: " + name + "\n" + "Account number: " + acctNum + "\n" + "Balance: $" + balance;
		return str;
	}

	public void read(Scanner input)
	{
		this.name = input.nextLine();
		this.acctNum = input.next();
		this.balance = input.nextDouble();
		input.nextLine();
	}

	public void write(PrintWriter output)
	{
		output.println(this.name);
		output.println(this.acctNum + " " + this.balance);
	}
}
