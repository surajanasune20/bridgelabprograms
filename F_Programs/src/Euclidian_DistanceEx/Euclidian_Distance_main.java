package Euclidian_DistanceEx;

import Utility.Utility1;

public class Euclidian_Distance_main {
	public static void main(String[] args) {

		int x = Integer.parseInt(args[0]);  //command line argument 
		int y = Integer.parseInt(args[1]); //command line argument

		Utility1.findEuclidian(x, y); //call findEuclidian function 
	}
}
