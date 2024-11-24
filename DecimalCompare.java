// Write a java program that reads two floating-point numbers and test whether they are the same up to three decimal places.


import java.util.Scanner;

class DecimalCompare{

public static void main(String args [ ] ){

Scanner sc = new Scanner(System.in);

double n1 , n2;

System.out.print("ENTER FIRST FLOATING NUMBER: ");
n1 = sc.nextDouble();

System.out.print("ENTER SECOND FLOATING NUMBER: ");
n2 = sc.nextDouble();

n1 = Math.round( n1 * 1000.0) / 1000.0;
n2 = Math.round( n2 * 1000.0) / 1000.0;

if ( n1 == n2 ) {

System.out.println("They are same " );
 
}
else {
System.out.println("They are different");
}

}
}
