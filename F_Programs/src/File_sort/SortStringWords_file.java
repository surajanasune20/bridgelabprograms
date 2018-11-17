package File_sort;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

import Utility.Utility1;

public class SortStringWords_file {
	public static void main(String[] args) throws Exception {

		String[] data = readFiles("pqr.txt");

	}

	public static String[] readFiles(String file) throws Exception {
		File f = new File(file);
		Scanner sc = new Scanner(f);
		int counter = 0;
		while (sc.hasNext()) {
			counter++;
			sc.nextLine();
		}
		String[] filearray = new String[counter];
		Scanner sc1 = new Scanner(f);
		System.out.println("Before Sort.. \n ");
		for (int i = 0; i < filearray.length; i++) {
			filearray[i] = sc1.next();
			System.out.println(filearray[i]);
		}
		System.out.println();

		sortArray(filearray);
		return filearray;
	}

	public static void sortArray(String[] filearray) {

		Arrays.sort(filearray);
		System.out.println("After sorting > > >  \n ");

		System.out.print(Arrays.toString(filearray));
		System.out.println(" \n ");

	}

	public static String[] binarySearchfile(String[] filearray) {

		String temp = "";
		for (int i = 0; i < filearray.length; i++) {
			for (int j = i + 1; j < filearray.length; j++) {
				if (filearray[i].compareToIgnoreCase(filearray[j]) > 0) {
					temp = filearray[i];
					filearray[i] = filearray[j];
					filearray[j] = temp;
				}
			}
		}
		return filearray;

	}
}
