// Question 6 -> An Abundant number is a number for which the sum of its proper factors is greater than the number itself. Write a program to input a number and check and print whether it is an Abundant number or not.

import java.util.Scanner;

class AbundantNumber{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

System.out.print("ENTER ANY NUMBER: ");
int n = sc.nextInt();

int sum = 0;

for ( int i = 1 ; i<=n; i++){
if( n % i == 0){
sum = sum + i;
}
}

if ( sum > n ) {
System.out.println("This is a  Abundant number");
}
else{
System.out.println("This is not Abundant number");
}

}
}