// Looping Statement  or Control Flow statement


//  Write a java program to print table of  using while ,do while and for loop

// for loop // 
import java.util.Scanner;
class WhileLoop3 {

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

int n;
int i = 1;

System.out.println("ENTER ANY NUMBER: ");
 n = sc.nextInt();

while( i <= 10){

System.out.println( n + " * " + i + " = " + ( n * i));
i++;
}

}
}
