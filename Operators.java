package oops_practical_lab;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int result1, result2;
		
		System.out.print("Enter A: ");
		int a = input.nextInt();
		
		
		//System.out.println("Value of a " + a);
		
		result1 = ++a;
		System.out.println("increment: " + result1);
		
		--a;
		result2 = --a;
		System.out.println("decrement: " + result2);
		
		input.close();
	}
}