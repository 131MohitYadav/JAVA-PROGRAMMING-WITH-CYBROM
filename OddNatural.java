// Write java program that displays the sum of n odd natural number 

import java.util.Scanner;

class OddNatural{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

int n , sum = 0 , count = 0;

System.out.print("INPUT NUMBER OF TERMS: ");
 n = sc.nextInt();

for ( int i = 1 ; count < n; i += 2 ) {
System.out.println(i );
sum += i;
count++;
}
System.out.println("The Sum of odd natural number upto 5 term is: " + sum);

}
}

