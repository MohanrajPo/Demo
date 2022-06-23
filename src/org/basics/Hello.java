package org.basics;

import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your First Name: ");
		String firstName = input.next();
		System.out.println("Enter your Last Name: ");
		String lastName = input.next();
		input.close();
			
		System.out.println("\nHello \n" + firstName + " " + lastName);	
	}
}
