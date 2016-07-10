package Task2;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[] = new int [10];
		for (int i=0; i<10; i++){
			
			m[i]=(int)(Math.random()*(100));
			System.out.print(m[i] + " ");
		}
		System.out.println();
		int min=m[0],max=0;
		for (int i=0;i<10;i++){
			if (m[i]<min){
				min=m[i];
			}
			if (m[i]>max){
				max=m[i];
			}
		}
		System.out.println("Min value=" + min + " Max value=" + max);

	}

}
