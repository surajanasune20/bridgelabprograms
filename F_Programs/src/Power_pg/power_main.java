package Power_pg;

import Utility.Utility1;

public class power_main {
	public static void main(String[] args) {
		System.out.println("Enter the limit............. ! ");
		int limit = Integer.parseInt(args[0]);
		Utility1.power_check(limit);
	}
}
