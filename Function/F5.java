// Write a java programme to print sum of two number with function types[
//Taking Something Return Nothing]

import java.util.Scanner;

class F5{

void add ( int a , int b){
// perform the operation
int c = a + b;

// print the result 
System.out.println(" Addition: " + c);
}

public static void main(String args [ ]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter number 1: ");
int n1  = sc.nextInt();
System.out.print("Enter number 2 : ");
int n2 = sc.nextInt();

// to create a object

F5 obj = new F5();
obj.add(n1,n2); // Acutal Argument
}
}

