// write a java programme to print last digit of the number

import java.util.Scanner;

class Question5{

public static void main(String args[]){

int n,last;

Scanner sc = new Scanner(System.in);
System.out.println("Enter a number: ");
n = sc.nextInt(); // 123

last = n % 10;

System.out.println("The last digit of number is: " + last);
System.out.println("Number except last digit: " + (n/10));

}

}
