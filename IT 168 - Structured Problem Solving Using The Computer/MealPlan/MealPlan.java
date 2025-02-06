/**
 * 
 */
package edu.ilstu;

import java.text.DecimalFormat;

/**
 * author < Adiboshi Shalom
 */
public class MealPlan 
{
	private String owner;
	private int mealsAvailable;
	private double mealCost;
	
	public MealPlan(String owner, int mealsAvail, double mealCost)
	{
		this.owner = owner;
		this.mealCost = mealCost;
		this.mealsAvailable = mealsAvail;
	}

	public double getMealCost() 
	{
		return mealCost;
	}

	public void setMealCost(double mealCost) 
	{
		this.mealCost = mealCost;
	}

	public String getOwner() 
	{
		return owner;
	}

	public int getMealsAvailable()
	{
		return mealsAvailable;
	}
	
	public void useMeal()
	{
		this.mealsAvailable--;
	}
	
	public double purchaseMeals (int numToPurchase)
	{
		mealsAvailable -= numToPurchase;
		return mealCost * numToPurchase;
	}
	
	public String toString()
	{
		return "Meal owner: " + owner + "\nMeals Available: " + mealsAvailable + "\nMeal cost: $" + mealCost + "0";
	}
}
