// Ternary Operator

// Write a java programe to check you are eligible for voting or not 

import java.util.Scanner;

class Voting {

public static void main(String args [ ] ){


int n , result;

Scanner sc = new Scanner(System.in); 

System.out.print("ENTER  A  AGE : ");
n = sc.nextInt();

result  =  (n >= 18) ?  Yes, you are  eligible for vote  :  No , you are not eligible for vote;

System.out.println(result );

}

}











