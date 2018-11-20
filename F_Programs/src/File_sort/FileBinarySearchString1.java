package File_sort;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

import Utility.Utility1;

public class FileBinarySearchString1 {
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
		System.out.println(" Enter the string you want to search.... > > > ! \n ");
		
		String key = Utility1.getString();
		int mid = binarySearchfile(filearray, key);
		if(mid!=1)
		System.out.println("The enetered string should be present in " + mid + " position");

	}

	public static int binarySearchfile(String[] filearray, String key) {

		int first = 0;
		int last = filearray.length;
		int mid = 0;
		while (first <= last) {
			mid = (first + last) / 2;

			if (filearray[mid].compareTo(key) == 0) {
				return mid;
			} else if (filearray[mid].compareTo(key) < 0) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}
		System.out.println("Unsussfull .... >> Not Found");
		return 1;

	}

}