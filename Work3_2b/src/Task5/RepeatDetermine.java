package Task5;

import java.util.Scanner;

public class RepeatDetermine {
	/*
	 * Class to determine is this type character single in string
	 */
	public static boolean isUnique(String s1) {
		// Method of determine repeated characters. Return true if all characters are unique
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < s1.length(); i++) {
			int val = s1.charAt(i);
			if (char_set[val]) {
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text or word - ");
		String s1 = sc.nextLine();
		if(isUnique(s1)){
			System.out.println("Text doesn't have repeated charactes");
		}
		else{
			System.out.println("Text have repeated characters");
		}

	}
}