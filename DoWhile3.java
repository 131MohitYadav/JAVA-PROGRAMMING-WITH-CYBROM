// Looping Statement  or Control Flow statement


//  Write a java program to print table of  using while ,do while and for loop

// for loop // 
import java.util.Scanner;
class DoWhile3 {

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

int n;
int i = 1;

System.out.print("ENTER ANY NUMBER: ");
 n = sc.nextInt();

do {
System.out.println( n + " * " + i + " = " + ( n * i ));
i++;
}
while ( i <= 10 );
}
}
