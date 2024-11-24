// Write a java program that read 5 numbers and counts the number of positive number  and print the average of all positive values.

import java.util.Scanner;

class AverageNumber{

public static void main(String args [ ] ) {


// declare a variable


int N;
int positiveCount = 0;
int sum = 0;
double average;

Scanner sc = new Scanner(System.in);
 
for(int i = 0 ; i < 5; i++){

System.out.print("ENTER A NUMBER: ");
N = sc.nextInt();


if ( N > 0 ) {
sum += N;
positiveCount++;
}
}
average = sum / positiveCount;

System.out.println("Number of positive number : " + positiveCount);
System.out.println("Average value of the said positive number : " + average);

}
}
