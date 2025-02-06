/*
 * Created on: Oct 14, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author <Shalom Adiboshi;
 *
 */
public class NavyGunnerHelper
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int muzzleVelocity, distanceToShip, gunMuzzleAngle;
		double shipRange, minRange, maxRange;
		boolean shipHit = false;
		final double GRAVITY = 9.8;
		gunMuzzleAngle = 1;

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to the naval gunnery helper");
		System.out.print("Enter the muzzle velocity (between 500 and 1000): ");
		muzzleVelocity = scan.nextInt();

		// validate input
		while (!(muzzleVelocity >= 500 && muzzleVelocity <= 1000))
		{
			System.out.print("The input is invalid. Enter a muzzle velocity within the range of 500-1000: ");
			muzzleVelocity = scan.nextInt();
		}

		while (muzzleVelocity != -1)
		{
			System.out.print("Enter the distance to the enemy ship in meters: ");
			distanceToShip = scan.nextInt();

			while (gunMuzzleAngle <= 45)
			{
				shipRange = (muzzleVelocity * muzzleVelocity) / GRAVITY * Math.sin(Math.toRadians(2 * gunMuzzleAngle));
				maxRange = distanceToShip + 100;
				minRange = distanceToShip - 100;

				System.out.println("With the gun at angle " + gunMuzzleAngle + " the projectile will travel "
						+ shipRange + " meters, so the enemy ship will not be hit.");

				if (shipRange >= minRange && shipRange <= maxRange)
				{
					System.out.println("With the gun at angle " + gunMuzzleAngle + " the projectile will travel "
							+ shipRange + " meters, and hit the enemy ship.");
					System.out.println("To hit the target the gun should be set at " + gunMuzzleAngle + " degrees");
					shipHit = true;
				}
				gunMuzzleAngle += 5;
			}
			if (!shipHit)
			{
				System.out.println("The enemy ship cannot be hit at this distance");
			}
			System.out.print("Enter -1 to quit or 10 to continue: ");
			muzzleVelocity = scan.nextInt();
		}
		System.out.println("Naval Gunnery Helper Ended.");
	}
}