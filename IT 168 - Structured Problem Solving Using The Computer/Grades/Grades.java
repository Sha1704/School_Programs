/**
 * 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * @author sadibos Adiboshi Shalom
 */
public class Grades {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int [] student;
		String grade = null;
		int score = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Please enter the number of students: ");
		int stu = scan.nextInt();
		student = new int[stu];
		
		
		for (int i = 1; i <= student.length; i++)
		{
			System.out.print("Please enter Score for student " + i + ": ");
			score = scan.nextInt();
			if(score <= 60)
			{
				grade = "F";
			}
			else if(score <= 69)
			{
				grade = "D";
			}
			else if(score <= 79)
			{
				grade = "C";
			}
			else if(score <= 89)
			{
				grade = "B";
			}
			else if(score >= 90)
			{
				grade = "A";
			}
		}
		
		System.out.println("Student \t Score \t Grade" );
		for (int i = 1; i <= student.length; i++)
		{
			System.out.println(i + "\t \t " + score + "\t " + grade);
		}
	}

}
