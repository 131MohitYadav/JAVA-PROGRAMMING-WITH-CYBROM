// Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.


import java.util.Scanner;

public class NumberOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE FIRST NUMBER: ");
        int num1 = sc.nextInt();

        System.out.print("ENTER THE SECOND NUMBER: ");
        int num2 = sc.nextInt();

        System.out.print("ENTER THE THIRD NUMBER: ");
        int num3 = sc.nextInt();

        
        if (num1 < num2 && num2 < num3) {
            System.out.println("increasing order");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("decreasing order");
        } else {
            System.out.println("Neither increasing nor decreasing order");
        }

      
    }
}
