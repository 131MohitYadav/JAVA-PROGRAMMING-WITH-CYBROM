// Write a java programme that read 5 numbers and counts the number of positive numbersand negative numbers

import java.util.Scanner;

class CountNumber{

public static void main(String args [ ] ) {


// declare a variable


int N;
int positiveCount = 0;
int negativeCount = 0;


Scanner sc = new Scanner(System.in);
 
for(int i = 0 ; i < 5; i++){

System.out.print("ENTER A NUMBER: ");
N = sc.nextInt();


if ( N > 0 ) {

positiveCount++;
}
else {
negativeCount++;
}
}

System.out.println("Number of positive number : " + positiveCount);
System.out.println("Number of negative number: " + negativeCount);
}
}


