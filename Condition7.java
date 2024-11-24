// Conditional Statement
// else if  

// Write a java programme to check score of the student in a particular subject and print the grade of the student in the following criteria.

import java.util.Scanner;

class Condition7{

public static void main(String args [ ] ){

Scanner sc  = new Scanner(System.in);

int n;

System.out.print("ENTER ANY NUMBER: ");
n = sc.nextInt();

if ( n >=  90){
System.out.println("Grade A");
}
else if( n >= 80 &&  n <= 89){
System.out.println("Grade B");
}
else if( n >= 70 && n <= 79){
System.out.println("Grade C");
}
else if( n >= 60 && n <= 69 ){
System.out.println("Grade D");
}
else{
System.out.println("Grade F");
}
}
}