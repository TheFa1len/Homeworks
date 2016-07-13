package Task6;

import java.util.Scanner;
/*
 * Ckass for dertemine if one line transposited from another
 */
public class IsStringSub {
	public static boolean mutateLine(String s1, String s2) {
		if (s1.length() != s2.length()) {
			System.out.println("Lines have different length");
			return false;
		}

		int[] letters = new int[256];

		char[] s_array = s1.toCharArray();
		for (char c : s_array) {
			letters[c]++;
		}

		for (int i = 0; i < s2.length(); i++) {
			int c = (int) s2.charAt(i);
			if (--letters[c] < 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		System.out.print("Enter first line - ");
		s1=sc.nextLine();
		System.out.print("Enter second line - ");
		s2=sc.nextLine();
		if(mutateLine(s1,s2)){
			System.out.println("One line is transpositioned from another");
		}
		else {
			System.out.println("One line is not maded from another");
		}
		

	}
}