package org.basics;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		double number1, number2, remainder ;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the inputs: ");
		System.out.print("number1 : ");
		number1 = input.nextDouble();
		System.out.print("number2 : ");
		number2 = input.nextDouble();
		System.out.print("Operations to be performed (+,-,*,/)");
		
		char op = input.next().charAt(0);
		double output = 0;
		input.close();
		
		switch (op) {
		
		case '+' :
			output = number1 + number2;
			break;
			
		case '-' :
			output = number1 - number2;
			break;
			
		case '*' :
			output = number1 * number2;
			break;
		
		case '/' :
			output = number1 / number2;
			remainder = number1 % number2;
			System.out.println("The remainder is : " + remainder);
			break;
			
		default:
			System.out.println("Invalid operator");
		}
		
		System.out.println("The result is ");
		
		System.out.println(number1 + " " + op + " " + number2 + " = " + output);
		}
}