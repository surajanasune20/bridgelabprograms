package File_sort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import Utility.Utility1;

public class Bubble_sort_int_file {
	public static void main(String[] args) throws Exception {
		int[] data = readFiles("abc.txt");

	}

	public static int[] readFiles(String file) throws Exception {
		File f = new File(file);
		Scanner sc = new Scanner(f);
		int counter = 0;
		while (sc.hasNextInt()) {
			counter++;
			sc.nextInt();
		}
		int[] filearray = new int[counter];
		Scanner sc1 = new Scanner(f);
		for (int i = 0; i < filearray.length; i++) {
			filearray[i] = sc1.nextInt();
		}

		System.out.println("Before Sort..");
		for (int k = 0; k < filearray.length; k++) {
			System.out.println(filearray[k]);
		}
		
		System.out.println("After Bubble Sort...");
		Utility1.bubble_sort_file(filearray);
		
		return filearray;
	}


}
