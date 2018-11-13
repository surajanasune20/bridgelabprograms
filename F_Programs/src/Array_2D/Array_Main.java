package Array_2D;

import Utility.Utility1;

public class Array_Main {
	public static void main(String[] args) {

		Utility1 u = new Utility1();
		System.out.println("Enter number of rows: ");
		int m = u.inputInteger();
		System.out.println("Enter number of columns: ");
		int n = u.inputInteger();
		// calling methods
		int[][] a = Utility1.arrayInt(m, n);
		// String [][] c =arrayBoolean(m,n);
		// calling display method
		Utility1.Array_display(a, m, n);

	}

	
	
}