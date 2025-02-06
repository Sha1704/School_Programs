/*
 * Created on: Sep 23, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Random;
/**
 * <This program prints out a table showing race results for the top 3 racers from the NASCAR Indy 500.>
 *
 * @author <Shalom Adiboshi;
 *
 */
import java.util.Scanner;

public class Indy500RaceResults
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String firstName, firstName2, firstName3, lastName, lastName2, lastName3, carType, carType2, carType3;
		int racerNumber, racerNumber2, racerNumber3, lapsCompleted, lapsCompleted2, lapsCompleted3;
		double lapEarnings, racerEarnings, milageBonus, milageBonus2, milageBonus3, totalMiles, totalMiles2,
				totalMiles3, baseWinnings, baseWinnings2, baseWinnings3, netWinnings, netWinnings2, netWinnings3;
		final double LAP_DISTANCE = 2.5;
		final int FULL_RACE_BONUS_LAPS = 200;
		final double EARNINGS_PER_LAP = 25.00;
		final double ENTRY_FEE_PER_RACER = 150.00;
		final int BONUS_FOR_COMPLETION = 18000;
		final int FORD_BONUS = 3000;

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		racerNumber = rand.nextInt(5001) + 1;
		racerNumber2 = rand.nextInt(5001) + 1;
		racerNumber3 = rand.nextInt(5001) + 1;

		milageBonus = 0;
		milageBonus2 = 0;
		milageBonus3 = 0;

		System.out.println("Welcome to the NASCAR Indy 500!");

		System.out.print("Please enter the racer's first name: ");
		firstName = scan.next();
		System.out.print("Please enter the racer's last name: ");
		lastName = scan.next();
		System.out.print("Please enter the number of laps completed: ");
		lapsCompleted = scan.nextInt();
		System.out.print("Please enter the racer's vehicle make: ");
		carType = scan.next();

		System.out.print("Please enter the racer's first name: ");
		firstName2 = scan.next();
		System.out.print("Please enter the racer's last name: ");
		lastName2 = scan.next();
		System.out.print("Please enter the number of laps completed: ");
		lapsCompleted2 = scan.nextInt();
		System.out.print("Please enter the racer's vehicle make: ");
		carType2 = scan.next();

		System.out.print("Please enter the racer's first name: ");
		firstName3 = scan.next();
		System.out.print("Please enter the racer's last name: ");
		lastName3 = scan.next();
		System.out.print("Please enter the number of laps completed: ");
		lapsCompleted3 = scan.nextInt();
		System.out.print("Please enter the racer's vehicle make: ");
		carType3 = scan.next();

		totalMiles = lapsCompleted * LAP_DISTANCE;
		if (lapsCompleted > 151)
		{
			baseWinnings = (EARNINGS_PER_LAP * lapsCompleted) * 2.0;
		} else if (lapsCompleted > 101)
		{
			baseWinnings = (EARNINGS_PER_LAP * lapsCompleted) * 1.75;
		} else if (lapsCompleted > 51)
		{
			baseWinnings = (EARNINGS_PER_LAP * lapsCompleted) * 1.5;
		} else
		{
			baseWinnings = (EARNINGS_PER_LAP * lapsCompleted);
		}

		if (lapsCompleted == FULL_RACE_BONUS_LAPS)
		{
			milageBonus += 18000;
		}

		if (carType.toLowerCase().equals("ford") && lapsCompleted == FULL_RACE_BONUS_LAPS)
		{
			milageBonus += FORD_BONUS;
		}

		netWinnings = baseWinnings + milageBonus - ENTRY_FEE_PER_RACER;

		totalMiles2 = lapsCompleted2 * LAP_DISTANCE;

		if (lapsCompleted2 > 151)
		{
			baseWinnings2 = (EARNINGS_PER_LAP * lapsCompleted2) * 2.0;
		} else if (lapsCompleted > 101)
		{
			baseWinnings2 = (EARNINGS_PER_LAP * lapsCompleted2) * 1.75;
		} else if (lapsCompleted2 > 51)
		{
			baseWinnings2 = (EARNINGS_PER_LAP * lapsCompleted2) * 1.5;
		} else
		{
			baseWinnings2 = (EARNINGS_PER_LAP * lapsCompleted2);
		}

		if (lapsCompleted2 == FULL_RACE_BONUS_LAPS)
		{
			milageBonus2 += 18000;
		}

		if (carType2.toLowerCase().equals("ford") && lapsCompleted2 == FULL_RACE_BONUS_LAPS)
		{
			milageBonus2 += FORD_BONUS;
		}

		netWinnings2 = baseWinnings2 + milageBonus2 - ENTRY_FEE_PER_RACER;

		totalMiles3 = lapsCompleted3 * LAP_DISTANCE;

		if (lapsCompleted3 > 151)
		{
			baseWinnings3 = (EARNINGS_PER_LAP * lapsCompleted3) * 2.0;
		} else if (lapsCompleted3 > 101)
		{
			baseWinnings3 = (EARNINGS_PER_LAP * lapsCompleted3) * 1.75;
		} else if (lapsCompleted3 > 51)
		{
			baseWinnings3 = (EARNINGS_PER_LAP * lapsCompleted3) * 1.5;
		} else
		{
			baseWinnings3 = (EARNINGS_PER_LAP * lapsCompleted3);
		}

		if (lapsCompleted3 == FULL_RACE_BONUS_LAPS)
		{
			milageBonus3 += 18000;
		}

		if (carType3.toLowerCase().equals("ford") && lapsCompleted3 == FULL_RACE_BONUS_LAPS)
		{
			milageBonus3 += FORD_BONUS;
		}

		netWinnings3 = baseWinnings3 + milageBonus3 - ENTRY_FEE_PER_RACER;

		System.out.println("NASCAR Indy 500 Race Results");

		System.out.printf("%-7s %-17s %-8s %-6s %-7s %-7s %-7s %-7s %n", "Bib #", "Name ", "Make ", "Laps", "Miles",
				"Base Winnings", "Bonus", "Net Winnings");

		System.out.printf("%-7d %-17s %-8s %-6d %-7.2f $%-12.2f $%-7.2f $%7.2f %n", racerNumber,
				(firstName.toLowerCase() + " " + lastName.toLowerCase()), carType, lapsCompleted, totalMiles,
				baseWinnings, milageBonus, netWinnings);

		System.out.printf("%-7d %-17s %-8s %-6d %-7.2f $%-12.2f $%-7.2f $%7.2f %n", racerNumber2,
				(firstName2.toLowerCase() + " " + lastName2.toLowerCase()), carType2, lapsCompleted2, totalMiles2,
				baseWinnings2, milageBonus2, netWinnings2);

		System.out.printf("%-7d %-17s %-8s %-6d %-7.2f $%-12.2f $%-7.2f $%7.2f %n", racerNumber3,
				(firstName3.toLowerCase() + " " + lastName3.toLowerCase()), carType3, lapsCompleted3, totalMiles3,
				baseWinnings3, milageBonus3, netWinnings3);

		System.out.println("Total Miles Covered: " + (totalMiles + totalMiles2 + totalMiles3));
		System.out.println("Total Base Winnings: $" + (baseWinnings + baseWinnings2 + baseWinnings3));
		System.out.println("Total Bonus Winnings: $" + (milageBonus + milageBonus2 + milageBonus3));
		System.out.println("Total Net Winnings: $" + (netWinnings + netWinnings2 + netWinnings3));
	}

}
