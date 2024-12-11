// STRING PROGRAMME

// join() method

import java.util.Scanner;

class Join{
public static void main(String args [ ]){

Scanner sc = new Scanner(System.in);

System.out.println("ENTER ANY STRING: ");
String s = sc.nextLine();

String arr [ ] = s.split(" ");

String r = String.join(":" , arr);

System.out.println(r);



}
} 