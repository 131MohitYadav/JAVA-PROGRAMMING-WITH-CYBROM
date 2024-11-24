// Conditional Statement
// switch statement

// Write a java programme to check given character is vowel or not without using //relational and logical operator?

// Here duplicate case are not used
import java.util.Scanner;

class Cond11{

public static void main(String args [  ] ){

Scanner sc = new Scanner(System.in);

char c ;

System.out.print("ENTER ANY CHARACTER: ");
c = sc.next().charAt(0);

switch(c){

case 'a' :
case 'A':
System.out.println("It is a vowel");
break;

case 'e' :
case 'E':
System.out.println("It is a vowel");
break;

case 'i' :
case 'I':
System.out.println("It is a vowel");
break;

case 'o' :
case'O':
System.out.println("It is a vowel");
break;

case 'u' :
case 'U':
System.out.println("It is a vowel");
break;

default: 
System.out.println("Not  a vowel");

}
}

}