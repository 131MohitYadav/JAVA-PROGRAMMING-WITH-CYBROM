// Write a java programme to print sum of two number with function types[
//Taking Nothing Return Nothing]

import java.util.Scanner;
class F4{
 void add(){

// declare a variable
int a,b,c;

// take input
Scanner sc = new Scanner(System.in);
System.out.print("ENTER VALUE OF A: ");
a = sc.nextInt();
System.out.print("ENTER VALUE OF B: ");
b = sc.nextInt();

// perform the operation
c = a + b;

// print the result
System.out.println("The sum of two number: " + c);
}

public static void main(String args[ ] ){

F4 obj = new F4();
obj.add();
}
}
