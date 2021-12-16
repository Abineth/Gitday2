package org.tau;

import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		get adjective
		System.out.println("Enter a adjective");
		String adjective = scanner.next();
		
//		get Season
		System.out.println("Enter the season");
		String season = scanner.next();
		
//		get whole number
		System.out.println("Enter a whole number");
		int wholeNum = scanner.nextInt();
		scanner.close();
		
		System.out.println("on a "+adjective+" "+season+" day, I drink a minimum of "+wholeNum+" cups of coffee");
	}

}
