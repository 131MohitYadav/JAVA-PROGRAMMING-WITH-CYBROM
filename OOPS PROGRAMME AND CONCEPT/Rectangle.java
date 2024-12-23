// OOPS PROGRAMME
// Write a java program to create a rectangle class in oops concept

import java.util.Scanner;

class Rectangle{
int l , b; // member data / instance class / state

void acceptData(){
Scanner sc = new Scanner(System.in);
System.out.print("ENTER LENGTH: ");
l = sc.nextInt();
System.out.print("ENTER BREADTH: ");
 b = sc.nextInt();
}

void showData(){
System.out.println("Length is : " + l);
System.out.println("Breadth is : " + b);
}

void getArea(){
System.out.println("Area: " + (l * b));
}
void getPira(){
System.out.println("Perimeter: " + 2 * ( l + b));
}

public static void main(String args [ ]){

Rectangle r = new Rectangle();

r.acceptData(); // these are member function
r.showData();
r.getArea();
r.getPira();
}
}

 




