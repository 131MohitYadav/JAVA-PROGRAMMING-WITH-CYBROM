// Write a java programme to check given number is Prime or not with the help of using function[ Taking Nothing and Return Nothing ]?

import java.util.Scanner;
class F3{

public void Prime(){

// step 1 -> Declare a variable
int a;
int count = 0;

// step 2 -> Input
System.out.println("=========> Add Function is called <========");
Scanner sc = new Scanner(System.in);
System.out.print("ENTER  ANY NUMBER: ");
a = sc.nextInt();

//step 3 -> perform operation
for(int i = 1 ; i <=a ; i++){
if ( a % i == 0){
count++;
}
}

if (count == 2 ){
System.out.println("Prime number");
}
else{
System.out.println("Not Prime number");
}
}
public static void main(String args [ ]){
F3 obj = new F3();
// How to access method of class 
// objectName.methodName()

obj.Prime();
}

}


