package calculator;
import java.util.Scanner;
import operation.Operation;
public class Calculator {
	    public static void main(String[] args) {
	    	Scanner kb = new Scanner(System.in);

	        System.out.println("SIMPLE CALCULATOR\n");
	        System.out.println("1. Addition\n");
	        System.out.println("2. Subtraction\n");
	        System.out.println("3. Division\n");
	        System.out.println("4. Multiplication\n");
	        System.out.print("Select your Option: \n");
	        int choice = kb.nextInt();
	        System.out.println();
	        if (choice == 1){
	           Operation.addition();
	        }
	        else if (choice == 2){
	            Operation.subtraction();
	        }
	        else if (choice == 3){
	            Operation.division();
	        }
	        else if (choice == 4){
	           Operation. multiplication();
	        }
	        else
	        	System.out.println("Invalid Option");
	        kb.close();
	    }

}