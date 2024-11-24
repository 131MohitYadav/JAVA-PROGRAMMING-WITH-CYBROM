// Question 10 -> A number is said to be Duck if the digit zero is (0)  present in it. Write a program to accept a number and check whether the number is Duck or not. The program display the message accordingly. (The number must not begin with zero).

import java.util.Scanner;
class DuckNumber {

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

System.out.print("ENTER ANY NUMBER: ");
String n = sc.next();

boolean duck = false;

if ( n.charAt(0) == '0'){
System.out.println("It is not a duck number because it start with 0");
return;
}

for ( int i = 1; i < n.length(); i++){
if ( n.charAt(i) == '0'){
duck = true;
break;
}
}

if ( duck ){

System.out.println("It is a duck number");
}
else{
System.out.println("It is not  a duck number");
}


}
}

