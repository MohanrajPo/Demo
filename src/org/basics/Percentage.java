package org.basics;

import java.util.Scanner;

public class Percentage {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the marks: \n");
		
		double m1, m2, m3, total, percentage;
		System.out.print("Enter the m1 : ");
		m1 = input.nextDouble();
		System.out.print("Enter the m2 : ");
		m2 = input.nextDouble();
		System.out.print("Enter the m3 : ");
		m3 = input.nextDouble();
		input.close();
		
		total = m1 + m2 + m3;
		percentage = ((total/300.0)*100);
		System.out.println("\n Percentage = " + percentage + " % ");
	}
}
