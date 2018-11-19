package harmonic_ex;

import Utility.Utility1;

public class harmonic_main {
public static void main(String[] args) {
	//Taking value from user
	System.out.println("Enter the harmonic value n ... ");
	float num=Utility1.getfloat();
	//calling method from utility class
	Utility1.har_check(num);
	//calling method from utility class
	Utility1.harmonic_cal(num);
	
}
}
