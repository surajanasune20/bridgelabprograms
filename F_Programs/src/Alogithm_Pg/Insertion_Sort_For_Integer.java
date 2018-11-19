package Alogithm_Pg;

import Utility.Utility1;

public class Insertion_Sort_For_Integer {
	public static void main(String[] args) {
		//initalized start time using predefined methods 
		long starttime = System.nanoTime();
		System.out.println("Enter the number of elements : ");
		//accept elements
		int n1 = Utility1.getInt();
		//initialize array with elements size
		int[] arr = new int[n1];
		//Enter the elements and print it
		System.out.println(" Enter the elements... ");
		for (int i = 0; i < n1; i++) {
			arr[i] = Utility1.getInt();

		}
		//Enter the elements before sort
		System.out.println("Before Insertion sort :  .. ");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}
		System.out.println();
		//call insertion sort method using Utility class method
		Utility1.insertionSort(arr);
		//calculate end time using predefined class
		long endtime = System.nanoTime();
		long duration = (endtime - starttime)/1000;
		System.out.println();
		//calculate elepased time
		System.out.println("The elapsed time of method is : > > > " + duration);


	}
}
