package Task7;

public class SummTillNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[]={11,12,10,5,0,6,7,8,9,10};
		int sum=0;
		for (int i=0;i<10;i++)
			if(m[i]!=0){
				sum+=m[i];
			}
			else break;
		System.out.println("Sum till null=" + sum);

	}

}
