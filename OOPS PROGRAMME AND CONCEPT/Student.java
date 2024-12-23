// Write a java program to create a student class and perform following operation 

import java.util.Scanner;

class Student{
String name, Enroll;
int P , C , M , H , E;

void getData(){
Scanner sc = new Scanner(System.in);
System.out.print("ENTER STUDENT NAME: ");
name= sc.nextLine();
System.out.print("ENTER ENROLLMENT NO.: ");
Enroll= sc.nextLine();

System.out.print("ENTER PHYSICS MARKS : ");
P= sc.nextInt();
System.out.print("ENTER CHEMISTRY MARKS : ");
C= sc.nextInt();
System.out.print("ENTER MATHS MARKS: ");
M= sc.nextInt();
System.out.print("ENTER HINDI MARKS: ");
H= sc.nextInt();
System.out.print("ENTER ENGLISH MARKS: ");
 E = sc.nextInt();
}

void showData(){
System.out.println("Student name  is : " + name);
System.out.println("Enrollment number  is : " + Enroll);

System.out.println("Physics marks  is : " + P);
System.out.println("Chemistry marks  is : " + C);
System.out.println("Maths marks   is : " + M);
System.out.println("Hindi marks  is : " + H);
System.out.println("English marks is : " + E);

}

int  getTotalMarks(){
return P + C + M + H + E;
}
float getPerc(int totalmarks){
  return (float) totalmarks / 5;
}

public static void main(String args [ ]){

Student s1 = new Student();

s1.getData(); // these are member function
s1.showData();
int tm = s1.getTotalMarks();
System.out.println("Total Marks is: " + tm);
float p = s1.getPerc(tm);
System.out.println("Percentage is : " + p);

}
}

 




