// Ternary Operator 

// Write a java programme  given a student's marks  assign a grade using the ternary operator

import java.util.Scanner;

class GradeMarks{

public static void main(String args [ ] ) {

int m ;
String grade;

Scanner sc = new Scanner(System.in);

System.out.print("ENTER A MARKS: ");
m = sc.nextInt();

grade = ( m >= 90) ? "Grade A" :
      (m >= 75 )? "Grade B":
      ( m >= 50) ? "Grade C":
      "Grade D";

System.out.println(grade + " ");

}
}


	     