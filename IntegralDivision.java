// Write  a java programme to integral quotient and remainder of a division

import java.util.Scanner;

class IntegralDivision{

public static void main(String args [ ] ) {

// declare a variable;

int N , D , Q , R;

Scanner sc = new Scanner(System.in);

System.out.print("ENTER A NUMERATOR: " ) ;
N = sc.nextInt();

System.out.print("ENTER A DENOMINATOR: ");
D = sc.nextInt();

Q =  N / D;
R = N % D;

System.out.println("Quotient: " + Q );
System.out.println("Remainder: " + R);

}
}