// Write a java programme to check given number is strong number or not  with function types[
//Taking Nothing Return Something]

import java.util.Scanner;

class F9{

int strong ( ){ // Formal Arugment

// declare a variable
int n;
int sum = 0;

// taking input
Scanner sc = new Scanner(System.in);

System.out.print("Enter Any Number : ");
  n = sc.nextInt();
int m = n;

// perform the operation
while ( n != 0){
int r = n % 10;

// factorial logic
int fact = 1;
for ( int i = r;  i >= 1 ; i--){
fact = fact * i;
}
sum = sum + fact;
n = n/10;
}


// return the result
if ( m == sum ) 
return 1;
else
return 0;
}

public static void main(String args [ ]){

F9 obj = new F9();
int result = obj.strong();
if ( result == 1){
System.out.println("Strong Number");
}
else{
System.out.println("Not a Strong Number");
}


}
}

