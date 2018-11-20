


/******************************************************************************
 *  Purpose:To Determine WindChill or Effective Temperature.
 *
 *  @author  Suraj
 *  @version 1.0
 *  @since   13-11-2018
 *
 ******************************************************************************/


package WindChill;

import Utility.Utility1;

public class windchill_Main {
	static {
		System.out.println("Enter temperature<= 50 and Velocity >=>3 and <=120");
	}


	public static void main(String[] args) {
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[0]);
		Utility1.windchillFunc(t, v);
	}
}
