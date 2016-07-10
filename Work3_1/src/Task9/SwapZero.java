package Task9;

public class SwapZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[]={11,12,10,5,0,6,7,0,9,10};
		int count=0;
		for (int i=0;i<10;i++){
			if (m[i]==0){
				for(int j=i+1;j<10;j++){
					int temp=m[j];
					m[j]=m[j-1];
					m[j-1]=temp;
				}		
			}
		}
		for(int i=0;i<10;i++){
			System.out.print(m[i]+ " ");
		}

	}

}
