package Task4;
/*
 * Class that delete words in text with entered length and starts with consonant 
 */
import java.util.Scanner;
public class DeleteWords {
	//method that dertemine with wich type of letter starts word
	public static boolean isConsonant(String incomingText) {
		switch ((char) Character.toLowerCase(incomingText.charAt(0))) {
		case 'q':
		case 'w':
		case 'r':
		case 't':
		case 'p':
		case 's':
		case 'd':
		case 'f':
		case 'g':
		case 'h':
		case 'j':
		case 'k':
		case 'l':
		case 'z':
		case 'x':
		case 'c':
		case 'v':
		case 'b':
		case 'n':
		case 'm':
			return false;
		default:
			return true;

		}
	}
	public static String formatText(String incomingText, int k) {
		//Class for formating text for 
		StringBuilder sb = new StringBuilder();
		String[] strArr = incomingText.split(" ");
		for (int i = 0; i < strArr.length; i++) {

			if (isConsonant(strArr[i]) || (strArr[i].length() != k)) {
				sb.append(strArr[i]).append(" ");
			}
		}

		String outText = sb.toString().trim();
		return outText;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text;
		System.out.print("Enter text - ");
		text=sc.nextLine();
		int k=0;
		System.out.print("Enter length of words that you want to delete = ");
		k=sc.nextInt();
		System.out.println("\n\n" + formatText(text,k));

	}



}