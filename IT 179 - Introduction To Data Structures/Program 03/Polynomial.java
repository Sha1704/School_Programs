/*
 * Created on: Feb 25, 2024
 *
 * ULID: <sadibos>
 * Class: IT 179 
 */
package edu.ilstu;

/**
 * <This class is the central class of the program, representing the actual
 * polynomial expressions>
 *
 * @author <Adiboshi Shalom;
 *
 */
public class Polynomial
{
	private Node termsHead, termsTail;

	private class Node
	{
		private Term termData;
		private Node next;

		public Node(Term t1)
		{
			termData = t1;
			next = null;
		}
	}

	public Polynomial()
	{
		termsHead = null;
		termsTail = null;
	}

	public Polynomial(String poly)
	{
		this();

		boolean flag = false;

		String[] s1 = poly.split(" ");
		for (int i = 0; i < s1.length; i++)
		{
			if (s1[i].equalsIgnoreCase("+"))
			{
				flag = false;
			} else if (s1[i].equalsIgnoreCase("-"))
			{
				flag = true;
			}

			if (s1[i].contains("x^") || s1[i].contains("X^"))
			{
				if (flag)
				{
					int coefficient = Integer.parseInt(s1[i].substring(0, s1[i].indexOf("x")));
					int exponent = Integer.parseInt(s1[i].substring(s1[i].indexOf("^") + 1));
					Term t1 = new Term(-coefficient, exponent);
					addTermToPolynomial(t1);
				} else
				{
					int coefficient = Integer.parseInt(s1[i].substring(0, s1[i].indexOf("x")));
					int exponent = Integer.parseInt(s1[i].substring(s1[i].indexOf("^") + 1));
					Term t1 = new Term(coefficient, exponent);
					addTermToPolynomial(t1);
				}
			} else if (s1[i].contains("x") || s1[i].contains("X"))
			{
				if (flag)
				{
					int coefficient = Integer.parseInt(s1[i].substring(0, s1[i].indexOf("x")));
					Term t1 = new Term(-coefficient, 1);
					addTermToPolynomial(t1);
				} else
				{
					int coefficient = Integer.parseInt(s1[i].substring(0, s1[i].indexOf("x")));
					Term t1 = new Term(coefficient, 1);
					addTermToPolynomial(t1);
				}
			} else
			{
				if (!(s1[i].equalsIgnoreCase("+") || s1[i].equalsIgnoreCase("-")))
				{
					if (flag)
					{
						int coefficient = Integer.parseInt(s1[i]);
						Term t1 = new Term(-coefficient, 0);
						addTermToPolynomial(t1);
					} else
					{
						int coefficient = Integer.parseInt(s1[i]);
						Term t1 = new Term(coefficient, 0);
						addTermToPolynomial(t1);
					}
				}
			}
		}
	}

	public void addTermToPolynomial(Term t1)
	{
		Node temp = new Node(t1);
		if (termsHead == null)
		{
			termsHead = temp;
			termsTail = temp;
		} else
		{
			termsTail.next = temp;
			termsTail = temp;
		}
	}

	public String toString()
	{
		String str = "";
		Node currentTerm = termsHead;
		boolean empty = true;

		while (currentTerm != null)
		{
			if (currentTerm.termData.getCoefficient() != 0)
			{
				empty = false;
				if (currentTerm != termsHead && currentTerm.termData.getCoefficient() > 0)
				{
					str += "+";
				}
				str += currentTerm.termData.toString();
			}
			currentTerm = currentTerm.next;
		}
		if (empty)
		{
			return "0";
		} else
		{
			return str;
		}

	}

	public Polynomial addPolynomial(Polynomial p1)
	{
		Node t1 = this.termsHead;
		Node t2 = p1.termsHead;
		String str = "";

		while (t1 != null || t2 != null)
		{
			if (t1.termData.getExponent() != t2.termData.getExponent())
			{
				if (t1.termData.getExponent() > t2.termData.getExponent())
				{
					str += t1.termData + " ";
					t1 = t1.next;

				} else if (t1.termData.getExponent() < t2.termData.getExponent())
				{
					str += t2.termData + " ";
					t2 = t2.next;
				}
			} else
			{
				Term tt2 = t1.termData.addTerm(t2.termData);
				str += tt2 + " ";
				t1 = t1.next;
				t2 = t2.next;
			}
		}

		while (t1 != null)
		{
			str += t1.termData + " ";
			t1 = t1.next;
		}

		while (t2 != null)
		{
			str += t2.termData + " ";
			t2 = t2.next;
		}

		Polynomial poly = new Polynomial(str);
		return poly;
	}
}