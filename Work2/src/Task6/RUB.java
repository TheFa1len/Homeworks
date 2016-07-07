package Task6;

import java.util.Scanner;

public class RUB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * �������� ����������� ������ � ����������� �� �������� �����
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите сумму ");
		String s1 = sc.nextLine();
		int sum = Integer.parseInt(s1);
		if (sum <0 && sum > 999) {
			System.out.println("Введена неверная сумма");
		}
		else {
			if (sum > 10 && sum < 15) {
				System.out.println(sum + " рублей");
			} else {
				int k = sum % 10;
				switch (k) {
				case 0:
					System.out.println(sum + " рублей");
					break;
				case 1:
					System.out.println(sum + " рубль");
					break;
				case 2:
					System.out.println(sum + " рубля");
					break;
				case 3:
					System.out.println(sum + " рубля");
					break;
				case 4:
					System.out.println(sum + " рубля");
					break;
				case 5:
					System.out.println(sum + " рублей");
					break;
				case 6:
					System.out.println(sum + " рублей");
					break;
				case 7:
					System.out.println(sum + " рублей");
					break;
				case 8:
					System.out.println(sum + " рублей");
					break;
				case 9:
					System.out.println(sum + " рублей");
					break;

				}

			}
		

		}
		sc.close();
	}
}
