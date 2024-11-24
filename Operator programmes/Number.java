// Ternary Operator

// Write a java programe to check  the number is positive or negative

import java.util.Scanner;

class Number{

 public static void main(String args [ ] ) {

//declare a variable

int n;
String Result;

Scanner sc  = new Scanner(System.in);k

System.out.print("ENTER A  ANY NUMBER: ");
n = sc.nextInt();
 
              // exp1 ? exp2 : exp3
Result = n > 0 ? "Positive Number" : "Negative Number";

System.out.println(Result);

}
}


