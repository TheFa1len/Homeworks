package Task7;

import java.util.Scanner;

public class DaysOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Класс выведения дня недели по номеру дня.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter day of week ");
		String s1;
		s1 = sc.nextLine();
		switch (s1) {
		case "1":
			System.out.println("Monday");
			break;
		case "2":
			System.out.println("Tuesdey");
			break;
		case "3":
			System.out.println("Wensday");
			break;
		case "4":
			System.out.println("Thesday");
			break;
		case "5":
			System.out.println("Friday");
			break;
		case "6":
			System.out.println("Saturday");
			break;
		case "7":
			System.out.println("Sunday");
		default:
			System.out.println("Error. Day with this number don't exist");
			break;

		}
		sc.close();

	}

}
