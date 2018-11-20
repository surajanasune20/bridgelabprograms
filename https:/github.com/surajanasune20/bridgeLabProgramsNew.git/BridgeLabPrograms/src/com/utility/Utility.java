package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	static String string;
	static int num;
	static double doublenum;
	static Scanner sc = new Scanner(System.in);

	public static String getString() {
		string = sc.next();
		return string;

	}

	public static double getDouble() {
		doublenum = sc.nextDouble();
		return doublenum;
	}

	public static String getStringLine() {
		string = sc.nextLine();
		return string;

	}

	public static String replace(String template, String name, String replacewith) {
		// Using predefined method of string class
		String finalString = template.replace(name, replacewith);
		return finalString;
	}

	public static int getInt() {
		num = sc.nextInt();
		return num;
	}

	public static int[] getPrime() {
		int[] primeArray = new int[1000];
		int count = 0;
		boolean isPrime = true;
		for (int i = 0; i < 1000; i++) {
			if (i == 0 || i == 1)
				continue;
			isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				primeArray[count++] = i;
			}
		}
		return primeArray;

	}

	public static void getFlipCoinPercentage(int n) {
		Random r = new Random();
		float heads = 0;
		// loop will iterate till user value
		for (int i = 1; i <= n; i++) {
			// it generates random value less than 2
			int value = r.nextInt(2);
			// considering 1 as head
			if (value == 1) {
				heads++;
			}
		}
		// finding head percentage
		float headpercent = heads / n * 100;

		float tailpercent = 100 - headpercent;
		System.out.println("Percentage of head : " + headpercent);
		System.out.println("Percentage of tail : " + tailpercent);

	}

	/**
	 * This method is used to determine whether given two Strings are anagram of
	 * each other or not
	 * 
	 * @param firstString
	 * @param secondString
	 */
	public static void checkAnagram(String firstString, String secondString) {
		String spaceFirstString = ""; // initialize empty string
		String spaceSecondString = "";//// initialize empty string

		// check if any spaces comes
		for (int i = 0; i < firstString.length(); i++) {
			char ch = firstString.charAt(i);
			if (ch == ' ')
				continue;
			spaceFirstString += ch;
		}
		firstString = "";
		// convert into lowercase
		firstString = spaceFirstString.toLowerCase();
		// check if any spaces comes in second string
		for (int j = 0; j < secondString.length(); j++) {
			char ch = secondString.charAt(j);
			if (ch == ' ')
				continue;
			spaceSecondString += ch;
		}
		// initalize empty string
		secondString = "";
		// convert into lowercase
		secondString = spaceSecondString.toLowerCase();

		// make character array for storing firstString character
		char[] storeCharFirstString = new char[firstString.length()];
		// make character array for storing secondstring character
		char[] storeCharSecondString = new char[secondString.length()];

		// take firstString character and store into array
		for (int i = 0; i < firstString.length(); i++) {

			char ch = firstString.charAt(i);
			storeCharFirstString[i] = ch;
		}
		// take secondString character and store into array
		for (int i = 0; i < secondString.length(); i++) {

			char ch = secondString.charAt(i);
			storeCharSecondString[i] = ch;
		}
		// check anagram condition
		for (int i = 0; i < storeCharFirstString.length; i++) {
			for (int j = i + 1; j < storeCharSecondString.length; j++) {
				if (storeCharFirstString[i] > storeCharFirstString[j]) {
					char ch = storeCharFirstString[i];
					storeCharFirstString[i] = storeCharFirstString[j];
					storeCharFirstString[j] = ch;
				}
			}
		}
		// initialize empty string
		firstString = "";
		for (int i = 0; i < storeCharFirstString.length; i++) {
			firstString += storeCharFirstString[i];
		}

		for (int i = 0; i < storeCharSecondString.length; i++) {
			for (int j = i + 1; j < storeCharSecondString.length; j++) {
				if (storeCharSecondString[i] > storeCharSecondString[j]) {
					char ch = storeCharSecondString[i];
					storeCharSecondString[i] = storeCharSecondString[j];
					storeCharSecondString[j] = ch;
				}
			}
		}
		// initialize empty string
		secondString = "";
		for (int i = 0; i < storeCharSecondString.length; i++) {
			secondString += storeCharSecondString[i];
		}
		// compares a string on specified object
		if (firstString.equals(secondString)) {
			System.out.println("both String are anagram to each other ");
		} else {
			System.out.println("both String are not anagram to each other ");
		}

	}

	/**
	 * Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
	 * 
	 * @param limit
	 */

	public static void checkPrime(int limit) {
		// initialize status true
		boolean isPrime = true;
		for (int i = 0; i < limit; i++) {
			// check if 0 or 1 then continue
			if (i == 0 || i == 1)
				continue;

			isPrime = true;

			for (int j = 2; j <= i / 2; j++) {
				// if 0 then false
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			// if true then print
			if (isPrime) {
				System.out.println(i + "");
			}
		}

	}

	/**
	 * Extend the above program to find the prime numbers 
	 * that are Anagram and Palindrome
	 */
	public static void checkPrimePalindrome() {
		int[] storePrimeNumbers = new int[1000];
		int[] storePalindromes = new int[1000];
		boolean isPrime = true;
		int count = 0, count1 = 0;

		for (int i = 0; i < 1000; i++) {
			if (i == 0 || i == 1)
				continue;
			isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				storePrimeNumbers[count++] = i;
			}

			if (isPrime) {
				num = i;
				int remainder = 0;
				int reverse = 0;
				while (num > 0) {
					remainder = num % 10;
					num = num / 10;
					reverse = reverse * 10 + remainder;

				}
				if (reverse == i) {
					storePalindromes[count1++] = i;
				}
			}

		}
		for (int k = 0; k < storePalindromes.length; k++) {
			if (storePalindromes[k] > 0)
				System.out.println(storePalindromes[k]);
		}

	}

	/**
	 * Extend the above program to find the prime numbers that are Anagram and
	 * Palindrome
	 * 
	 */
	public static void checkPrimeAnagram() {
		int count1 = 0;

		// initializing array using getPrime method of Utility class
		int[] primeArray = Utility.getPrime();

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

	public static String[] sortString(String[] strarr) {
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
		return strarr;
	}

	public static int[] sort(int[] filearray) {

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
		return filearray;
	}

	public static void binarySearchForInteger() {
		System.out.println("Enter how many elements you want to enter ");
		int num = Utility.getInt();
		int[] arrayInt = new int[num];
		System.out.println("Enter the elements");
		for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = Utility.getInt();
		}
		int[] fileArray = Utility.sort(arrayInt);
		System.out.println("After Sorted Array is : ");
		for (int i = 0; i < fileArray.length; i++) {
			if (i > 0) {
				System.out.print(",");
			}
			System.out.print(fileArray[i]);
		}
		System.out.println();
		System.out.println("Enter the element you want to search.. \n ");
		int searchElement = Utility.getInt();
		int mid = binarySearch(fileArray, searchElement);
		if (mid != -1) {
			System.out.println("Element is found at " + mid + " position");
		}

	}

	private static int binarySearch(int[] fileArray, int searchElement) {
		int first = 0;
		int last = fileArray.length;
		int mid = 0;
		while (first <= last) {
			mid = (first + last) / 2;

			if (fileArray[mid] == searchElement) {
				// System.out.println("Element at "+mid);
				return mid;
			} else if (fileArray[mid] < searchElement) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}
		System.out.println("Unsussfull .... >> Not Found");
		return -1;
		// long endtime = System.currentTimeMillis();
		// System.out.println("Elapsed time is : " + (starttime - endtime) / 1000);
	}

	public static void binarySearchForString() {
		System.out.println("Enter how many elements you want to enter ");
		int num = Utility.getInt();
		String[] strarr = new String[num];
		System.out.println(" Enter the elements... ");
		for (int i = 0; i < strarr.length; i++) {
			strarr[i] = Utility.getString();
		}
		Utility.sortString(strarr);
		;
		System.out.println("> > After Sorting < < ");
		for (int i = 0; i < strarr.length; i++) {
			System.out.println(strarr[i]);
		}
		System.out.println("\n  Enter the elements you want to search... ");
		String a = Utility.getString();
		int mi = Utility.getBinarySearchString(strarr, a);
		if (mi != -1)
			System.out.println("Element is ata " + mi + " index position");

	}

	public static int getBinarySearchString(String[] strarr, String a) {
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
		return -1;

	}

	public static void getInsertionSortInteger() {
		System.out.println("Enter the number of elements : ");
		// accept elements
		int num = Utility.getInt();
		// initialize array with elements size
		int[] arr = new int[num];
		// Enter the elements and print it
		System.out.println(" Enter the elements... ");
		for (int i = 0; i < num; i++) {
			arr[i] = Utility.getInt();

		}
		// Enter the elements before sort
		System.out.println("Before Insertion sort :  .. ");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}

		System.out.println();
		// call insertion sort method using Utility class method
		Utility.insertionSort(arr);

	}

	public static void insertionSort(int[] arr) {
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

	public static void getInsertionSortString() {
		System.out.println("Enter the number of elements : ");
		int num = Utility.getInt();
		String[] strarr = new String[num];
		System.out.println(" Enter the elements... ");
		for (int i = 0; i < strarr.length; i++) {
			strarr[i] = Utility.getString();
		}
		int a = strarr.length;
		// String sortedArray=sort_sub(strarr,strarr.length);
		String[] sortedArray = Utility.insertionSortString(strarr);
		System.out.println(" > >  After insertion sort < < ");
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}

	}

	private static String[] insertionSortString(String[] strarr) {
		String temp = "";
		for (int i = 0; i < strarr.length; i++) {
			for (int j = i + 1; j < strarr.length; j++) {
				if (strarr[i].compareToIgnoreCase(strarr[j]) > 0) {
					temp = strarr[i];
					strarr[i] = strarr[j];
					strarr[j] = temp;
				}
			}
		}

		return strarr;

	}

	public static void getBubbleSortInteger() {
		System.out.println("Enter the number of elements : ");
		// accept elements
		int num = Utility.getInt();
		// initialize array with elements size
		int[] arr = new int[num];
		// Enter the elements and print it
		System.out.println(" Enter the elements... ");
		for (int i = 0; i < num; i++) {
			arr[i] = Utility.getInt();

		}
		// Enter the elements before sort
		System.out.println("Before Bubble sort :  .. ");
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}

		System.out.println();
		Utility.bubbleSortForInt(arr);

	}

	public static void bubbleSortForInt(int[] arr) {
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		System.out.println("After Bubble Sort..");
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				System.out.print(", ");
			}
			System.out.print(arr[i]);
		}

	}

	public static void getBubbleSortString() {
		System.out.println("Enter the number of elements : ");
		int num = Utility.getInt();
		String[] strarr = new String[num];
		System.out.println(" Enter the elements... ");
		for (int i = 0; i < strarr.length; i++) {
			strarr[i] = Utility.getString();
		}
		int a = strarr.length;
		// String sortedArray=sort_sub(strarr,strarr.length);
		String[] sortedArray = Utility.bubbleSortString(strarr);
		System.out.println(" After Bubble sort");
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.println(sortedArray[i]);
		}

	}

	public static String[] bubbleSortString(String[] strarr) {
		String temp;

		for (int i = 0; i < strarr.length; i++) {
			for (int j = i + 1; j < strarr.length; j++) {
				if (strarr[i].compareTo(strarr[j]) > 0) {
					temp = strarr[i];
					strarr[i] = strarr[j];
					strarr[j] = temp;

				}
			}

		}
		return strarr;

	}

	/**
	 * Read in a list of words from File. Then prompt the user to enter a word to
	 * search the list. The program reports if the search word is found in the list.
	 * 
	 * @param string2
	 * @return
	 * @throws Exception
	 */
	public static String[] readFiles(String string2) throws Exception {
		// create on efile object and read data
		File f = new File(string2);
		// create scanner class object to read the contents
		Scanner sc = new Scanner(f);
		// set counter 0 to count word in list
		int counter = 0;
		// check if next element is in list or not
		while (sc.hasNext()) {
			counter++;
			sc.nextLine();
		}
		// initialize filearray with counter size
		String[] filearray = new String[counter];
		// create on emore scanner object to read file contents
		Scanner sc1 = new Scanner(f);
		// print output befoe sort
		System.out.println("Before Sort.. \n ");
		for (int i = 0; i < filearray.length; i++) {
			filearray[i] = sc1.next();
			System.out.println(filearray[i]);
		}
		System.out.println();
		// call method of Utility class to sort the string
		Utility.sortString(filearray);

		System.out.println(Arrays.toString(filearray));
		// Accept the key you want to search
		System.out.println("Enter the word you want to search in list");
		String key = Utility.getString();
		// call method in utility class
		int mid = getBinarySearchString(filearray, key);
		if (mid != -1)
			// print the position
			System.out.println("The entered string should be present in " + mid + " position");
		return filearray;
	}

	/**Reads in strings from standard input and prints them in sorted order.
Uses insertion sort.
	 * @param string2
	 * @return
	 * @throws Exception
	 */
	public static String[] readFilesForInsertionSort(String string2) throws Exception {
		// create on efile object and read data
		File f = new File(string2);
		// create scanner class object to read the contents
		Scanner sc = new Scanner(f);
		// set counter 0 to count word in list
		int counter = 0;
		// check if next element is in list or not
		while (sc.hasNext()) {
			counter++;
			sc.nextLine();
		}
		// initialize filearray with counter size
		String[] filearray = new String[counter];
		// create on emore scanner object to read file contents
		Scanner sc1 = new Scanner(f);
		// print output befoe sort
		System.out.println("Before Sort.. \n ");
		for (int i = 0; i < filearray.length; i++) {
			filearray[i] = sc1.next();
			System.out.println(filearray[i]);
		}
		System.out.println();
		// call method of Utility class to sort the string
		System.out.println("After sort..");
		insertionSortString(filearray);
		for (int i = 0; i < filearray.length; i++) {
			System.out.print(filearray[i] + ",");
		}
		// Accept the key you want to search

		return filearray;
	}

	/**Reads in integers prints them in sorted order using Bubble Sort
	 * @param string2
	 * @return
	 * @throws Exception
	 */
	public static String[] readFilesForBubbleSort(String string2) throws Exception {
		// create on efile object and read data
		File f = new File(string2);
		// create scanner class object to read the contents
		Scanner sc = new Scanner(f);
		// set counter 0 to count word in list
		int counter = 0;
		// check if next element is in list or not
		while (sc.hasNext()) {
			counter++;
			sc.nextLine();
		}
		// initialize filearray with counter size
		String[] filearray = new String[counter];
		// create on emore scanner object to read file contents
		Scanner sc1 = new Scanner(f);
		// print output befoe sort
		System.out.println("Before Sort.. \n ");
		for (int i = 0; i < filearray.length; i++) {
			filearray[i] = sc1.next();
			System.out.println(filearray[i]);
		}
		System.out.println();
		// call method of Utility class to sort the string
		System.out.println("After sort..");
		// call method from utility class
		bubbleSortString(filearray);
		for (int i = 0; i < filearray.length; i++) {
			System.out.print(filearray[i] + ",");
		}
		// Accept the key you want to search

		return filearray;
	}

	/**o the Util Class add dayOfWeek static function
	 * that takes a date as input and prints the day of the week that date falls on.
	 * @param day
	 * @param month
	 * @param year
	 * @return
	 */
	public static int dayOfWeek(int day, int month, int year) {
		// predefined formula
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (day + x + 31 * m0 / 12) % 7;
		return d0;
	}

	/**
	 * To the Util Class add temperaturConversion static function, given the
	 * temperature in fahrenheit as input outputs the temperature in Celsius or
	 * viceversa using the formula
	 * 
	 * @param tempreture
	 * @return
	 */
	public static double getFaranite(double tempreture) {
		// formula to print tempreture in faranite form
		tempreture = (tempreture * 9 / 5) + 32;
		return tempreture;

	}

	/**
	 * To the Util Class add temperaturConversion static function, given the
	 * temperature in fahrenheit as input outputs the temperature in Celsius or
	 * viceversa using the formula
	 * 
	 * @param tempreture
	 * @return
	 */
	public static double getCelcius(double tempreture) {
		// formula to print tempreture in getCelcius form
		tempreture = (tempreture - 32) * 5 / 9;
		return tempreture;
	}

	/**
	 * Write a Util Static Function to calculate monthlyPayment that reads in three
	 * command-line arguments P, Y, and R and calculates the monthly payments you
	 * would have to make over Y years to pay off a P principal loan amount at R per
	 * cent interest compounded monthly.
	 * 
	 * @param P
	 * @param Y
	 * @param R
	 */
	public static void monthlyPayment(double P, double Y, double R) {
		// initialize the payemtn ad a variable
		double payment;
		double r = R / (12 * 100);
		double n = 12 * Y;

		double upper = P * r;
		double first = (1 + r);
		// predefined power function
		double second = Math.pow(first, (-1 * n));
		double third = 1 - second;
		payment = upper / third;
		// print
		System.out.println(payment);
	}

	/**
	 * Write a static function sqrt to compute the square root of a nonnegative
	 * number c given in the input using Newton's method:
	 * 
	 * @param c
	 */
	public static void sqrtNonNegativeNumber(double num) {
		double t = num;
		double epsilon = 1e-15;
		//calculate t with predefined formula upto its value is greter than t
		while (Math.abs(t - num / t) > epsilon * t) {
			t = (num / t + t) / 2.0;
		}
		System.out.println(t);
	}

	/**Write a static function toBinary that outputs
	 * the binary (base 2) representation of the decimal number typed as the input.
	 * @param num
	 * @return
	 */
	public static String convertBinary(int num) {

		String s = "";
		while (num >= 1) {
			s += num % 2;
			num = num / 2;
		}
		String s2 = "";
		for (int start = s.length() - 1; start >= 0; start--) {
			s2 += s.charAt(start);
		}
		return s2;
		/*
		 * String s = ""; if (num >= 0 && num <= 255) { String string1 = ""; int
		 * remainder; while (num > 0) { remainder = num % 2; string1 = string1 + "" +
		 * remainder;
		 * 
		 * num = num / 2; } char[] string3 = string1.toCharArray();
		 * 
		 * for (int i = string3.length - 1; i >= 0; i--) { s = s + string3[i]; }
		 * 
		 * } else {
		 * System.out.println("Enter the value less than 255 or gretter than 0");
		 * num=Utility.getInt(); convertBinary(num); } int result = Integer.parseInt(s);
		 * 
		 * String padded = String.format("%08d", result); return padded;
		 */
	}

	/**Write Binary.java to read an integer as an Input, convert 
	 * to Binary using toBinary function and perform the following functions
	 * @param Number
	 * @return
	 */
	public static int convertBinaryNibbles(int Number) {

		String binaryString = convertBinary(Number);
		int x = 8 - binaryString.length();
		String s = "";
		for (int i = 0; i < x; i++) {
			s += "0";
		}

		binaryString = s + binaryString;
		String firstnibble = binaryString.substring(0, 4);
		String secondnibble = binaryString.substring(4);
		binaryString = secondnibble + firstnibble;
		s += "0";
		x = 1;
		int changeNumber = 0;
		for (int start = binaryString.length() - 1; start >= 0; start--) {
			changeNumber = changeNumber + (Integer.parseInt(binaryString.charAt(start) + "")) * x;
			x = x * 2;
		}
		return changeNumber;
	}

	/**There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be returned by Vending Machine. 
	 * Write a Program to calculate the minimum number of Notes as well as the Notes to be 
	 * returned by the Vending Machine as a Change

	 * @param Price
	 */
	public static void vendingMachineCounter(int Price) {
		//intialize noteType array
		int NoteType[] = { 1, 2, 5, 10, 50, 100, 500, 1000 };
		//initalie array with noteType count size
		int NoteCount[] = new int[NoteType.length];
		
		for(int i=NoteType.length-1;i>=0;i--)
		{
			NoteCount[i]=Price/NoteType[i];
			Price=Price%NoteType[i];
		}
		
		for(int j=NoteType.length-1;j>=0;j--)
		{
			if(NoteCount[j]==0)
				continue;
			System.out.println(NoteType[j]+ " -- > " + NoteCount[j]);
		}
		
		
		
		
		
		
	}
}
