 // Write a java programme that converts  Centigrade to Fahrenheit.

import java.util.Scanner;

class ConvertCentigrade{

public static void main(String args[ ] ) {

 int C;
float F;

Scanner sc = new Scanner(System.in);

System.out.print("ENTER A CENTIGRADE: ");
 C = sc.nextInt();

F = ( C * 9.0f / 5 ) + 32;

System.out.println("Fahrenheit : " + F);

}
}