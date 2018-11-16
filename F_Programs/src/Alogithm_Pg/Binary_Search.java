package Alogithm_Pg;

import Utility.Utility1;

public class Binary_Search {
	public static void main(String[] args) {
		System.out.println("Enter how many  elements ");
		int n1 = Utility1.getInt();
		int arr[] = new int[n1];
		System.out.println("Enter the elements ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Utility1.getInt();
		}

		System.out.println("Enter the element you want to search...");
		int m = Utility1.getInt();
		int mid = Utility1.binarSearch(arr, m);
		if (mid != 1) {
			System.out.println("Element is found at " + mid + " position");

		}
	}

}
