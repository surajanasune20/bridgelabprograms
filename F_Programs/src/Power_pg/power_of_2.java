


package Power_pg;

import Utility.Utility1;

public class power_of_2 {
	
	public static void main(String[] args) {
		//user input from command line argument
		int limit = Integer.parseInt(args[0]);
		//calling utility1 class method
		Utility1.power_check(limit);
	}
}
