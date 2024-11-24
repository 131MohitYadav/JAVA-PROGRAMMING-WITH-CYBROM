// Conditional Statement
// if statement

// Write a java programme to check given number is positive or negative

import java.util.Scanner;
class Condition2{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

int n1;

System.out.print("ENTER ANY NUMBER: ");
n1 = sc.nextInt();

if( n1 > 0 ) 
System.out.println("It is positive number");


if( n1 < 0 )
System.out.println("It is negative number");


}
}

