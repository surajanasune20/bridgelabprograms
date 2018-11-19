package Utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utility1 {
	static Scanner sc = new Scanner(System.in);
	static int num;
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
	static final int EMPTY = 0;
	static final int USER = 1;
	static final int COMPUTER = 2;
	static final int NONE = 1;

	// constructor to initialize bufferedReader

	public static int getInt() {
		num = sc.nextInt();
		return num;

	}

	public static double getDouble() {
		double num;
		num = sc.nextDouble();
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

	public static int inputInteger() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static int countDigit(long year) {
		int count = 0;
		while (year != 0) {
			year = year / 10;
			++count;
		}
		return count;
	}

	public static void isLeepYear(int year) {
		int count = 0, q = year, r = 0;

		// Counting digits of year entered to ensure 4 digit
		while (q > 0) {
			r = q % 10;
			q = q / 10;
			count++;
		}

		// comparing count value with 4 to ensure count have 4 digits
		if (count == 4) {

			// Condition for Leap Year
			if (year % 100 == 0 && year % 400 == 0)
				System.out.println(year + " is a Leap year");
			else
				System.out.println(year + " in not a leap year");
		}

		else {
			System.out.println("Year must have four digit ,So Enter 4 digit");
			year = getInt();

			// Using Recursion i.e calling same within itself
			isLeepYear(year);
		}
	}

	public static void CoupenNoGenerator(int n) {
		// Assigning array size as distinctCoupan i.e user value
		int[] distinctArray = new int[n];
		// To check random generated is distinct or not
		boolean isCollectedArray = true;
		// To keep record of Number of Coupans we have generated
		int coupenCount = 0;
		// To count Number of random number generated
		int randomNoCount = 0, k = 0;
		// creating object of Random class to generate random numbers
		Random r = new Random();
		/**
		 * loop will iterate till coupanCount is less than user value i.e
		 * distinctCoupan, because coupanCount is starting with zero
		 */
		while (coupenCount < n) {
			isCollectedArray = true;
			int randomNo = r.nextInt();
			randomNoCount++;
			/*
			 * comparing random number generated with each value in array, if Random number
			 * is distinct then we store in distinctCounArray, otherwise not
			 */
			for (int i = 0; i < distinctArray.length; i++) {
				// comparison of random number in all array value or
				// checking is random no is less than zero
				if (randomNo < 0 || randomNo == distinctArray[i]) {
					isCollectedArray = false;
				}
			}

			/**
			 * if random number generated is unique then only , it will enter into if block
			 */
			if (isCollectedArray) {
				if (k < distinctArray.length) {
					distinctArray[k++] = randomNo;
					coupenCount++;

				}
			}
		}
		// Printing distinct Coupans
		System.out.println("Random Number needed : " + randomNoCount);
		System.out.println("This is a distinct coupen : ");
		for (int j = 0; j < distinctArray.length; j++) {
			System.out.println(distinctArray[j]);
		}

	}

	public static void primefact_check(int num2) {
		boolean isPrime = true;
		// int n=147;
		int N = num2;

		// Finding all primes Numbers till user value
		for (int i = 2; i <= num2; i++) {
			isPrime = true;

			// iterating loop to check each value of i is Prime or not
			for (int j = 2; j <= Math.sqrt(i); j++)
				if (num2 % j == 0) {
					isPrime = false;
				}
			if (isPrime) {
				N = num2;// user value ,for which we have to find Prime factors

				/**
				 * iterating while loop until remainder is Zero if i divides user
				 * value(example-12) ,then i is our prime factor, if again divide then again i
				 * is our Prime factor.
				 * 
				 */
				while (N % i == 0) {

					// updating N value
					N = N / i;

					// Printing Prime Factors of user value
					System.out.println(i);
				}
			}
		}

	}

	/****************** HARMONIC NUMBER **************************/
	public static void harmonic_cal(float n) {

		float i;
		float sum = 0;
		// loop will iterate untill user value
		for (i = 1; i <= n; i++) {
			// adding reciprocal of all user value
			sum += 1 / i;
		}
		System.out.println(sum);
	}

	public static float har_check(float n) {
		// TODO Auto-generated method stub
		if (n <= 0) {
			System.out.println("enter value greater than 0 ");
			n = getInt();
		}

		if (n > 0)
			return n;

		return har_check(n);
	}

	/****************** HARMONIC NUMBER **************************/
	public static String getString() {
		string = sc.next();
		return string;

	}

	public static String replace(String string, String str, String replacewith) {
		// Using predefined method of string class
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

		int count = 0;
		// To count total Triplet generated
		int totalCount = 0;

		/**
		 * This array contains all user value from which we have to find Possible no of
		 * Triplets
		 */
		int[] userNumber = new int[range];
		System.out.println("Enter value.. ");
		// initializing array with user value

		for (int i = 0; i < range; i++)
			userNumber[i] = getInt();

		// this add will have addition of i and jthValue
		int add = 0;
		/**
		 * we are storing array value of j index in jthValue , because we print jthValue
		 * if triplet is Found
		 */
		int jthvalue = 0;

		for (int i = 0; i < userNumber.length; i++) {
			for (int j = i + 1; j < userNumber.length; j++) {

				// adding value in array at i and j index
				add = userNumber[i] + userNumber[j];
				// storing array value of j index in jthValue
				jthvalue = userNumber[j];
				if (j + 1 < userNumber.length) {
					// pointing value in array next to j index
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
		// Finding EuclideanDiatance using static squareRoot function of Math class
		double distance = Math.sqrt(x * x + y * y);
		System.out.println("The euclidian distanmce is : --- " + distance);
	}

	public static void getElapsedtime(int n) {

		long starttimer = 0;
		long endtimer = 0;
		long elapsedtime;
		if (n == 1) {
			System.out.println("Press 1 to start ....");
			// using static method of System class to get current time
			starttimer = System.currentTimeMillis();
			System.out.println("Start time is :  " + starttimer);

		}
		System.out.println("Press 2 to get end time : ");
		n = getInt();

		if (n == 2) {
			System.out.println("Press 2 to end .... ");
			endtimer = System.currentTimeMillis();
			System.out.println("end time is :  " + endtimer);
			// Printing Elapsed time
			elapsedtime = (endtimer - starttimer) / 1000;
			System.out.println(" \n Elapsed time is : " + elapsedtime);

		}

	}

	public static void quadtraticEuation(int a, int b, int c) {
		// finding delta using formula
		double delta = b * b - 4 * a * c;
		System.out.println(delta);
		// finding roots using formula
		double r1 = (-b + Math.sqrt(delta)) / (2 * a);
		System.out.println("Root of x1 " + r1);
		double r2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.println("Root of x1 " + r2);

	}

	public static void windchillFunc(double t, double v) {
		// checking if user value is less than specified range
		if (t > 50 || (v > 120 || v < 3)) {
			System.out.println("Invalid entry...");
			System.out.println("Read conditions.\n");
			System.out.println("Condition : \n1. t value is less than 50 \n2.v is greater than 3 and less than 120 ");
			System.out.println("Enter the value of using above condition : \n ");
			t = Utility1.getInt();
			v = Utility1.getInt();
			windchillFunc(t, v);// using recursion
		}
		if (t < 50 || (v < 120 || v < 3)) {
			// find windChill using formula
			double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println("Result is : " + w);
		}

	}

	public static void primecheck(int limit) {

		for (int i = 0; i < limit; i++) {
			// set status of isPrime=true
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				// check condition
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println(i + " ");
			}
		}

	}

	public static int[] getPrime() {
		int[] array = new int[1000];
		boolean isPrime = true;
		int count = 0;
		for (int i = 0; i <= 1000; i++) {
			if (i == 0 || i == 1)
				continue;
			isPrime = true;
			for (int j = 2; j <= i / 2; j++) {

				if (i % j == 0)
					isPrime = false;

			}
			if (isPrime)
				array[count++] = i;
		}
		return array;
	}

	public static void getPrimeAnagram() {
		int count1 = 0;

		// initializing array using getPrime method of Utility class
		int[] primeArray = Utility1.getPrime();

		// Counting non- zero elements of primeArray
		for (int i = 0; i < primeArray.length; i++) {
			if (primeArray[i] != 0)
				count1++;
		}
		// creating array with count1 length
		int[] x = new int[count1];

		// initializing integer array with non-zero elements of primeArray
		for (int i = 0; i < x.length; i++) {
			if (primeArray[i] != 0)
				x[i] = primeArray[i];
		}

		// creating string array with integer array length
		String[] sAray = new String[x.length];
		String[] compareAray = new String[x.length];
		for (int i = 0; i < x.length; i++) {

			// converting each integer elements into string and storing to string array
			sAray[i] = Integer.toString(x[i]);
		}
		int i = 0, j = 0, count = 0;
		String s3 = "";

		// Assigning array value to string s1
		for (int m = 0; m < sAray.length; m++) {
			String s1 = sAray[m];

			// creating character array with the size of s1.length
			char[] ch2 = new char[s1.length()];

			/**
			 * Splitting each character of string s1 using chatAt() and storing into ch2
			 * array
			 */

			for (i = 0; i < s1.length(); i++) {

				char ch = s1.charAt(i);
				ch2[i] = ch;
			}

			// Sorting characters of char array using bubble sort
			for (j = 0; j < ch2.length; j++) {
				for (int k = j + 1; k < ch2.length; k++) {

					if (ch2[j] > ch2[k]) {

						char temp = ch2[j];
						ch2[j] = ch2[k];
						ch2[k] = temp;
					}

				}
			}
			s1 = "";
			// concatenating sorted characters of a char array to String s1
			for (i = 0; i < ch2.length; i++)
				s1 = s1 + ch2[i];

			compareAray[m] = s1;

		}

		System.out.println("THe Prime Numbers that are Anagram of each other are as follows");
		for (int p = 0; p < compareAray.length; p++) {

			count = 0;
			for (int q = p + 1; q < compareAray.length; q++) {

				/**
				 * Here we are comparing sorted Strings that are stored in compareAray & but we
				 * are printing the actual integer values that are present in place of those
				 * sorted strings and we have stored those actual integer values in x array
				 */
				if (compareAray[p].equals(compareAray[q]) & (compareAray[p].equals("")) == false) {

					System.out.println(x[q]);
					compareAray[q] = "";
					count++;

				}
			}
			// printing the values from which we are comparing i.e x[p]
			if (count > 0) {
				System.out.println(x[p]);
			}

		}

	}

	public static boolean checkAnagram(String str1, String str2) {

		// replace the spaces with predefined replaceall method
		String str4 = str1.replaceAll("\\s", "");
		String str5 = str2.replaceAll("\\s", "");

		if (str4.length() != str5.length()) {
			return false;
		}
		// convert str4 tino lowercase and stored into str6
		String str6 = str4.toLowerCase();
		// convert str5 tino lowercase and stored into str7
		String str7 = str5.toLowerCase();

		// convert str6into character andsoredtnto array
		char[] str6array = str6.toCharArray();
		// use Arrays class method to manupulate array and sort it
		Arrays.sort(str6array);
		char[] str7array = str7.toCharArray();
		// use Arrays class method to manupulate array and sort it
		Arrays.sort(str7array);
		// show to status of equal whether its equal or not
		return Arrays.equals(str6array, str7array);

	}

	public static void getPalindrom() {

		System.out.println("Enter a number ");
		int n = Utility1.getInt();
		int temp = n;
		int r, sum = 0;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not a palindrome");
		}

	}

	public static void isPrimePalindrome() {
		int[] storePrimeNumbers = new int[1000];
		int[] storePalindrome = new int[1000];

		boolean isPrime = true;
		int count = 0, count1 = 0;
		for (int i = 0; i < 1000; i++) {
			if (i == 0 || i == 1)
				continue;
			isPrime = true;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;

				}
			}
			if (isPrime) {
				storePrimeNumbers[count++] = i;
			}
			if (isPrime) {
				int num = i, remainder = 0;
				int reverse = 0;
				while (num > 0) {
					remainder = num % 10;
					num = num / 10;
					reverse = reverse * 10 + remainder;
				}
				// comparing reverse with i value
				if (reverse == i)
					storePalindrome[count1++] = i;
			}
		}
		System.out.println("Prime Numbers that are Palindrome are as follows");

		for (int i = 0; i < storePalindrome.length; i++) {
			if (storePalindrome[i] > 0)
				System.out.println(storePalindrome[i]);

		}
	}

	public static void isAnagram() {

		int count = 0;
		int temp;
		int[] primeArray = Utility1.getPrime();
		for (int i = 0; i < primeArray.length; i++) {
			if (primeArray[i] != 0)
				count++;
		}
		int[] x = new int[count];
		for (int i = 0; i < x.length; i++) {
			if (primeArray[i] != 0) {
				x[i] = primeArray[i];
			}
			String[] array1 = new String[x.length];
			String[] Comparearray1 = new String[x.length];
			for (i = 0; i < x.length; i++) {
				array1[i] = Integer.toString(x[i]);
			}
			String s3 = "";
			for (int n = 0; n < array1.length; n++) {
				String s1 = array1[n];
				char[] ch1 = new char[s1.length()];
				for (i = 0; i < s1.length(); i++) {
					char ch = s1.charAt(i);
					ch1[i] = ch;
				}

				for (int j = 0; j < ch1.length; j++) {
					for (int k = j + 1; k < ch1.length; k++) {
						if (ch1[j] > ch1[k]) {
							temp = ch1[k];
							ch1[j] = ch1[k];
							ch1[k] = (char) temp;

						}
					}
				}
				s1 = "";
				for (i = 0; i < ch1.length; i++) {
					s1 = s1 + ch1[i];
				}
				Comparearray1[n] = s1;

			}

		}
	}

	public static int binarSearch(int[] arr, int m) {
		Arrays.sort(arr);
		System.out.println("Before Search... >> Sorted array ");
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j] + " ");
		}

		int first = 0;
		int last = arr.length;
		int mid = 0;
		while (first <= last) {
			mid = (first + last) / 2;

			if (arr[mid] == m) {
				return mid;
			} else if (arr[mid] < m) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}

		System.out.println("Unsussfull .... >> Not Found");
		return 1;

	}

	public static int binarySearchString(String[] strarr, String a) {
		// initialize first position
		int li = 0;
		// calculate highest position
		int hi = strarr.length - 1;
		// initialize middle element 0
		int mi = 0;
		//check that first is less than last
		while (li <= hi) {
			// calculate the middle element
			mi = (li + hi) / 2;
			// compare to method for string sorting
			if (strarr[mi].compareTo(a) == 0) {
				return mi;
			} else if (strarr[mi].compareTo(a) < 0) {
				li = mi + 1;
			}

			else {
				hi = mi - 1;
			}
		}
		//print if element not found and return 1
		System.out.println("element not found");
		return 1;

	}

	public static void insertionSort(int[] arr) {
		//intialize the variables
		
		int temp, i, j;
		
		for (i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i;

			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;

		}
		System.out.println();
		
		System.out.println("After Insertionsort.....  \n ");
		for (i = 0; i < arr.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}

	}

	public static String[] insertionSortString(String[] strarr, int a) {

		String temp = "";
		for (int i = 0; i < a; i++) {
			for (int j = i + 1; j < a; j++) {
				if (strarr[i].compareToIgnoreCase(strarr[j]) > 0) {
					temp = strarr[i];
					strarr[i] = strarr[j];
					strarr[j] = temp;
				}
			}
		}

		return strarr;
	}

	public static void bubblesort_for_int(int[] intarray) {
		int temp;

		for (int i = 0; i < intarray.length; i++) {
			for (int j = i + 1; j < intarray.length; j++) {
				if (intarray[i] > intarray[j]) {
					temp = intarray[i];
					intarray[i] = intarray[j];
					intarray[j] = temp;

				}
			}
		}
		for (int i = 0; i < intarray.length; i++) {
			System.out.println(intarray[i]);
		}

	}

	public static String[] bubblesort_string(String[] strarray, int a) {
		String temp;

		for (int i = 0; i < a; i++) {
			for (int j = i + 1; j < a; j++) {
				if (strarray[i].compareTo(strarray[j]) > 0) {
					temp = strarray[i];
					strarray[i] = strarray[j];
					strarray[j] = temp;

				}
			}

		}
		return strarray;
	}

	public static int[] sort(int[] filearray) {

		int temp;
		int[] a = { 1, 2, 3, 5, 4, 6 };
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.println(" " + a[k]);
		}
		return filearray;
	}

	public static void bubble_sort_file(int[] filearray) {
		int temp;

		for (int i = 0; i < filearray.length; i++) {
			for (int j = i + 1; j < filearray.length; j++) {
				if (filearray[i] > filearray[j]) {
					temp = filearray[i];
					filearray[i] = filearray[j];
					filearray[j] = temp;

				}
			}
		}
		for (int i = 0; i < filearray.length; i++) {
			System.out.println(filearray[i]);
		}

	}

	public static int dayofweek(int day, int month, int year) {

		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (day + x + 31 * m0 / 12) % 7;
		return d0;
	}

	public static double getFaranite(double tempreture) {

		tempreture = (tempreture * 9 / 5) + 32;
		return tempreture;

	}

	public static double getCelcius(double tempreture) {
		tempreture = (tempreture - 32) * 5 / 9;
		return tempreture;
	}

	public static void monthlyPayment(double P, double Y, double R) {

		double payment;
		double r = R / (12 * 100);
		double n = 12 * Y;

		double upper = P * r;
		double first = (1 + r);
		double second = Math.pow(first, (-1 * n));
		double third = 1 - second;
		payment = upper / third;
		System.out.println(payment);

	}

	public static void toBinary(int n) {

		String string1 = "";
		int remainder;

		while (n > 0) {
			remainder = n % 2;
			string1 = string1 + "" + remainder;
			n = n / 2;
		}

		char[] string3 = string1.toCharArray();
		for (int i = string3.length - 1; i >= 0; i--) {
			System.out.println(string3[i]);
		}

	}

	public static void getProbability(int n) {
		Random r = new Random();
		float heads = 0;

		// loop will iterate till user value
		for (int i = 1; i <= n; i++) {

			// it generates random value less than 2
			int side = r.nextInt(2);

			// considering 1 as head
			if (side == 1) {
				heads++;
			}
		}

		// finding head percentage
		float headpercet = heads / n * 100;

		float tailpercent = 100 - headpercet;
		System.out.println("Percentage of head :" + headpercet);
		System.out.println("Percentage of tail :" + tailpercent);

	}

	public static void gamblingResult(int stake, int goal, float times) {
		float wincount = 0, losecount = 0;
		Random r = new Random();

		// iterating loop till no of times user Entered
		for (int i = 1; i <= times; i++) {

			// this will generate numbers less than two means 0 or 1
			int j = r.nextInt(2);

			// Considering 1 as win
			if (j == 1)
				wincount++;
			else
				losecount++;// considering Zero as lose

		}
		// Performing Type casting from float to integer
		int wincountcasting = (int) wincount;
		System.out.println("No of times wins =>" + wincountcasting);

		System.out.println(
				"win Percentage =>" + (wincount / times) * 100 + " " + "Lose Percentage " + (losecount / times) * 100);

	}

	public static int[][] get2DArrayInput(int M, int N) {

		int[][] input2DArray = new int[M][N];
		System.out.println("Now enter values");

		// initializing user values to 2D array
		for (int i = 0; i < M; i++) {

			for (int j = 0; j < N; j++) {

				input2DArray[i][j] = getInt();
			}
		}

		// returning array having user value
		return input2DArray;

	}

	public static void getPrimePalindrome() {
		int[] storePrime = new int[1000];
		int[] storePalindrome = new int[1000];
		boolean isPrime = true;
		int count = 0, count1 = 0;
		for (int i = 0; i <= 1000; i++) {
			if (i == 0 || i == 1)
				continue;

			isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {

				if (i % j == 0)
					isPrime = false;
			}

			if (isPrime) {

				storePrime[count++] = i;

			}

			if (isPrime) {
				int num = i, remainder = 0;
				int reverse = 0;
				while (num > 0) {
					remainder = num % 10;
					num = num / 10;
					reverse = reverse * 10 + remainder;
				}
				// comparing reverse with i value
				if (reverse == i)
					storePalindrome[count1++] = i;
			}
		}
		System.out.println("Prime Numbers that are Palindrome are as follows");

		for (int i = 0; i < storePalindrome.length; i++) {
			/**
			 * storePlaindrome is integer array , so we are printing value greater than zero
			 */
			if (storePalindrome[i] > 0)
				System.out.println(storePalindrome[i]);

		}

	}

	public static int getBinary_Search_String(String[] strarr, String a) {
		int li = 0;
		int hi = strarr.length - 1;
		int mi = 0;

		while (li <= hi) {
			mi = (li + hi) / 2;
			if (strarr[mi].compareTo(a) == 0) {
				return mi;
			} else if (strarr[mi].compareTo(a) < 0) {
				li = mi + 1;
			}

			else {
				hi = mi - 1;
			}
		}

		System.out.println("element not found");
		return 1;

	}

	public static void sortString(String[] strarr) {
		int l = strarr.length;
		for (int i = 1; i < l; i++) {
			String key = strarr[i];// initialize the element in the key
			int j = i - 1;
			while (j >= 0 && strarr[j].compareTo(key) > 0) {
				strarr[j + 1] = strarr[j];// swap the var
				j = j - 1;
			}
			strarr[j + 1] = key;// again the swap

		}
	}

}