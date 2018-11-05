package com.bridgeLab;

import java.util.Scanner;

public class Replace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "Hello <<Username>> ,How are you ";
		String[] s1 = s.split(" ");
		s1[1]=sc.nextLine();
		//System.out.println("Enter a name ... ");
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i] + " ");
		}
	}
}
