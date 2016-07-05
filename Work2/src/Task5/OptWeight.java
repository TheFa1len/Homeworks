package Task5;
import java.util.Scanner;
public class OptWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w,h;
		System.out.print("Введите свой вес=") ;
		w=sc.nextInt();
		System.out.println();
		System.out.print("Введите свой рост=");
		h=sc.nextInt();
		System.out.println();
		if(w<h-w){
			System.out.println("Вам стоит набрать вес");
		}
		else{
			if (w>h-20){
				System.out.println("Вам стоит похудеть");
			}
			else{
				System.out.println("Ваш вес в пределах нормы");
			}
		}		
		sc.close();

	}

}
