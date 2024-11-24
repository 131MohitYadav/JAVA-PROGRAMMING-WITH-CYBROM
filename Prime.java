
// Write a java programme to check given number is prime or not

import java.util.Scanner;
class Prime{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

System.out.print("ENTER ANY NUMBER: ");
int n = sc.nextInt();

int count = 0;

for( int i = 1 ; i <= n ; i++){
if ( n % i  == 0 ) {
count++;
}

}
if ( count == 2 ) 
System.out.println("This is Prime number");

else
System.out.println("This is not a prime number");


}
}
