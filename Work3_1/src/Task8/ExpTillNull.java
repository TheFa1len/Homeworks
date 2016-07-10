package Task8;

public class ExpTillNull {

	public static void main(String[] args) {
		int m[]={11,12,10,5,0,6,7,8,9,10};
		int exp=m[0];
		for (int i=1;i<10;i++)
			if(m[i]!=0){
				exp*=m[i];
			}
			else break;
		System.out.println("Exp till null=" + exp);

	}



}
