package com.bridgeLab;

public class Leap1 {
	  static int countDigit(long year) 
	    { 
	        int count = 0; 
	        while (year != 0) { 
	            year = year / 10; 
	            ++count; 
	        } 
	        return count; 
	    } 
}
