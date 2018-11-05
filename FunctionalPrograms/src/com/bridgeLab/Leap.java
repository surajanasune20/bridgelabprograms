package com.bridgeLab;

class Leap { 
 
    /* Driver program to test above function */
    public static void main(String[] args) 
    { 
        int year=200;
        Leap1 l=new Leap1();
        int co=l.countDigit(year);
        if(co==4)
        {
        	if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a Leap year");
				}
			} else 
			{
				System.out.println("Not a leap year");
			}
        }
        else
        {
        	System.out.println("year must have four digit...");
        }
        //System.out.print("Number of digits : " + countDigit(year)); 
    } 
} 