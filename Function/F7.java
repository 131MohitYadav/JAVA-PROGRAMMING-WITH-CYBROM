// Write a java programme to print sum of two number with function types[
//Taking Something Return Something]

import java.util.Scanner;

class F7{

int add ( int a , int b ){ // Formal Arugment

// perform the operation
int c = a + b;

return c;


}

public static void main(String args [ ]){

// taking input
Scanner sc = new Scanner(System.in);

System.out.print("Enter number 1 : ");
 int a = sc.nextInt();
System.out.print("Enter number 2: ");
  int b = sc.nextInt();

F7 obj = new F7();
int r = obj.add(a,b);
System.out.println("Addition: " + r);
}
}

