package oops_practical_lab;

import java.util.Scanner;

public class ArthimeticO {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int a = input.nextInt();
		
		System.out.print("Enter second number: ");
		int b = input.nextInt();
		

		System.out.println("Addition: " + (a+b));
		System.out.println("Subtraction: " + (a-b));
		System.out.println("Multiplication: " + (a*b));
		System.out.println("Division: " + (a/b));
		System.out.println("Modulo: " + (a%b));
		input.close();
	}
}