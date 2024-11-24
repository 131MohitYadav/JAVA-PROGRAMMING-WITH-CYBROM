// Ternary Operator 

// Write a java programme to check the absolute value

import java.util.Scanner;

class Absolute{

public static void main(String args [ ] ){

int n , absolute;

Scanner sc = new Scanner(System.in);

System.out.print("ENTER A VALUE: ");
n = sc.nextInt();

absolute =  ( n < 0 ) ? -n: n;
System.out.println("Absolute Value: " + absolute);
}
}