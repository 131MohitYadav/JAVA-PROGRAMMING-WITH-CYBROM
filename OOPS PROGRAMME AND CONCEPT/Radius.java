// Write a java programme to calculate area and circumference of Circle using class


import java.util.Scanner;

class Circle{
float r;

void acceptData(){
Scanner sc = new Scanner(System.in);
System.out.print("ENTER RADIUS: ");
r = sc.nextFloat();

}

void showData(){
System.out.println("Radius is : " + r);

}

void getArea(){
System.out.println("Area: " + (3.14f * r * r));
}
void getCirc(){
System.out.println("Perimeter: " + ( 2 * 3.14f * r ));
}

public static void main(String args [ ]){

Circle r1 = new Circle();

r1.acceptData(); // these are member function
r1.showData();
r1.getArea();
r1.getCirc();
}
}

 




