package Alogithm_Pg;

import Utility.Utility1;

public class Date {
public static void main(String[] args) {
	
	int day=Integer.parseInt(args[0]);
	int month=Integer.parseInt(args[1]);
	int year=Integer.parseInt(args[2]);
	
	int result=Utility1.dayofweek(day, month, year);
	String arr[]= {"sunday","monday","tuesday","wednesday","thurday","friday","saturday",};
	System.out.println(arr[result]);
}
}
