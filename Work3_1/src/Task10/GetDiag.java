package Task10;
import java.util.Scanner;
public class GetDiag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter capacity=");
		int n=sc.nextInt();
		int a[][]=new int [n][n];
		for (int i=0;i<n;i++)
			for (int j=0;j<n;j++){
				a[i][j]=(int)(Math.random()*30);
			}
		sc.close();
		//main diag
		System.out.println("Main diag elements:");
		for (int i=0;i<n;i++){
			System.out.print(" " + a[i][i]);
		}
		System.out.println();
		//secondary diag
		System.out.println("Secondary diag elements:");
		for (int i=0;i<n;i++){
			System.out.print(" " + a[i][n-i-1]);
		}

	}

}
