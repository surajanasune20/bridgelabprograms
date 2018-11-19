package Alogithm_Pg;

import Utility.Utility1;

public class Prime_No {
	public static void main(String[] args) {
		//Accept user input limit
		System.out.println("\t Prime No \t");
		System.out.println("Enter a limit... ");
		//call method from utility class to accpet user input
		int limit=Utility1.getInt();
		//call method from utility class
		Utility1.primecheck(limit);
	}
}
