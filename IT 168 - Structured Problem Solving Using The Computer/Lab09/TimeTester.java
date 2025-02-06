/*
 * Created on: Oct 17, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * <insert class description here>
 *
 * @author <Shalom Adiboshi & Artjom Kuzennoi;
 *
 */
public class TimeTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		System.out.println("Code: Time time1 = new Time(7,35);");
		System.out.println("Expected Result: Hours: 7 Minutes: 35");
		Time time1 = new Time(7, 35);
		System.out.println(time1);

		System.out.println("Code: Time time2 = new Time(15,50);");
		System.out.println("Expected Result: Hours: 15 Minutes: 50");
		Time time2 = new Time(15, 50);
		System.out.println(time2);

		System.out.println("Code: Time time3 = new Time(29,70);");
		System.out.println("Expected Result: Hours: 0 Minutes: 0");
		Time time3 = new Time(29, 70);
		System.out.println(time3);

		System.out.println("time2.setMinutes(99);");
		System.out.println("Expected Result: Object not changed, because invalid input");
		time2.setMinutes(99);
		System.out.println(time2);

		System.out.println("time3.setHours(4);");
		System.out.println("Expected Result: 4:00");
		time3.setHours(4);
		System.out.println(time3);

		System.out.println("time2.equals(time1);");
		System.out.println("Expected Result: false");
		System.out.println(time2.equals(time1));

		System.out.println("time2.equals(time4);");
		System.out.println("Expected Result: true");
		Time time4 = new Time(3, 50, "PM");
		System.out.println(time2.equals(time4));

		System.out.println("time2.get12HourTime();");
		System.out.println("Expected Result: 3:50 PM");
		System.out.println(time2.get12HourTime());

		System.out.println("time1.get12HourTime();");
		System.out.println("Expected Result: 7:35 AM");
		System.out.println(time1.get12HourTime());

	}

}
