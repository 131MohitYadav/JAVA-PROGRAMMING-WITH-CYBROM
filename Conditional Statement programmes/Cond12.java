// Conditional Statement
// switch statement

// Write a java programme to check given number is even or odd

// Here duplicate case are not used
import java.util.Scanner;

class Cond12{

public static void main(String args [  ] ){

Scanner sc = new Scanner(System.in);

int n;

System.out.print("ENTER ANY NUMBER: ");
n = sc.nextInt();

switch(n % 2 ){

//default: 
//System.out.println("Odd number");
//break;

case 0 :
System.out.println("It is a even number");
break;

case 1:
System.out.println("It is not a odd number");

}
}

}