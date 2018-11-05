package com.bridgeLab;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();
		int count = 0;
		while (year != 0) {
			year = year / 10;
			++count;
		}
		if (count < 4)
			return;
		else if(count >=4)
		{
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a Leap year");
				}
			} else {
				System.out.println("Not a leap year");
			}
		}
	}
}