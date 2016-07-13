package Task7;
import java.util.Scanner;
public class StringCompression {

	static int countCompression(String str) {
		//Count size of compressed line
		char last = str.charAt(0);
		int size = 0;
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				last = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 0;
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;
	}

	static String  compress(String str) {
		//Checking for capacity of new string
		int size = countCompression(str);
		if (size >= str.length()) {
			return str;
		}

		char[] array = new char[size];
		int index = 0;
		char last = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) { // Finding repeated char
				count++;
			} else {
				index = setChar(str, array, last, index, count);
				last = str.charAt(i);
				count = 1;
			}
		}

		// Refresh line with new symbols
		index = setChar(str, array, last, index, count);
		return String.valueOf(array);
	}

	static int setChar(String str, char[] array, char c, int index, int count) {
		array[index] = c;
		index++;
		//Convert counter to string
		char[] cnt = String.valueOf(count).toCharArray();
		//Copying symbols from biggest to lower
		for (char х : cnt) {
			array[index] = х;
			index++;
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1;
		System.out.print("Enter line for compression: ");
		s1=sc.nextLine();
		System.out.println("Compressed line: " + compress(s1));

	}

}
