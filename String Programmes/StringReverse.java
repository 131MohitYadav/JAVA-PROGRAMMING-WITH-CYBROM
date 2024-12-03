// STRING PROGRAMES

//  Write a java program to print  Reverse character of the given String.
// charAt()

import java.util.Scanner;
class StringReverse{
public static void main(String args [ ]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter any String: ");
String str = sc.nextLine();

for ( int i = str.length() - 1; i >= 0;  i--){
char x = str.charAt(i); // 0 , 1 , 2, 3, 4 . . . 
char x = str.length(i);
System.out.print("\t" + x);
}

}
}
