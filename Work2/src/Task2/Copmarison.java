package Task2;
import java.util.Scanner;
public class Copmarison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** 
		 * класс сравнения двух чисел
		 */
		Scanner sc= new Scanner (System.in);
		String s1,s2;
		System.out.print("Введите первое число=");
		s1=sc.nextLine();
		System.out.println();
		System.out.print("Введите второе число=");
		s2=sc.nextLine();
		System.out.println();
		if(s1.equals(s2)){
			System.out.println("Числа равны");
		}
		else{
			System.out.println("Числа не равны");
		}
		sc.close();
		

	}

}
