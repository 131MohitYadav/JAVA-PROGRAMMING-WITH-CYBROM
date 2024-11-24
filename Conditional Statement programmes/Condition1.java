// Conditional Statement
// if statement

// Write a java programme to compare the two numbers

import java.util.Scanner;
class Condition1{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

int n1 , n2 ;

System.out.print("ENTER NUMBER 1: ");
n1 = sc.nextInt();

System.out.print("ENTER NUMBER 2: ");
n2 = sc.nextInt();

// with Curlybraces
if ( n1 > n2 ) {
System.out.println("Number  1 is greater ");
System.out.println("This is if 1");
}
if ( n1 < n2 ) {
System.out.println("Number 2 is greater");
System.out.println("This is if 3");
}
if ( n1 == n2 ){
System.out.println("Both numbers are equal");
System.out.println("This is if 3");
}
}
}

