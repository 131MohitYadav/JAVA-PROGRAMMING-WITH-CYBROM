// Ternary Operator 

import java.util.Scanner;

class Student{

public static void main(String args [ ] ){

int marks;
String result = " ";

Scanner sc = new Scanner(System.in);

System.out.print("ENTER A MARKS: ");
marks = sc.nextInt();

result = marks >= 33 ? " Pass " : "Fail ";

System.out.println(result);

}
}