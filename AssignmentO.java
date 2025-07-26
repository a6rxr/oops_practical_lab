package oops_practical_lab;
import java.util.Scanner;

public class AssignmentO {
	
	class Main {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a value: ");
	        int a = input.nextInt();

	        int var;

	        var = a;
	        System.out.println("var using =: " + var);

	        var += a;
	        System.out.println("var using +=: " + var);

	        var *= a;
	        System.out.println("var using *=: " + var);

	        input.close();
	    }
	}

}
