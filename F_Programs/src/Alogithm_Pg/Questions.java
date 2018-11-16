package Alogithm_Pg;

public class Questions {
	public static void main(String[] args) {
		int range;
		int n=Integer.parseInt(args[0]);
		range=(int) Math.pow(2, n-1);
		System.out.println("Take a number in between 0 to " +range);
	}
}
