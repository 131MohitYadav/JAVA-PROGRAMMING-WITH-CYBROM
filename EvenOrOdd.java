// Ternary Operator

// Write a java programe to check the number is even or odd

import java.util.Scanner;

class EvenOrOdd{

public  static void main(String args [ ] ) {

int n;
String Result;

Scanner sc = new Scanner(System.in);

System.out.print("ENTER A NUMBER: ");
n = sc.nextInt();

Result = n%2 == 0 ? "Even Number"  : "Odd Number";

System.out.println(Result);

}
}