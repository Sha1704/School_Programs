/*
 * Created on: Feb 25, 2024
 *
 * ULID: <sadibos>
 * Class: IT 179 
 */
package edu.ilstu;

/**
 * <This class represents a term in a polynomial>
 *
 * @author <Adiboshi Shalom;
 *
 */
public class Term
{
	private int coefficient, exponent;

	public Term(int coefficient, int exponent)
	{
		this.coefficient = coefficient;
		this.exponent = exponent;
	}

	public int getCoefficient()
	{
		return coefficient;
	}

	public int getExponent()
	{
		return exponent;
	}

	public String toString()
	{
		String str = "";
		if (exponent == 0)
		{
			str = "" + coefficient;
		} else if (exponent == 1)
		{
			str = "" + coefficient + "x";
		} else
		{
			str = "" + coefficient + "x^" + exponent;
		}
		return str;
	}

	public Term addTerm(Term t1)
	{
		Term ter = null;
		int coSum = 0;
		if (this.getExponent() == t1.getExponent())
		{
			coSum = this.getCoefficient() + t1.getCoefficient();
			ter = new Term(coSum, this.getExponent());
		}
		return ter;
	}
}
