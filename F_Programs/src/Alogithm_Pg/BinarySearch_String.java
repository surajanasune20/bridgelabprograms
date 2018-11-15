package Alogithm_Pg;

import Utility.Utility1;

public class BinarySearch_String {
	public static void main(String[] args) {
		

		System.out.println("Enter the number of elements : ");
		int n=Utility1.getInt();
		String[] strarr=new String[n];
		System.out.println(" Enter the elements... ");
		for(int i=0;i< n ;i++)
		{
			strarr[i]=Utility1.getString();
			
		}
		System.out.println("Before search :  .. ");
		for (int i = 0; i < strarr.length; i++) {
	         if(i >  0)
	         {
	        	 System.out.println(", ");
	         }
	         System.out.print(strarr[i]);
	      }
		
		System.out.println("Enter the elements you want to search... ");
		String a=Utility1.getString();
		Utility1.binarySearchString(strarr,a);
		
		
	}
}