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
 * <This class has all the necessary attributes and methods needed to create an animal>
 *
 * @author <Adiboshi Shalom;
 *
 */
public class Animal
{
	private String name;
	private String species;
	private int age;
	private String food;
	private String foodAmount;
	private int feedingsPerDay;
	
	public Animal(String name, String species, int age, String food, String foodAmount, int feedingsPerDay)
	{
		super();
		this.name = name;
		this.species = species;
		this.age = age;
		this.food = food;
		this.foodAmount = foodAmount;
		this.feedingsPerDay = feedingsPerDay;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getSpecies()
	{
		return species;
	}

	public void setSpecies(String species)
	{
		this.species = species;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getFood()
	{
		return food;
	}

	public void setFood(String food)
	{
		this.food = food;
	}

	public String getFoodAmount()
	{
		return foodAmount;
	}

	public void setFoodAmount(String foodAmount)
	{
		this.foodAmount = foodAmount;
	}

	public int getFeedingsPerDay()
	{
		return feedingsPerDay;
	}

	public void setFeedingsPerDay(int feedingsPerDay)
	{
		this.feedingsPerDay = feedingsPerDay;
	}
	
	public String toString()
	{
		String str = "Name: " + this.getName() + "\n" + "Species: " + this.getSpecies() + "\n" + "Age: " + this.getAge() + "\n" + "Food: " + this.getFood() + "\n" + "Food amount: " + this.getFoodAmount() + "\n" + "Feedings per day: " + this.getFeedingsPerDay();
		return str;
	}
}
