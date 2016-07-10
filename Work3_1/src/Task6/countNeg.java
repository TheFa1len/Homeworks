package Task6;

public class countNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,0,-10,25,-1,40,11,7,9,-9};
		int count=0;
		for (int i=0;i<10;i++){
			if (a[i]<0){
				count++;
			}
		}
		System.out.println("Negative element count " + count);

	}

}
