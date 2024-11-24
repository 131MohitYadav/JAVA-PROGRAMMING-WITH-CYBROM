// Looping statement and cotrol flow statement

// Write a java program to count number of digits in the given number

import java.util.Scanner;

class CountDigit{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

System.out.print("ENTER ANY NUMBER: ");
int n = sc.nextInt();

int sum = 0;
int count = 0;

while ( n != 0 ) {
count++;
n = n / 10;
}
System.out.println("The number of digit: "  + count) ;
}
}


