/*
 * Created on: Apr 10, 2024
 *
 * ULID: <sadibos>
 * Class: IT 179 
 */
package edu.ilstu;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * <This class has all the methods to manage the animals>
 *
 * @author <Adiboshi Shalom;
 *
 */
public class Zoo
{

	LinkedList<Animal> animals;
	Stack<Animal> feedingsPerDay;
	Queue<Animal> vetAnimals;
	
	public Zoo()
	{
		animals = new LinkedList<>();
		feedingsPerDay = new Stack<>();
		vetAnimals = new LinkedList<>();
	}
	
	public void addAnimal(Animal a)
	{
		animals.add(a);
		feedingsPerDay.add(a);
		vetAnimals.add(a);
	}
	public void removeAnimal(String name)
	{
		boolean removed = false;
		for (int i=0; i < animals.size(); i++)
		{
			if (animals.get(i).getName().equalsIgnoreCase(name))
			{
				animals.remove(i);
				feedingsPerDay.remove(i);
				vetAnimals.remove();
				System.out.println("Animal " + name + " has been removed.");
				removed = true;
				break;
			}
		}
		if (!removed)
		{
			System.out.println("Animal " + name + " could not be found.");
		}
	}
	public void feedNext()
	{
		for (int i = 0; i < 1; i++)
		{
			if (!feedingsPerDay.isEmpty())
			{
				Animal a1 = feedingsPerDay.pop();
				if (a1 != null)
				{
					System.out.println(a1.getName() + " has been fed.");
				}
				else
				{
					System.out.println("No animals to feed");
				}
			}
			else
			{
				System.out.println("No animals to feed");
			}
		}
	}
	public void visitNext()
	{
		for (int i = 0; i < 1; i++)
		{
			if (!vetAnimals.isEmpty())
			{
				Animal a1 = vetAnimals.poll();
				if (a1 != null)
				{
					System.out.println(a1.getName() + " has been visited.");
				}
				else
				{
					System.out.println("No animals to visit");
				}
			}
			else
			{
				System.out.println("No animals to visit");
			}
		}
	}
	public void displayAnimals()
	{
		boolean displayed = false;
		for (int i = 0; i<animals.size(); i++)
		{
			Animal a1 = animals.get(i);
			System.out.println(a1);
			displayed = true;
		}
		if (!displayed)
		{
			System.out.println("No animal to display");		
		}
	}
	public void needFeeding()
	{
		boolean displayed = false;
		for (int i = 0; i<feedingsPerDay.size(); i++)
		{
			Animal a1 = feedingsPerDay.peek();
			System.out.println(a1);
			displayed = true;
		}
		if (!displayed)
		{
			System.out.println("No animal to display");		
		}
	}
	public void vetVisit()
	{
		boolean displayed = false;
		for (int i = 0; i<vetAnimals.size(); i++)
		{
			Animal a1 = vetAnimals.peek();
			System.out.println(a1);
			displayed = true;
		}
		if (!displayed)
		{
			System.out.println("No animal to display");		
		}
		
	}

}
