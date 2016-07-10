package Task4;

public class MaxIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[]=new int [15];
		int max=0, maxIndex=0;
		for (int i=0;i<15;i++){
			m[i]=(int)(Math.random()*100);
			System.out.print(m[i] + " ");
			if (m[i]>max){
				max=m[i];
				maxIndex=i;
			}
		}
		System.out.println();
		System.out.println("Max value =" + max + " in index " + maxIndex);

	}

}
