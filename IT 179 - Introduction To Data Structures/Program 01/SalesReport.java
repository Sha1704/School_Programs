/*
 * Created on: Jan 27, 2024
 *
 * ULID: <sadibos>
 * Class: IT 179 
 */
package edu.ilstu;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * <This class has the read, write and other needed methods to make the whole program work as intended>
 *
 * @author <Adiboshi Shalom;
 *
 */
public class SalesReport
{
	private String fileName; // name of file to read
	private double [][] sales; //holds the sales for all the salespeople
	private String [] salesPeople; //hold the names of all the sales people.
	private String [] salesCategories; //holds the names of all the categories or sales in the file
	private int count3; 
	
	public SalesReport(String fileName)
	{
		this.fileName = fileName;
		salesPeople = new String[100];
		salesCategories = new String[7];
		sales = new double [salesPeople.length][salesCategories.length];
	}
	
	public void readFile(String fileName)
	{
		try
		{
			Scanner read = new Scanner(new FileReader (fileName));
			boolean first = true;
			int count = 0;
			int count2 =0;
			
			
			while (read.hasNextLine())
			{
				String str = read.nextLine();
				Scanner scan = new Scanner (str);
				scan.useDelimiter(",");
				
			
				
				if (first)
				{
					String name = scan.next();
					while (scan.hasNext())
					{
						first = false;
						String category = scan.next();
						salesCategories [count] = category;
						count++;
					}
				} // this code fills the sales category array
				
				// fill sales people array
				if (scan.hasNext())
				{
					String people1 = scan.next();
					salesPeople[count2] = people1;
					count3 ++;
					
					for (int j =0; j<sales[count2].length; j++)
					{
						if (scan.hasNextDouble())
						{
							sales [count2] [j] = scan.nextDouble();
						}
						
					} // fill the 2d array
					count2++;
				}
			}
			read.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found " + e.getMessage());
		}
		catch (NullPointerException e)
		{
			System.out.println("Null pointer exception " + e.getMessage());
		}
		catch (NoSuchElementException e)
		{
			System.out.println("No such element " + e.getMessage());
		}
	}
	
	public void writeFile(String name)
	{
		try
		{
			DecimalFormat df = new DecimalFormat ("$#,##0.00");
			PrintWriter write = new PrintWriter (new FileWriter (name +".txt",true));
			double totalSales = 0;
			write.println(name);
			boolean found = false;
			int rank = 0;
			
			for (int i = 0; i < count3; i++)
			{
					if (salesPeople[i].equalsIgnoreCase(name))
					{
						found = true;
						for (int j = 0; j<salesCategories.length; j++)
						{
							write.write(salesCategories[j] + "\t");
							write.print(df.format(sales[i][j]) + "\n");
							totalSales += sales[i][j];
							
							if (sales[i][j] < rank)
							{
								rank ++;
							}
						}
						write.println("Total Sales: " + df.format(totalSales));
					write.println(rank(name));
					}
					
			}
			
			if(!found)
			{
				System.out.println ("Sales person not found.");
			}
				
			write.close();
		}
		catch (IOException e)
		{
			System.out.println("IO exception: " + e.getMessage());
		}
	}
	
	public void printSalesPeople()
	{
		for (int i = 0; i < count3; i++)
		{
			System.out.println(salesPeople[i]);
		}
	}
	
	public String getStats()
	{
		DecimalFormat df = new DecimalFormat ("$#,##0.00");
		int i =0;
		double average = 0;
		int sale = 0; // variable use to keep track for average
		double totalSale = 0;
		
		for (int j = 0; j<salesCategories.length; j++)
		{
			totalSale += sales[i][j];
		}
		
		double highest = 0;
		double lowest = totalSale;
		totalSale = 0;
		
		while (i < count3)
		{
			for (int j = 0; j<salesCategories.length; j++)
			{
				totalSale += sales[i][j];
			}
			
			if (totalSale > highest)
			{
				highest = totalSale;
			}
			
			if (totalSale < lowest)
			{
				lowest = totalSale;
			}
			
			sale += totalSale;
			i++;
			totalSale =0 ;
		}
		average = sale/count3;
		
		return "The average of the sales force is: " + df.format(average) + "\nThe highest total sale is: " + df.format(highest) + "\nThe lowest total sale is: " + df.format(lowest);
	}
	
	public String rank(String name)
	{
		double [] total;
		total = new double [count3];
		int index = -1;
		int rank = 1;
		double maxNum = 0;
		int maxIndex = 0;
		
		for (int i = 0; i < count3; i++) // fill the total array
		{
			int sum = 0;
			for (int j = 0; j < salesCategories.length; j++)
			{
				sum += sales[i][j];
			}
			total[i] = sum;
		}
		
		for (int i = 0; i < count3; i++) // find index of the name
		{
			if (salesPeople[i].equalsIgnoreCase(name))
			{
				index = i;
				break;
			}
		}
		
		//sort
		if (index != -1)
		{
			for (int i = 0; i < total.length -1; i++)
			{
				maxNum = total[i];
				maxIndex = i;
				for (int j = i+1; j < total.length; j++)
				{
					if (total[j] > maxNum)
					{
						maxNum = total[j];
						maxIndex = j;
					}
				}
				//swap
				double temp = total [i];
				total [i] = total[maxIndex];
				total [maxIndex] = temp;
		}
		
			//find rank
		for (int i = 0; i < total.length; i++)
		{
			if (total[i] == total[index])
			{
				break;
			}
			rank++;
		}
	}
	return "" + name + "'s rank in total sales in relation to all sales people is: " + rank;	
}
}