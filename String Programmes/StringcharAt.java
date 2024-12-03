// STRING PROGRAMES

//  Write a java program to print character of the given String.
// charAt()

import java.util.Scanner;
class StringcharAt{
public static void main(String args [ ]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter any String: ");
String str = sc.nextLine();

for ( int i = 0; i < str.length(); i++){
char x = str.charAt(i); // 0 , 1 , 2, 3, 4 . . . 
System.out.println(x);
}

}
}
