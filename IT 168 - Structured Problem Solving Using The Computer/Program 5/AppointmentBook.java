/*
 * Created on: Nov 12, 2023
 *
 * ULID: <sadibos>
 * Class: IT 168 
 */
package edu.ilstu;

/**
 * <This class is the primary working class that contains two helper methods,
 * isMunuteFree and reserveBlock.>
 *
 * @author <Shalom Adiboshi;
 *
 */
public class AppointmentBook
{
	private Period[] per;
	private static final int MAX_PERIOD = 8;

	public AppointmentBook()
	{
		per = new Period[MAX_PERIOD];
		for (int i = 0; i < per.length; i++)
		{
			per[i] = new Period();
		}
	}

	public void setPeriod(Period[] pArray)
	{
		if (pArray.length == MAX_PERIOD)
		{
			this.per = pArray;
		} else
		{
			System.out.println("Invalid number of periods");
		}
	}

	public Period[] getPeriod()
	{
		Period[] copy = new Period[per.length];
		for (int i = 0; i < per.length; i++)
		{
			copy[i] = per[i];
		}
		return copy;
	}

	public String toString()
	{
		String str = "";
		for (int i = 0; i < per.length; i++)
		{
			str = per[i].toString();
		}
		return str;
	}

	private boolean isMinuteFree(int periodAccepted, int minuite)
	{
		boolean boo = true;
		if (per[periodAccepted - 1].getAppoint()[minuite].isAvailable())
		{
			boo = true;
		} else
		{
			boo = false;
		}

		return boo;
	}

	private void reserveBlock(int period, int minute, int duration)
	{
		for (int i = minute; i < duration + minute; i++)
		{
			per[period - 1].getAppoint()[i].setAvailable(false);
		}
	}

	public int findFreeBlock(int period, int duration)
	{
		int start = -1;
		int count = 1;

		boolean boo = true;

		for (int i = 0; i < per[period].getAppoint().length; i++)
		{
			boo = per[period - 1].getAppoint()[i].isAvailable();
			if (boo == true)
			{
				if (count == 1)
				{
					start = i;
					count++;
				} else if (count == duration)
				{
					return start;
				} else
				{
					count++;
				}
			} else
			{
				count = 0;
			}
		}
		return -1;
	}

	public boolean makeAppointment(int period, int duration)
	{
		int free = -1;
		boolean boo = true;
		free = findFreeBlock(period, duration);
		if (free == -1)
		{
			boo = false;
		} else
		{
			reserveBlock(period, free, duration);
			boo = true;
		}
		return boo;
	}
}
