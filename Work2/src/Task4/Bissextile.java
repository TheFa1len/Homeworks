package Task4;

import java.util.Scanner;

public class Bissextile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1;
		System.out.print("������� ���");
		s1 = sc.nextLine();
		System.out.println();
		int y = Integer.parseInt(s1);
		if (y % 4 == 0) {
			if (y % 100 != 0 && y % 400 != 0) {
				System.out.println("���� ��� ����������");
			} else {
				System.out.println("���� ��� �� ����������");
			}
		}
		sc.close();

	}

}
