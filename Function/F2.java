// Write a java programme to check given number is even or not using function[ Taking Nothing and Return Nothing ]?

import java.util.Scanner;
class F2{

public void Even(){

// step 1 -> Declare a variable
int a, result;

// step 2 -> Input
System.out.println("=========> Add Function is called <========");
Scanner sc = new Scanner(System.in);
System.out.print("ENTER  ANY NUMBER: ");
a = sc.nextInt();

//step 3 -> perform operation
if ( a % 2 == 0){
	System.out.println("Even number: ");
}
else{
System.out.println("Odd Number: ");
}
}

public static void main(String args [ ]){
F2 obj = new F2();
// How to access method of class 
// objectName.methodName()

obj.Even();
}

}


