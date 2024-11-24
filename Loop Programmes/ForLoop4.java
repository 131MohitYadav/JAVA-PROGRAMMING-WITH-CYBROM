// Looping Statement  or Control Flow statement


//  Write a java program to print table of  using while ,do while and for loop

// for loop // 
import java.util.Scanner;
class ForLoop4 {

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

int n;

System.out.print("ENTER ANY NUMBER: ");
 n = sc.nextInt();

for ( int i = 1 ; i <= 10; i++){
System.out.println( n + " * " + i + " = " + ( n * i ));
}
}
}
