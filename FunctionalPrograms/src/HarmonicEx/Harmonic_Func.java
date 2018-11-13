package HarmonicEx;

import java.util.Scanner;

public class Harmonic_Func {

	public void harmonic_cal(float n) {
		
		float i;
		float sum = 0;

		for (i = 1; i <= n; i++) {
				sum += 1 / i;
			}
			System.out.println(sum);
		} 
	public float check(float n) {
		// TODO Auto-generated method stub
		if(n==0)
		{
			System.out.println("Enter value greater than 0....");
			n=new Scanner(System.in).nextFloat();
		}
		if(n>0)
		{
			return n;
		}
		return check(n);
	}
}
