package Task1;
import java.util.Scanner;
public class SeparateString {

	public static void main(String[] args) { /** Данный класс производит деление на пополам введённую случайную фразу/слово/предложение с клавиатуры*/
		Scanner sc = new Scanner (System.in);
		// TODO Auto-generated method stub
		System.out.println("Введите фразу для деления");
		String s1,s2,s3;
		s1=sc.nextLine();
		int n=0;
		n=s1.length()/2;
		s2=s1.substring(0,n);
		s3=s1.substring(n,s1.length());
		System.out.println(s2 + ' ' + s3);
		sc.close();

	}


}
