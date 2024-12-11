// STRING PROGRAMME

// trim() method

import java.util.Scanner;

class Trim{
public static void main(String args [ ]){

Scanner sc = new Scanner(System.in);

System.out.println("ENTER ANY STRING: ");
String s = "  Hello  World  ";

System.out.println("Length of the string before the trim: " + s.length());

String s1 = s.trim();
System.out.println("Length of the string after the trim: " + s1.length());




}
} 