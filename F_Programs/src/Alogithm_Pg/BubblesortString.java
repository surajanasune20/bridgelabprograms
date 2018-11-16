package Alogithm_Pg;

import Utility.Utility1;

public class BubblesortString {
public static void main(String[] args) {
	String[] strarray = { "ss", "aa", "pp", "bb" };
	int a = strarray.length;
	String[] sorted_array1 = Utility1.bubblesort_string(strarray, a);
	System.out.println("The Sorted array is...");
	for (int i = 0; i < sorted_array1.length; i++) 
	{
		System.out.println(sorted_array1[i]);
	}
	
}
}
