package Alogithm_Pg;

import Utility.Utility1;

public class Insertion_Sort {
	public static void main(String[] args) {
		long starttime = System.nanoTime();
		System.out.println("Enter the number of elements : ");
		int n1 = Utility1.getInt();
		int[] arr = new int[n1];
		System.out.println(" Enter the elements... ");
		for (int i = 0; i < n1; i++) {
			arr[i] = Utility1.getInt();

		}
		System.out.println("Before Insertion sort :  .. ");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}
		System.out.println();
		Utility1.insertionSort(arr);
		long endtime = System.nanoTime();
		long duration = (endtime - starttime);
		System.out.println();
		System.out.println("The elapsed time of method is : > > > " + duration);


	}
}
