package WindChill;

import Utility.Utility1;

public class windchill_Main {
public static void main(String[] args) {
	double t=Double.parseDouble(args[0]);
	double v=Double.parseDouble(args[0]);
	Utility1.windchillFunc(t,v);
}
}
