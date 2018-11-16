package Alogithm_Pg;

import Utility.Utility1;

public class BinarySearch_String {
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
		
		System.out.println("Before search :  .. ");
		for (int i = 0; i < strarr.length; i++) {
	         if(i >  0)
	         {
	        	 System.out.print(", ");
	         }
	         System.out.print(strarr[i]);
	      }
		
		System.out.println("\n  Enter the elements you want to search... ");
		String a=Utility1.getString();
		int mi=Utility1.binarySearchString(strarr,a);		
		if(mi!=1)
		System.out.println("Element is ata " + mi + " index position");

		
		long endtime=System.nanoTime();
		long duration=(endtime-starttime);
		System.out.println("The elapsed time of method is : > > > " + duration );
		
		
	}


}