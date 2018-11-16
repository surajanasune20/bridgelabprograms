package Alogithm_Pg;

import Utility.Utility1;

public class Insertion_Sor_For_String {
	public static void main(String[] args) {
		long starttime=System.nanoTime();

		System.out.println("Enter the number of elements : ");
		int  n=Utility1.getInt();
		String[] strarr=new String[n];
		System.out.println(" Enter the elements... ");
		for(int i=0;i< strarr.length ;i++)
		{
			strarr[i]=Utility1.getString();
		}
		
		System.out.println("Before srot  :  ..  \n ");
		for (int i = 0; i < strarr.length; i++) {
	         if(i >  0)
	         {
	        	 System.out.print(", ");
	         }
	         System.out.print(strarr[i]);
	      }
		int a = strarr.length;
		// String sortedArray=sort_sub(strarr,strarr.length);
		String[] sortedArray = Utility1.insertionSortString(strarr, a);
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}
		long endtime=System.nanoTime();
		long duration=(endtime-starttime);
		System.out.println("The elapsed time of method is : > > > " + duration );
	
	}
}
