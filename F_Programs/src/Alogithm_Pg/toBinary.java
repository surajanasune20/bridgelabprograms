package Alogithm_Pg;

import java.util.Scanner;

import Utility.Utility1;

public class toBinary {
	public static void main(String[] args) {
		int number=106;
		binaryNumber(number);
		
	}

	private static void binaryNumber(int number) {
		int index=0;
		int[] binary=new int[25];
		while(number > 0)
		{
			binary[index++]=number%2;
			number=number/2;
		}
		for(int i=index-1 ; i>=0;i--)
		{
			System.out.println(binary[i]);
		}
	}
}
