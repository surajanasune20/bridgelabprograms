package Alogithm_Pg;

import Utility.Utility1;

public class Tempreture_Conversion {
	public static void main(String[] args) {
		int n1;
		do
		{
		System.out.println("Enter the tempreture...  >> \n ");
		double tempreture=Utility1.getDouble();
		System.out.println("\n In which form you get tempreture \n1.In Fahrenheit \n2. In Celsius");
		n1=Utility1.getInt();
		switch(n1)
		{
		case 1:
				double Ftemp=Utility1.getFaranite(tempreture);
				System.out.println(Ftemp);
				
		case 2:
			double Ctemp=Utility1.getCelcius(tempreture);
			System.out.println(Ctemp);
		}
		
	}while(n1>0);

}
}
