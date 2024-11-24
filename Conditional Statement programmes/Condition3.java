// Conditional Statement
// if statement

// Write a java programme to check given number is odd or even

import java.util.Scanner;
class Condition3{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

int n1;

System.out.print("ENTER ANY NUMBER: ");
n1 = sc.nextInt();

if( n1 %2 ==  0 ) 
System.out.println(" This is Even number");

if ( n1 %2 == 1)
//if( n1 %2 != 0 )
System.out.println("This is Odd number");


}
}

