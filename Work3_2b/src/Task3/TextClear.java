package Task3;

import java.util.Scanner;
/*
 * Clear text from all symbols not from alphabet 
 */
public class TextClear {

	public static void main(String[] args) {
		System.out.println("Enter some kind of text: ");
		Scanner sc = new Scanner(System.in);
		String s1;
		s1 = sc.nextLine();
		StringBuffer sb = new StringBuffer(s1);
		System.out.println("Entered text - " + sb);
		while (!Character.isLetter(sb.charAt(0))) {
			sb.deleteCharAt(0);
		}
		for (int i = 0; i < sb.length(); i++) {
			if (!Character.isLetter(sb.charAt(i)) && !Character.isWhitespace(sb.charAt(i))) {
				sb.setCharAt(i, ' ');
			}
		}
		System.out.println("Text without garbage - " + sb);
	}
}
