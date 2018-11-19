package Alogithm_Pg;

import Utility.Utility1;

public class MOnthly_Payment {
public static void main(String[] args) {
	double P=Double.parseDouble(args[0]);
	double Y=Double.parseDouble(args[1]);
	double R=Double.parseDouble(args[2]);
	Utility1.monthlyPayment(P,Y,R);
}
}
