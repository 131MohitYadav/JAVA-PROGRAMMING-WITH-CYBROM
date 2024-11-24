// Conditional Statement
// else statement

// Write a java programme to check given character is vowel or not

import java.util.*;
class Condition5{

public static void main(String args [ ] )  {

//BufferedReader sc = new BufferedReader(new InputStreamReader (System.in));
Scanner sc = new Scanner(System.in);

char c;

System.out.print("ENTER ANY CHARACTER: ");
c = sc.nextLine(). charAt(0);

if( c == 'a' || c == 'i' || c == 'o' || c == 'u' || c == 'e' || c == 'A' || c == 'I' || c == 'O' || c == 'U' || c == 'E'){
System.out.println("This is a vowel");
}
else{
System.out.println("This is not vowel");
}

}
}

