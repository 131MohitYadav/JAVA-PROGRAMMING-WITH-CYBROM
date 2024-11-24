// write a java programme to calculate area and circumference circle

import java.util.Scanner;

public class Question2{

public static void main(String args[ ]){

// declare a variable

float r,ar,cr;

Scanner sc = new Scanner(System.in);

System.out.print("ENTER A RADIUS: ");
r = sc.nextFloat();

ar = 3.14f * r * r;
cr = 2 * 3.14f * r;

System.out.println("Area of circle : " + ar);
System.out.println("Circumference of circle: " + cr);

}

}