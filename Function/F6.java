// Write a java programme to print sum of two number with function types[
//Taking Nothing Return Something]

import java.util.Scanner;

class F6{

int add ( ){ // Formal Arugment

// declare a variable
int a,b,c;

// taking input
Scanner sc = new Scanner(System.in);

System.out.print("Enter number 1 : ");
a = sc.nextInt();
System.out.print("Enter number 2: ");
b = sc.nextInt();
// perform the operation
c = a + b;

// print the result
return c;
}

public static void main(String args [ ]){

F6 obj = new F6();
int r = obj.add();
System.out.println("Addition: " + r);
}
}

