// Conditional Statement
// switch statement

// Write a java programme to check given character is vowel or not without using relational and logical operator?

import java.util.Scanner;

class Cond11{

public static void main(String args [  ] );

Scanner sc = new Scanner(System.in);

char c ;

System.out.print("ENTER ANY CHARACTER: ");
c = sc.next().charAt(0);

switch(c){

case 'a' :
System.out.println("It is a vowel");
break;

case 'e' :
System.out.println("It is a vowel");
break;

case 'i' :
System.out.println("It is a vowel");
break;

case 'o' :
System.out.println("It is a vowel");
break;

case 'u' :
System.out.println("It is a vowel");
break;

default: 
System.out.println("It is a vowel");

}

}

}