package Task2;
import java.util.Scanner;
public class Copmarison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** 
		 * ������ ����� ���������� ��� �������� �������� � ����������.
		 */
		Scanner sc= new Scanner (System.in);
		String s1,s2;
		System.out.print("������� ������ �����=");
		s1=sc.nextLine();
		System.out.println();
		System.out.print("������� ������ �����=");
		s2=sc.nextLine();
		System.out.println();
		if(s1.equals(s2)){
			System.out.println("����� ���������");
		}
		else{
			System.out.println("����� ��������");
		}
		sc.close();
		

	}

}
