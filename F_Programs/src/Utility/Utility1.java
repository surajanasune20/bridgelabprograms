package Utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Utility1 {
	static Scanner sc = new Scanner(System.in);
	static int num;
	static BufferedReader br;
	static int $Money;
	static int $Goal;
	static int noOfTimes;
	static int bets = 0;
	static int wins = 0;
	static String[] args;
	static int trials;
	static String string;
	static long endtimer = 0;
	static long starttimer = 0;
	static long elapsedtime;

	// constructor to initialize bufferedReader
	public Utility1() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public static int getInt() {
		num = sc.nextInt();
		return num;

	}

	public static int getfloat() {
		num = sc.nextInt();
		return num;

	}

	public static void check() {

		if (num > 0) {
			Utility1.result();
		} else {
			System.out.println("Enter the positive value............!");
		}
	}

	public static void result() {
		double flip;
		int count = 0;
		int countHeads = 0;
		int countTails = 0;
		int percentHeads = 0;
		int percentTails;
		for (int x = 0; x <= 10; x = x++) {
			x = x + 1;
			// flip
			flip = Math.random();
			// if statement
			if (flip <= 0.5) {
				flip = countHeads;
				countHeads = countHeads + 1;
				percentHeads = countHeads * 10;
			} else {
				flip = countTails;
				countTails = countTails + 1;
				percentTails = countTails * 10;
				System.out.println("Heads was flipped " + percentHeads + " percent of the time.");
				System.out.println("Tails was flipped " + percentTails + " percent of the time.");

			}

			count = count + 1;

		}

	}

	public static int inputInteger() {
		try {
			try {
				return Integer.parseInt(br.readLine());
			} catch (NumberFormatException nfe) {
				System.out.println(nfe.getMessage());
			}
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		return 0;
	}

	public static void Array_display(int[][] a, int m, int n) {
		System.out.println();
		System.out.println("2D ARRAY INTEGER");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println("\t" + a[i][j] + " ");
			}
			System.out.println("\t");
		} // TODO Auto-generated method stub

	}

	public static int[][] arrayInt(int m, int n) {
		int a[][] = new int[m][n];
		System.out.println();
		System.out.println("Integer Array");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = Utility1.inputInteger();
			}
		}
		return a;
	}

	public static int countDigit(long year) {
		int count = 0;
		while (year != 0) {
			year = year / 10;
			++count;
		}
		return count;
	}

	public static void check_Leap() {
		int co = Utility1.countDigit(num);
		if (co == 4) {
			if (num % 100 == 0) {
				if (num % 400 == 0) {
					System.out.println(num + " is a Leap year");
				}
			} else {
				System.out.println("Not a leap year");
			}
		} else {
			System.out.println("year must have four digit...");
		}

	}

	public static void gambler_check() {

		int stake = Integer.parseInt(args[0]); // gambler's stating bankroll
		int goal = Integer.parseInt(args[1]); // gambler's desired bankroll
		int trials = Integer.parseInt(args[2]); // number of trials to perform
		// repeat trials times
		for (int t = 0; t < trials; t++) {

			// do one gambler's ruin simulation
			int cash = stake;
			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5)
					cash++; // win $1
				else
					cash--; // lose $1
			}
			if (cash == goal)
				wins++; // did gambler go achieve desired goal?
		}

		Utility1.print();

	}

	public static void print() {
		// print results
		System.out.println(wins + " wins of " + trials);
		System.out.println("Percent of games won = " + 100.0 * wins / trials);
		System.out.println("Avg # bets           = " + 1.0 * bets / trials);
	}

	public static void CoupenNoGenerator(int n) {

		int[] distinctArray = new int[n];
		boolean isCollectedArray = true;
		int coupenCount = 0;
		int randomNoCount = 0;
		int k = 0;
		Random r = new Random();
		while (coupenCount < n) {
			isCollectedArray = true;
			int randomNo = r.nextInt();
			randomNoCount++;
			for (int i = 0; i < distinctArray.length; i++) {
				if (randomNo < 0 || randomNo == distinctArray[i]) {
					isCollectedArray = false;
				}
			}
			if (isCollectedArray) {
				if (k < distinctArray.length) {
					distinctArray[k++] = randomNo;
					coupenCount++;

				}
			}
		}

		System.out.println("Random Number needed : " + randomNoCount);
		System.out.println("This is a distinct coupen : ");
		for (int j = 0; j < distinctArray.length; j++) {
			System.out.println(distinctArray[j]);
		}

	}

	public static void primefact_check() {
		for (int i = 2; i < num; i++) {
			while (num % i == 0) {
				System.out.println(i + " ");
				num = num / i;
			}

		}
		if (num > 2) {
			System.out.println(num);
		}

	}

	public static void harmonic_cal(float n) {

		float i;
		float sum = 0;

		for (i = 1; i <= n; i++) {
			sum += 1 / i;
		}
		System.out.println(sum);
	}

	public static float har_check(float n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			System.out.println("Enter value greater than 0....");
			n = new Scanner(System.in).nextFloat();
		}
		if (n > 0) {
			return n;
		}
		return har_check(n);
	}

	public static String getString() {
		string = sc.nextLine();
		return string;

	}

	public static String replace(String string, String str, String replacewith) {
		String finalString = string.replace(str, replacewith);
		return finalString;
	}

	public static void power_check(int limit) {

		for (int i = 0; i <= limit; i++) {
			int value = (int) Math.pow(2, i);
			System.out.println(value);
		}

	}

	public static void triplet_func(int range) {
		int count = 0, add = 0, k = 0;
		int totalCount = 0;
		int jthvalue = 0;
		int[] userNumber = new int[range];
		System.out.println("Enter value.. ");
		for (int i = 0; i < range; i++)
			userNumber[i] = getInt();

		for (int i = 0; i < userNumber.length; i++) {
			for (int j = i + 1; j < userNumber.length; j++) {

				add = userNumber[i] + userNumber[j];
				jthvalue = userNumber[j];
				if (j + 1 < userNumber.length) {
					if (add + userNumber[j + 1] == 0) {
						System.out.println(userNumber[i] + " " + jthvalue + " " + userNumber[j + 1]);
						System.out.println("--------");
						totalCount++;
					}
				}
			}

		}
		System.out.println("Total triplet Possible => " + totalCount);

	}

	public static void findEuclidian(int x, int y) {

		double distance = Math.sqrt(x * x + y * y);
		System.out.println("The euclidian distanmce is : --- " + distance);
	}

	public static void getElapsedtime(int n) {

		long starttimer = 0;
		long endtimer = 0;
		long elapsedtime;
		if (n == 1) {
			System.out.println("Press 1 to start ....");
			starttimer = System.currentTimeMillis();
			System.out.println("Start time is :  " + starttimer);

		}
		System.out.println("Press 2 to get end time : ");
		n = getInt();

		if (n == 2) {
			System.out.println("Press 2 to end .... ");
			endtimer = System.currentTimeMillis();
			System.out.println("end time is :  " + endtimer);
			elapsedtime = (endtimer - starttimer) / 1000;
			System.out.println(" \n Elapsed time is : " + elapsedtime);

		}

	}

}
