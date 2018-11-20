package Com.Coin;

import Utility.Utility1;

public class Coin_Main {
	public static void main(String[] args) {
		//taking input from user
		System.out.println	("Enter the number of time coin flipped...... !");
		//get an input integer using getInt function from utility class
		int n = Utility1.getInt();
		//call method from utility class
		Utility1.getProbability(n);         
	}

}
