package Task3;
import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a,b;
		System.out.print("������� ����� ����� 1=");
		a=sc.nextLine();
		System.out.println();
		System.out.print("������� ����� ����� 2=");
		b=sc.nextLine();
		System.out.println();
		int x=Integer.parseInt(a), y=Integer.parseInt(b);
		if(y!=0&&x!=0){
			System.out.println("������� 1=" + x/y + " " + "������� 2=" + y/x);
		}
		else{
			System.out.println("�� ����� ������� ��������");
		}
		sc.close();

	}

}
