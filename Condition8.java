// Condtional Statement
// else if 

// Write a java programme that reads the integer from the user and print it is Even, odd, Zero

import java.util.Scanner;

class Condition8{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

int n;

System.out.print("ENTER ANY NUMBER: ");
n = sc.nextInt();

if ( n  == 0){
System.out.println("Zero number");
}

else if( n % 2 == 0){
System.out.println("Even number");
}
else{
System.out.println("Odd number");
}

}
}