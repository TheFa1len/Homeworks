package Task1;
import java.util.Scanner;
public class kReplace {

	public static void main(String[] args) {
		/*
		 * Class that replace in sentence 1 character in directed position on entered character
		 */
		Scanner sc = new Scanner (System.in);
		int k=0;
		System.out.print("Enter sentence = ");
		String chBase=sc.nextLine();
		System.out.println();
		System.out.print("Enter character you want to place in string = ");
		String chReplace=sc.nextLine();
		System.out.print("Enter number k=");
		k=sc.nextInt();
		System.out.println();
		
		System.out.println();
		if (k>chBase.length()){
			System.out.println("k is bigger than sentence length");
		}
		else{
			chBase=chBase.substring(0, k-1)+chReplace+chBase.substring(k,chBase.length());
			System.out.println("Result sentece is '" + chBase + "'");
		}
		sc.close();

	}

}
