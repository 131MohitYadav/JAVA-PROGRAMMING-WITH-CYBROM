// Write a java programme to print sum of all 2d Array Elements

import java.util.Scanner;

class Sum2d {
public static void main(String args [ ]){

Scanner sc = new Scanner(System.in);

int A[ ] [ ] = new int[3][3];
int sum = 0;

for ( int r = 0; r<3; r++){
	for( int c = 0; c < 3; c++){
System.out.print("ENTER ELEMENT " + r +  c + " : ");
A[r][c] = sc.nextInt();
sum = sum + A[r][c];
}
}
System.out.println("Sum : " +  sum);
}
}
