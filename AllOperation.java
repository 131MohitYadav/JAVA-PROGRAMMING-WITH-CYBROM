// Write a java program to print the sum (addition) , multiply , subtract , divide and remainder of two number.

// SOURCE CODE

import java.util.Scanner;

public class AllOperation {
    public static void main(String args[]){

       Scanner sc = new Scanner(System.in);

       //declare a variable
        int a , b;

        // Take a input
        System.out.print("ENTER A FIRST NUMBER: ");
        a = sc.nextInt();
        
        System.out.print("ENTER A SECOND NUMBER: ");
        b = sc.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println( a * b);
        System.out.println( a / b);
        System.out.println( a % b);
    }
}
