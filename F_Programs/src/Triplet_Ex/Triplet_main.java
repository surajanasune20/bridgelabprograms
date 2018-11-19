package Triplet_Ex;

import Utility.Utility1;

public class Triplet_main {	

	public static void main(String[] args) {
		//
		System.out.println("Enter the user range...! ");
		// To count total Triplet generated
		int range=Utility1.getInt();
		// calling method of Utility class
		Utility1.triplet_func(range);
	}
	
}
