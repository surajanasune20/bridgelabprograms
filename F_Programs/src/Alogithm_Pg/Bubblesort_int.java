package Alogithm_Pg;

import Utility.Utility1;

public class Bubblesort_int {
	public static void main(String[] args) {
		long starttime = System.nanoTime();
		int[] intarray = { 2, 3, 6, 5 };
		Utility1.bubblesort_for_int(intarray);
		long endtime = System.nanoTime();
		long duration = (endtime - starttime);
		System.out.println("The elapsed time of method is : > > > " + duration);

	}
}
