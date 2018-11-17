package File_sort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


import Utility.Utility1;

public class FileBinarySearch_Int {
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
		for(int k=0;k<filearray.length;k++)
		{
			System.out.println(filearray[k]);
		}
		sortArray(filearray);
		return filearray;
	}

	public static void sortArray(int[] filearray) {

		Arrays.sort(filearray);
		System.out.println("After sorting > > > " );
		for(int k=0;k<filearray.length;k++)
		{
			System.out.println(filearray[k]);
		}
		System.out.println("The value in comma separated... ");
		System.out.println(Arrays.toString(filearray));
		System.out.println("Enter the key you want to search....!");
		int key = Utility1.getInt();
		int mid=binarySearchfile(filearray, key);
		
		System.out.println("The enetered value should be present in "+ mid + " position");

	}

	public static int binarySearchfile(int[] filearray, int key) {

		int first = 0;
		int last = filearray.length;
		int mid = 0;
		while (first <= last) {
			mid = (first + last) / 2;

			if (filearray[mid] == key) {
				return mid;
			} else if (filearray[mid] < key) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}
		System.out.println("Unsussfull .... >> Not Found");
		return 1;
		
	

	}

	

}
