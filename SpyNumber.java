// Question 8 -> Write a java program to accept a number and check whether it is a 'Spy Number' or not . ( A number is spy if the sum of its digits equals the  product of its digit.)

import java.util.Scanner;
class SpyNumber{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

System.out.print("ENTER ANY NUMBER: ");
int n = sc.nextInt();

int sum = 0;
int product = 1;

while( n > 0 ){// 1124

int r = n % 10;// 4

sum  = sum + r; // 0 + 4 = 4

product =  product * r; // 1 * 4 = 4

n = n/10; // 112

}
if ( sum == product ) {

System.out.println("It is a spy number");
}
else{
System.out.println("It is not a spy number");
}

}
}
