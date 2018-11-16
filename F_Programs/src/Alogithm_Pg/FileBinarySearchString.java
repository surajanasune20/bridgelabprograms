package Alogithm_Pg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileBinarySearchString {
	public static void main(String[] args) throws Exception {

		String[] data = readFiles("abc.txt");
		FileInputStream fin = new FileInputStream("pqr.txt");
	}

	private static String[] readFiles(String file) throws Exception {
		File f = new File(file);
		Scanner sc = new Scanner(f);
		int counter=0;
		while(sc.hasNextLine())
		{
			counter++;
			sc.hasNext();
		}
		String[] strArray=new String[counter];

		return null;
		
		
	}
}
