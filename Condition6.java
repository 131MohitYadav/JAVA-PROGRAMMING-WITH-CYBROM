// Conditional Statement
// else if  

// Write a java programme to check given character is uppercase , lowercase, digit or special characters

import java.util.Scanner;

class Condition6{

public static void main(String args [ ] ){

Scanner sc  = new Scanner(System.in);

char c;

System.out.print("ENTER ANY CHARACTER: ");
c = sc.nextLine().charAt(0);

if ( c >= '0' && c <= '9'){
System.out.println("Digit");
}
else if( c >= 'A' && c <= 'Z'){
System.out.println("Uppercase");
}
else if( c >= 'a' && c<='z'){
System.out.println("Lowercase");
}
else {
System.out.println("Special Character");
}
}
}