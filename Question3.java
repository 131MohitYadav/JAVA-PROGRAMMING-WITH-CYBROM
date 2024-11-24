// write a java programme to take student information from the user and print it on the screen

import java.util.Scanner;

class Question3{

public static void main(String args [ ] ) {

String Name;

char S;

Scanner sc = new Scanner(System.in);

System.out.print("ENTER  A  NAME : ");
Name = sc.nextLine();

System.out.print("ENTER A SECTION: " );
S = sc.next().charAt(0);

System.out.println();

System.out.println(" Student Name: " + Name);
System.out.println(" Student Section: " + S);

}
}