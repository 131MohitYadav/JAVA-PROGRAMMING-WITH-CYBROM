// FUNCTION AND METHOD IN JAVA

// EXAMPLE : Taking Nothing and Returning Nothing

import java.util.Scanner;
class F1{

public void Add(){

// step 1 -> Declare a variable
int a,b,c;

// step 2 -> Input
System.out.println("=========> Add Function is called <========");
Scanner sc = new Scanner(System.in);
System.out.print("ENTER VALUE OF A: ");
a = sc.nextInt();
System.out.print("ENTER VALUE OF B: ");
b = sc.nextInt();

//step 3 -> perform operation
c = a + b;

// step 4 -> Print Result
System.out.println("Addition: " + c);
}

public static void main(String args [ ]){
F1 obj = new F1();
// How to access method of class 
// objectName.methodName()

obj.Add();
obj.Add();

}
}




