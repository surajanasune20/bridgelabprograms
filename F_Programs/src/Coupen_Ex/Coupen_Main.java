package Coupen_Ex;

import Utility.Utility1;

public class Coupen_Main {
	public static void main(String[] args) {

		System.out.println("Enter the value of n .....   ! ");
		int n = Utility1.getInt();   //get an integer number using getInt function
		Utility1.CoupenNoGenerator(n);
	}
}
