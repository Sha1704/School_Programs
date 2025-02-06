/*
 * Created on: Oct 3, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * <This code calculated the number of students who took an exam as well as the min score, max score, average and students with an A>
 *
 * @author <Shalom Adiboshi, Jasmine Ogufere;
 *
 */
import java.util.Scanner;

public class ExamCalculations
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int score, count, student, totalScore, min, max, studentsWithA;
		double average;
		student = 0;
		max = 0;
		average = 0;
		totalScore = 0;
		count = 0;
		studentsWithA = 0;

		System.out.print("Enter a score: ");
		score = scan.nextInt();
		min = score;

		while (score < 0 || score > 100)
		{
			System.out.println("The score is invalid");
			System.out.print("Enter a score form 0 to 100 (Enter -1 to stop): ");
			score = scan.nextInt();
		}

		while (score != -1)
		{
			totalScore = totalScore + score;
			count++;
			average = totalScore / count;

			if (score > max)
			{
				max = score;
			}
			if (score < min)
			{
				min = score;
			}
			if (score >= 90)
			{
				studentsWithA++;
			}

			System.out.println("Enter another score form 0 to 100: ");
			score = scan.nextInt();
			student++;

		}

		System.out.println("Number of students " + student);
		System.out.println("Minimum Score: " + min);
		System.out.println("Maximum Score: " + max);
		System.out.println("Average Score: " + average);
		System.out.println("students with A: " + studentsWithA);
	}

}
