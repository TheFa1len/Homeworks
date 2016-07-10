package Task3;
import java.util.Scanner;
public class InitMas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1[]={1,3,34,53,14,65,45,98,75,31,64,3,5,44,0};
		int m2[]=new int[15];
		int m3[]=new int [15];
		for (int i=0; i<15; i++){
			m2[i]=(int)(Math.random()*100);
			System.out.print(m2[i] + " ");
		}
		System.out.println();
		Scanner sc= new Scanner (System.in);
		for (int i=0;i<15;i++){
			System.out.print("Enter m3[" + i+ "]= ");
			m3[i]=sc.nextInt();
			
		}
		sc.close();
		

	}

}
