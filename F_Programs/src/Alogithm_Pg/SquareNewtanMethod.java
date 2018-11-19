package Alogithm_Pg;

import Utility.Utility1;

public class SquareNewtanMethod {
	public static void main(String[] args) {
		double c = Double.parseDouble(args[0]);
		Utility1.sqareNewtonMethod(c);
		double t = c;
		double epsilon = 1e-15;
		while (Math.abs(t - c / t) > epsilon * t) {
			t = (c / t + t) / 2.0;
		}
		System.out.println(t);
	}
}
