// Question 2 - > Write a java program that reads a floating number and prints "Zero" if the number is zero. Otherwise print  "positive" or "negative" . Add "small" if  the absolute value fo the number is less than 1, or "large" if it exceeds 1 , 000 , 000.

import java.util.Scanner;

class AbsoluteValue{

public  static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

float n;

System.out.print("ENTER  ANY NUMBER: ");
n = sc.nextFloat();

if ( n == 0 ) {
System.out.println("Zero");
}
else if( n > 0 ){
System.out.print("Positive ");
}
else {
System.out.print("Negative");
}

 if ( Math.abs(n) < 1) {
 System.out.println("small");
}
else if(Math.abs(n) > 1_000_000){
System.out.println("large");
}
else{
System.out.println();
}
}
}