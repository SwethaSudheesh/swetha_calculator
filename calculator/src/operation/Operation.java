package operation;
import java.util.Scanner;
import calculator.Calculator;
public class Operation extends Calculator  {
    public static void addition(){

        int n1,n2;
        Scanner kb = new Scanner(System.in);
       
        System.out.println("Addition\n");
        System.out.print("First Number: \n");
        n1 = kb.nextInt();

        System.out.print("Second Number: \n");
        n2 = kb.nextInt();

        kb.close();
        System.out.println("Sum: " + n1 + " + " + n2 + " = " + (n1+n2));
    }

    public static void subtraction(){
        int n1, n2;
        Scanner kb = new Scanner(System.in);

        System.out.println("Subtraction\n");
        System.out.print("First Number: \n");
        n1 = kb.nextInt();

        System.out.print("Second Number: \n");
        n2 = kb.nextInt();

        kb.close();
        System.out.println("Difference " + n1 + " - " + n2 + " = " + (n1 - n2));
    }

    public static void division(){
        int n1, n2;
        Scanner kb = new Scanner(System.in);

        System.out.println("Division\n");
        System.out.print("First Number: \n");
        n1 = kb.nextInt();

        System.out.print("Second Number: \n");
        n2 = kb.nextInt();

        kb.close();
        System.out.println("division: " + n1 + " / " + n2 + " = " + (n1 / n2));
    }

    public static void multiplication(){
        int n1, n2;
        Scanner kb = new Scanner(System.in);

        System.out.println("Multiplication\n");
        System.out.print("First Number: \n");
        n1 = kb.nextInt();

        System.out.print("Second Number: \n");
        n2 = kb.nextInt();

        kb.close();
        System.out.println("Product: " + n1+ " x " + n2 + " = " + (n1 * n2));
    }
}

