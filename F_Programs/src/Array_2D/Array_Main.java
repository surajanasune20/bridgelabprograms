package Array_2D;

import Utility.Utility1;

public class Array_Main {
	public static void main(String[] args) {

		Utility1 u = new Utility1(); //create object of  utility class 
		System.out.println("Enter number of rows: ");
		int m = u.inputInteger(); //calling inputinteger method from utility class
		System.out.println("Enter number of columns: ");
		int n = u.inputInteger();//calling inputinteger method from utility class
		int[][] a = Utility1.arrayInt(m, n);
		Utility1.Array_display(a, m, n); 		// calling display method

	}

	
	
}