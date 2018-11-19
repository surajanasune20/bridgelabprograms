package Alogithm_Pg;

import Utility.Utility1;

public class AnagramDetechtion {
	public static void main(String[] args) {
		// Accept string from user
		System.out.println("Enter first string.. ");
		String str1 = Utility1.getString();
		// Accept second string from user
		System.out.println("Enter Second String..");
		String str2 = Utility1.getString();
		// calling utility1 class method
		System.out.println(Utility1.checkAnagram(str1, str2));
	}
}
