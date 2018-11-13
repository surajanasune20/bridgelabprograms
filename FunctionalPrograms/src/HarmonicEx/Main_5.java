package HarmonicEx;

import java.util.Scanner;


public class Main_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the harmonic value n ... ");
		float n = sc.nextFloat();
		Harmonic_Func h = new Harmonic_Func();
		n=h.check(n);
		h.harmonic_cal(n);

	}

}
