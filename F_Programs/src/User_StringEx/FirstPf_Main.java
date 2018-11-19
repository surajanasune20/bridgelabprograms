package User_StringEx;

import Utility.Utility1;

public class FirstPf_Main {

	public static void main(String[] args) {
		//initializing variable
		String template = "Hello <<UserName>>, How are you?";
		//taking input from user
		System.out.println("Enter the string ....... "); 
		String name=Utility1.getString();  
		//accept input using calling  getString method from utility1 class
		String output=Utility1.replace(template,"<<UserName>>",name);	 
		System.out.println(output);
		
	}
}
