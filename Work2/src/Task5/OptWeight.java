package Task5;
import java.util.Scanner;
public class OptWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w,h;
		System.out.print("������� ���� ���=") ;
		w=sc.nextInt();
		System.out.println();
		System.out.print("������� ���� ����=");
		h=sc.nextInt();
		System.out.println();
		if(w<h-w){
			System.out.println("��� ����� ������� ���");
		}
		else{
			if (w>h-20){
				System.out.println("��� ����� ��������");
			}
			else{
				System.out.println("��� ��� � �������� �����");
			}
		}		
		sc.close();

	}

}
