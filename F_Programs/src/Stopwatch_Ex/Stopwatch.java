package Stopwatch_Ex;

import Utility.Utility1;

public class Stopwatch {
	public static void main(String[] args) {
		System.out.println("*** Stopwatch ***");
		System.out.println("Press 1 to start  ... ");
		int n = Utility1.getInt();
		Utility1.getElapsedtime(n);

	}
}
