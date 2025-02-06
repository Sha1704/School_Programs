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
 * @author <Shalom Adiboshi, Artjom Kuzennoi;
 *
 */
public class Time
{
	private int hours;
	private int minutes;

	/**
	 * 
	 */
	public Time()
	{
		hours = 0;
		minutes = 0;
	}

	public Time(int hours, int minutes)
	{
		if (!((hours < 0 || hours > 23) || (minutes < 0 || minutes > 59)))
		{
			this.hours = hours;
			this.minutes = minutes;
		} else
		{
			hours = 0;
			minutes = 0;
		}
	}

	public Time(int hours, int minutes, String meridian)
	{

		if (!((this.hours < 0 && this.hours > 11) || (this.minutes < 0 && this.minutes > 59)))
		{
			this.hours = hours;
			this.minutes = minutes;
		} else
		{
			this.hours = 0;
			this.minutes = 0;
		}

		if (meridian.toLowerCase().equals("pm"))
		{
			this.hours += 12;
		}
	}

	public int getHours()
	{
		return hours;
	}

	public int getMinutes()
	{
		return minutes;
	}

	public void setHours(int hours)
	{
		if (!(hours < 0 || hours > 23))
			this.hours = hours;
	}

	public void setMinutes(int minutes)
	{
		if (!(minutes < 0 || minutes > 23))
			this.minutes = minutes;
	}

	public boolean equals(Time a)
	{
		if (a.getHours() == hours && a.getMinutes() == minutes)
			return true;
		else
			return false;

	}

	public String toString()
	{
		if (this.minutes < 10 && this.minutes >= 0)
		{
			String result = this.hours + ":" + "0" + this.minutes;
			return result;
		} else
		{
			String result = this.hours + ":" + this.minutes;
			return result;
		}
	}

	public String get12HourTime()
	{
		if (hours > 12)
		{
			return (this.hours - 12) + ":" + this.minutes + " P.M.";
		} else
			return this.hours + ":" + this.minutes + " A.M.";
	}
}
