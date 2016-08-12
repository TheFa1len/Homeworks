package BuilderMeal;

import java.util.Scanner;

import BuilderMeal.ComplexA;
import BuilderMeal.Director;
import BuilderMeal.ComplexB;
import BuilderMeal.ComplexW;
import BuilderMeal.ComplexAW;
import BuilderMeal.Meal;
import BuilderMeal.MealWith;
/**
 * Main with console input
 * @author DEN
 *
 */
public class BuilderTest {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("We have Complex 'A' and Complex 'B' or you want smthing modified?");
		System.out.println("Press A for complex A" + "\n" + "Press B for complex B" + "\n" + "press M for electing");
		String s = sc.nextLine();
		switch (s) {
		case "A":
			Meal mealA = Director.createMeal(new ComplexA());
			System.out.println(mealA);
			break;
		case "B":
			Meal mealB = Director.createMeal(new ComplexB());
			System.out.println(mealB);
			break;
		case "M":
			System.out.println("Enter on what base u want to build meal");
			System.out.println("Press A for complex A" + "\n" + "Press B for complex B");
			String sM = sc.nextLine();
			switch (sM) {
			case "A":
				System.out.println("Enter what you want to fill new in meal: carrot, cucmber, tomato");
				String sW = sc.nextLine();
				MealWith mealW = Director.createMealW(new ComplexAW(), sW);
				System.out.println(mealW);
				break;
			case "B":
				System.out.println("Enter what you want to fill new in meal: carrot, cucmber, tomato");
				String sWW = sc.nextLine();
				MealWith mealWW = Director.createMealW(new ComplexW(), sWW);
				System.out.println(mealWW);
				break;
			}

			break;
		default:
			Meal mealD = Director.createMeal(new ComplexA());
			System.out.println(mealD);
			break;
		}

	}
}
