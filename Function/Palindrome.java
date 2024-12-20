// Write a java programme to check given number is palindrome or not  with function types[
//Taking Something Return Nothing]

import java.util.Scanner;

class F8{

void Palindrome ( int n ){ // Formal Arugment
// perform the operation

int m = n;
int sum = 0;
int res = 0;
while(n != 0){ // 121
int r = n % 10;
res = res * 10 + r;
res = sum + r;
n = n /10;
}

// print the result
if ( m == res ) {
System.out.println("This is Palindrome Number");
}
else{
System.out.println("This is not Palindrome Number");
}
}

public static void main(String args [ ]){

Scanner sc = new Scanner(System.in);

System.out.print("Enter Any Number: ");
int n  = sc.nextInt();


// to create a object

F8 obj = new F8();
obj.Palindrome(n); // Acutal Argument
}
}

