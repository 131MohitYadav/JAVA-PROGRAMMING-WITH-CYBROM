
// conditional statement
// if else statement

// Write a java programe that takes a year from the user and prints whther it is a leap year or not.


import java.util.Scanner;

class CheckLeapYear{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

System.out.print("ENTER ANY YEAR: ");
int y = sc.nextInt();

if ( ( y % 4 == 0 &&  y % 100 != 0)  || ( y % 400 == 0)) {

System.out.println( y + " is a leap year");

}

else {
System.out.println( y + " is not a leap year");

}

}
}

