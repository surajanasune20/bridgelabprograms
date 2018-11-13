package Utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	BufferedReader br;

	// constructor to initialize bufferedReader
	public Utility() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	static Scanner sc = new Scanner(System.in);

	public static int getInt() {
		int integer = sc.nextInt();
		return integer;

	}

	/**
	 * Given N distinct Coupon Numbers, how many random numbers do you need to
	 * generate distinct coupon number? This program simulates this random process.
	 * 
	 * @param n //user input
	 */
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

	public int inputInteger() {
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
		Utility u = new Utility();
		System.out.println();
		System.out.println("Integer Array");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = u.inputInteger();
			}
		}
		return a;
	}

}
