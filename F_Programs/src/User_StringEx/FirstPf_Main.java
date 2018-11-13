package User_StringEx;

import Utility.Utility1;

public class FirstPf_Main {

	public static void main(String[] args) {
		String template = "Hello <<UserName>>, How are you?";
		System.out.println("Enter the string ....... ");
		String name=Utility1.getString();
		
		String output=Utility1.replace(template,"<<UserName>>",name);	
		System.out.println(output);
		
	}
}
