// Conditional Statement
// switch statement

// Write a java programme to check given character is vowel or not without using //relational and logical operator?

// Here duplicate case are not used
import java.util.Scanner;

class Cond13{

public static void main(String args [  ] ){

Scanner sc = new Scanner(System.in);

int n1 , n2;
char c ;

System.out.println("ENTER YOUR CHOICE: ");
System.out.println("Press + for Addition");
System.out.println("Press - for Subtraction");
System.out.println("Press * for Multiplication");
System.out.println("Press /  for Division");
System.out.println("===============================");
 
c = sc.next().charAt(0);

System.out.println("===============================");

System.out.print("Enter number 1: ");
n1 = sc.nextInt();

System.out.print("Enter number 2: ");
n2 = sc.nextInt(); 



switch(c){

case '+' :
System.out.println("Addition: " + (n1 + n2));
break;

case '-' :
System.out.println("Subtraction: " + ( n1 - n2));
break;

case '*' :
System.out.println("Multiplication: " + ( n1 * n2));
break;

case '/' :
System.out.println("Division: " + ( n1 / n2));
break;

default: 
System.out.println("Inavlid choice");

}
}

}