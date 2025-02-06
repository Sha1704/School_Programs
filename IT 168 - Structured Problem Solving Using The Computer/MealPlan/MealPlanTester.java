/**
 * 
 */
package edu.ilstu;


/**
 * @author sadibos  Adiboshi Shalom
 */
public class MealPlanTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		MealPlan dan = new MealPlan ("Dan Jones", 15, 7.50);
		System.out.println(dan.toString());
		dan.useMeal();
		System.out.println("$" + dan.purchaseMeals(10) + "0");
		dan.setMealCost(8.00);
		dan.useMeal();
		System.out.println(dan.toString());
	}

}
