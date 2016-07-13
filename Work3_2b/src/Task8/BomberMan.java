package Task8;

import java.util.Scanner;

public class BomberMan {
	/*
	 * Making row and column of zero elements, if finds 0 in matrix
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = 0, n = 0;
		System.out.print("Enter number of rows - ");
		m = sc.nextInt();
		System.out.print("Enter number of columns - ");
		n = sc.nextInt();
		int mat[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = -1 + (int) (Math.random() * (10 - (1)));
			}
		}
		System.out.println("Enetered matrix");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		boolean[] row = new boolean[m];
		boolean[] column = new boolean[n];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (row[i] || column[j]) {
					mat[i][j] = 0;
				}
			}
		}

		System.out.println("Final matrix");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf(mat[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
