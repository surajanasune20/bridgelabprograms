package Gambler_Game;

import java.util.Scanner;

import Utility.Utility1;

public class Gambler_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		System.out.println("Enter a name of the person wants to play a game.......!  ");
		String s = sc.nextLine(); //Accept String elements 
		System.out.println("Hii " + s + " Welcome in gambler : \n ");
		int money, goal,trial;
		System.out.println(" Hello " + s + " Enter the money you have : \n ");
		money = sc.nextInt();
		System.out.println( s + " Enter the goal you want : \n ");
		goal = sc.nextInt();
		System.out.println( s + " Enter number of times you want to play : \n ");
		trial=sc.nextInt();

		Utility1.gambler_check();
		
	}
}
