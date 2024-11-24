// Write a java programme that reads two integer and checks whether they are multiplied or not .


import java.util.Scanner;

class Multiplied {

public static void main(String args[ ] ){

// declare a variable
int a , b;

Scanner sc = new Scanner(System.in);

System.out.print("ENTER A FIRST NUMBER: " );
a = sc.nextInt();

System.out.print("ENTER A SECOND NUMBER: ");
b = sc.nextInt();

// perform the operation
  if ( a / b == 0 ) {
System.out.println("Multiplied");

}
else{
System.out.println("Not");
}

}
}