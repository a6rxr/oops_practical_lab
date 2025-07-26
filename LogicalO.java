package oops_practical_lab;
import java.util.Scanner;


public class LogicalO {
	
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int x = input.nextInt();

	        System.out.print("Enter second number: ");
	        int y = input.nextInt();

	        System.out.println((x > 3) && (y > 5));
	        System.out.println((x > 3) && (y < 5));

	        System.out.println((x < 3) || (y > 5));
	        System.out.println((x > 3) || (y < 5));
	        System.out.println((x < 3) || (y < 5));

	        System.out.println(!(x == 3));
	        System.out.println(!(x > 3));

	        input.close();
	    }

}