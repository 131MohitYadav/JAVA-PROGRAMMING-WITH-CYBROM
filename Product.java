// Write a java program that takes two number as input and displays the product of two numbers.

// SOURCE CODE

import java.util.Scanner;

public class Product {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        // declare a variable
        int a , b , p;

        // Take a input of two number
        System.out.print("ENTER A FIRST NUMBER: ");
        a = sc.nextInt();

        System.out.print("ENTER A SECOND NUMBER: ");
        b = sc.nextInt();

        // perform the operation
        p = a * b;

        System.out.println(p);
    }
}
