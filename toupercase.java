// toUpperCase() and toLowerCase() method

import java.util.Scanner;
class UpperandLower{

public static void main(String args [ ]){

Scanner sc = new Scanner(System.in);

System.out.print("ENTER ANY STRING: ");
String s = sc.nextLine();

String r = s.toUpperCase();
System.out.println("Result: " + r);

String x = r.toLowerCase();
System.out.println("Result: " + x);

}
}