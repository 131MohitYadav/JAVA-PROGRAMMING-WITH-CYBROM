// Conditional Statement
// else statement

// Write a java programme to check your are eligible for voting or not

import java.util.Scanner;
class Condition4{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

int n1;

System.out.print("ENTER ANY AGE: ");
n1 = sc.nextInt();

if( n1 > 18) 
System.out.println("YES, you are eligible for voting");

else
System.out.println("NO, you are not eligible for voting");


}
}

