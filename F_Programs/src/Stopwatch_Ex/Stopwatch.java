package Stopwatch_Ex;

import Utility.Utility1;

public class Stopwatch {
	public static void main(String[] args) {
		System.out.println("*** Stopwatch ***");
		System.out.println("Press 1 to start  ... ");
		System.out.println("Press 2 to stop");
		// Taking input from user from predefined set
		int n = Utility1.getInt();
		// calling method of Utility class
		Utility1.getElapsedtime(n);

	}
}
