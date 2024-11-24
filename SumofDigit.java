// Looping statement and cotrol flow statement

// Write a java program to print sum of digits of the given number?

import java.util.Scanner;

class SumofDigit{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

System.out.print("ENTER ANY NUMBER: ");
int n = sc.nextInt();

int sum = 0;

while ( n != 0 ) {
int r = n % 10;
sum = sum + r;
n = n / 10;
}
System.out.println("Sum of digits is: "  + sum) ;
}
}


