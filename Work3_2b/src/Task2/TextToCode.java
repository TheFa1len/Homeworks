package Task2;
import java.util.Scanner;
public class TextToCode {
/*
 * Writing entered text with equal order number of letter
 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String testString;
		System.out.print("Enter text -");
		testString=sc.nextLine();
		String codeString = "";
		String formattedString = "";
		for (char ch : testString.toCharArray()) {
			codeString += Character.isAlphabetic(ch) ? String.format("%-2s", ch - 'a' + 1) : ch;
			formattedString += Character.isAlphabetic(ch) ? String.format("%-2s", ch) : ch;
		}
		System.out.println(formattedString);
		System.out.println(codeString);
	}
}