package Task5;

public class MinIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[] = new int[15];
		int min = 0, minIndex = 0;
		for (int i = 0; i < 15; i++) {
			m[i] = (int) (Math.random() * 100);
			System.out.print(m[i] + " ");
		}
		min = m[0];
		for (int i = 0; i < 15; i++) {
			if (m[i] < min) {
				min = m[i];
				minIndex = i;
			}
		}
		System.out.println();
		System.out.println("Min value =" + min + " in index " + minIndex);

	}

}
