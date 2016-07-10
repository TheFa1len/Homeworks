package Task1;

public class FloatSumm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float m[] = new float [10];
		float res = 0;
		for (int i=0; i<10; i++){
			m[i]=(float)Math.random()*100;
			System.out.print(m[i] + "| ");
		}
		
		for (int i=0;i<10;i++){
			res+=m[i];
		}
		System.out.println();
		System.out.println("average value =" + res/10);

	}

}
