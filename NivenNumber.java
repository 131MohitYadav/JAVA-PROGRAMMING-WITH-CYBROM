// Question 7 -> Write a java program to input a number. Check and display whether it is a Nivern number or not. ( A number is said to be Niven Which is divisible by the sum of its digit).

import java.util.Scanner;
class NivenNumber{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

System.out.print("ENTER ANY NUMBER: ");
int n = sc.nextInt();

int sum = 0;

while ( n > 0 ) {

int r = n % 10; 

sum = sum + r;

n = n/10;
}

if ( n % sum == 0 ) {
System.out.println("It is a Niven number");
}
else{
System.out.println("It is not a Niven number");
}

}
}
