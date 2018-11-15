package Alogithm_Pg;

import java.util.Arrays;

import Utility.Utility1;

public class Binary_Search {
	public static void main(String[] args) {
		
		System.out.println("Enter the number of elements : ");
		int n=Utility1.getInt();
		int[] arr=new int[n];
		System.out.println(" Enter the elements... ");
		for(int i=0;i< n ;i++)
		{
			arr[i]=Utility1.getInt();
			
		}
		System.out.println("Before search :  .. ");
		for (int i = 0; i < arr.length; i++) {
	         /*if(i< 0)
	         {
	        	 System.out.println(',');
	         }*/
	         System.out.print(arr[i]);
	      }
		
		System.out.println("Enter the elements you want to search... ");
		int a=Utility1.getInt();
		Utility1.binarySearch(arr,a);
		
		
	}
}
