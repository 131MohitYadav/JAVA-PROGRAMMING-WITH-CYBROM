// Write a java programme to check two given integers , and print true if one of them is 30 or if their sum is 30 else print false

import java.util.Scanner; 

class CheckThirty{

public static void main(String args [ ] ) {

// declare a variable

 int  a , b;
boolean result;

Scanner sc = new Scanner(System.in);

System.out.print("ENTER A FIRST VALUE: ");
a = sc.nextInt();

System.out.print("ENTER A SECOND VALUE: ");
 b = sc.nextInt();

 result = ( a == 30 || b == 30 || a + b == 30);

System.out.println(result);

}
}