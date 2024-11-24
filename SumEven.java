// Looping statement and cotrol flow statement

// Write a java program to print sum even digit of the given number

import java.util.Scanner;

class SumEven{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

System.out.print("ENTER ANY NUMBER: ");
int n = sc.nextInt();

int sum = 0;
int count = 0;

while ( n != 0 ) {
int r = n % 10;
if ( r % 2 == 0 ){
sum = sum + r;

}
n = n / 10;
}
System.out.println("The sum of  even digit: "  + sum) ;
}
}


