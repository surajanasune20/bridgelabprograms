package Alogithm_Pg;

import java.util.Arrays;

import Utility.Utility1;

public class BinarySearch_For_String {
	public static void main(String[] args) {
		// initialize variable and call predfined method
		long starttime = System.nanoTime();
		// Accept the number of elements
		System.out.println("Enter the number of elements : ");
		int n = Utility1.getInt();
		// intitalize the array for elements length
		String[] strarr = new String[n];
		// user enter the elements
		System.out.println(" Enter the elements... ");
		// Accept the entered elements
		for (int i = 0; i < strarr.length; i++) {
			strarr[i] = Utility1.getString();
		}
		// print the elements before sort
		System.out.println("Before sort :  .. ");
		for (int i = 0; i < strarr.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(strarr[i]);
		}
		// call utility1 class method to sort the string
		Utility1.sortString(strarr);
		// print the element after sort
		System.out.println("\n After sort :  .. ");
		for (int i = 0; i < strarr.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}

			System.out.print(strarr[i]);
		}
		// enter search element
		System.out.println("\n  Enter the elements you want to search... ");
		//accpt the string element using  Utility1 class method
		String a = Utility1.getString();
		// call utility1 class method
		Utility1.getBinary_Search_String(strarr, a);

		int mi = Utility1.binarySearchString(strarr, a);
		if (mi != 1)
			System.out.println("Element is ata " + mi + " index position");
		
		long endtime = System.nanoTime();
		//calculate elepsed time
		long elepasedtime = (endtime - starttime)/1000;
		
		System.out.println("The elapsed time of method is : > > > " + elepasedtime);

	}

}