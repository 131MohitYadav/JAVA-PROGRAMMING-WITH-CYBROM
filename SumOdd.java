// Write a java programme that read 5 numbers and sum of all odd values between them


import java.util.Scanner;

class  SumOdd{

public static void main(String args[ ] ) {

//declare a variable
int number,sum=0;

Scanner sc = new Scanner(System.in);

for ( int i = 0 ; i < 5; i++){

System.out.print("ENTER A NUMBER: ");
number = sc.nextInt();

//perform the operation
if( number % 2 != 0){
// Addition assignment operator 
// sum = sum + number
sum += number;

}
}
System.out.println("THE SUM OF ODD VALUES: " + sum);

    }
}



