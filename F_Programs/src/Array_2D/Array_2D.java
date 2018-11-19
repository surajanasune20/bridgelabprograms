package Array_2D;

import Utility.Utility1;

public class Array_2D {
	public static void main(String[] args) {

		System.out.println("Enter no of Rows");

		// Taking input of Rows from user
		int M = Utility1.getInt();
		System.out.println("Enter no of Column");

		// Taking input for no of column from user
		int N = Utility1.getInt();
		// calling method of Utility class
		int[][] input2DArray = Utility1.get2DArrayInput(M, N);

		for (int i = 0; i < M; i++) {

			for (int j = 0; j < N; j++) {

				System.out.print(input2DArray[i][j] + " ");
			}
			System.out.println("");
		}

	}

}