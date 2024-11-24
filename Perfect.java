// Looping statement and cotrol flow statement

// Write a java program to check given number is perfect or not?

import java.util.Scanner;

class Perfect{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

System.out.print("ENTER ANY NUMBER: ");
int n = sc.nextInt();

int sum = 0;

for ( int i  =  1; i < n; i++){

if ( n % i == 0 ){
sum = sum + i;
}
}
if ( sum == n ) {
System.out.println("This is a perfect number");
}
else{
System.out.println("This is not a perfect number");
}

}
}


