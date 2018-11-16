package Alogithm_Pg;

import java.util.Arrays;

import Utility.Utility1;

public class Binary_Searchnew {
	public static void main(String[] args) {
		System.out.println("Enter how many  elements ");
		int n1 = Utility1.getInt();
		int arr[] = new int[n1];
		System.out.println("Enter the elements ");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Utility1.getInt();
		}
		
		System.out.println("Enter the element you want to search...");
		int m=Utility1.getInt();
		int mid=binarSearch(arr,m);
		if(mid!=1)
		{
			System.out.println("Element is found at " + mid + " position");
			
		}
		
		
	}

	public static int binarSearch(int[] arr, int m) {
		Arrays.sort(arr);
		System.out.println("Before Search... >> Sorted array ");
		for(int j=0;j<arr.length;j++)
		{
		System.out.println(arr[j]+ " ");
		}
		
		int first=0;
		int last=arr.length;
		int mid=0;
		while(first <=last)
		{
			mid=(first+last)/2;
			
			if(arr[mid]==m)
			{
				return mid;
			}
			else if(arr[mid] < m)
			{
				first=mid+1;
			}
			else
			{
				last=mid-1;
			}
		}
		
		System.out.println("Unsussfull .... >> Not Found");
		return 1;
		
	}
	
}
