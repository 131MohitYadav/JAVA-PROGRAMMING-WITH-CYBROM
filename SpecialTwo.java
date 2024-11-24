// Question 9 -> A special two - digit number is such that when the sum of its digit is added to the product of its digits, the result is equal to the original two-digit number.

import java.util.Scanner;

class SpecialTwo{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

System.out.print("ENTER ANY  TWO-DIGIT NUMBER: ");
int n = sc.nextInt();

int sum = 0;
int product = 1;
int m = n;

while( n > 0 ) {//59

int r = n % 10;//9

sum = sum + r;// 0 + 9 = 9

product = product *  r; // 1 * 9 = 9

n = n / 10;

}

int result = sum + product;

if ( result == m ) {
System.out.println("Special two-digit number");
}
else{
System.out.println("Not a special two-digit number");
}

}
}
