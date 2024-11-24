// Ternary Operator 

// Write a java programme to check it is leap year or not

import java.util.Scanner;

class LeapYear{

public static void main(String args [ ] ) {

int year;
String result = " ";

Scanner sc = new Scanner(System.in);

System.out.print("ENTER A YEARS: ");
year = sc.nextInt();

result = ( year % 4 == 0 &&  year % 400 == 0) ? " It is a Leap year " : " It is not a Leap year ";

System.out.println(result);
}
}