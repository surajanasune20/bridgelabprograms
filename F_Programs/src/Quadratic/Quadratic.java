package Quadratic;

import Utility.Utility1;

public class Quadratic {

	public static void main(String[] args) {

		System.out.println("Enter the values for quadratic equations ..");
		System.out.println("Enter the first value :  ");
		int a=Utility1.getInt();
		System.out.println("Enter the Second value :  ");
		int b=Utility1.getInt();
		System.out.println("Enter the Third value :  ");
		int c=Utility1.getInt();
		Utility1.quadtraticEuation(a,b,c);
	}

}
