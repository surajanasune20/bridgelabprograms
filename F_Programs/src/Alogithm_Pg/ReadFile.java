package Alogithm_Pg;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

import Utility.Utility1;

public class ReadFile {
	public static void main(String[] args) throws Exception {

		int[] data = Utility1.readFiles("abc.txt");
		System.out.println(Arrays.toString(data));
		
	

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
		int a = 7;
		// binarySearch(filearray, a);

		return filearray;
	}
}
