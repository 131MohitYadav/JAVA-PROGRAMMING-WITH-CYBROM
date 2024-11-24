 // Write a java programme  to print  student information


import java.util.*;

class Question4{

public static void main(String args [] ) {

String name,Enroll;

char s;

int m,c,p,h,e;

Scanner sc = new Scanner(System.in);


System.out.print("ENTER A NAME: ");
name = sc.nextLine();

System.out.print("ENTER A ENROLLMENT NO: ");
Enroll = sc.nextLine();

System.out.print("ENTER A SECTION: ");
s = sc.next().charAt(0);

System.out.print("ENTER MATHS MARKS: ");
m = sc.nextInt();


System.out.print("ENTER CHEMISTRY MARKS: ");
c = sc.nextInt();


System.out.print("ENTER  PHYSICS  MARKS: ");
p = sc.nextInt();


System.out.print("ENTER HINDI MARKS: ");
h = sc.nextInt();


System.out.print("ENTER ENGLISH MARKS: ");
e = sc.nextInt();

System.out.println("/====================================/");

int TotalMarks = m + c + p + h + e;

float  per = TotalMarks/5;

System.out.println("Name: " + name);
System.out.println("Enrollment No: " + Enroll);
System.out.println("Section: " + s);
System.out.println("Maths Marks: " + m);
System.out.println("Chemistry Marks: " + c);
System.out.println("Physics Marks; " + p);
System.out.println("Hindi Marks: " + h);
System.out.println("English Marks; " + e);

System.out.println();

System.out.println("Totalmarks; " + TotalMarks);
System.out.println("Percentage: " + per);

}
}









