package Gambler_Game;

import java.util.Scanner;

import Utility.Utility1;

public class Gambler_main {
	public static void main(String[] args) {

		System.out.println("Enter your Stake");
		// Taking value of stake from user
		int a = Utility1.getInt();
		System.out.println("Enter your Goal");

		// Taking value of goal from user
		int b = Utility1.getInt();
		System.out.println("Enter no of Times you want to play");

		// Taking value for no. of turns from the user
		float c = Utility1.getInt();

		// calling method of Utility class
		Utility1.gamblingResult(a, b, c);

	}
}
