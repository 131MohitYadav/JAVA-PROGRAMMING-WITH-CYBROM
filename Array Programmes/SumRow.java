// Write a java program to print row wise sum and column wise sum from the given Array

import java.util.Scanner;

class SumRow{

public static void main(String args [ ]){

Scanner sc = new Scanner(System.in);

int A [ ] [ ] = new int[3][3];
for( int r = 0; r < 3; r++){
	for( int c = 0; c < 3; c++){
System.out.println("ENTER ELEMENT " + r + c +" : ");
A[r][c] = sc.nextInt();
}
}
int sum; 
for ( int  r = 0; r < 3; r++){
sum = 0;
for (  int c = 0; c < 3; c++){
System.out.print("\t" + A[r][c]); // 10 20 30
sum = sum + A[r][c];
}
System.out.println("\t" + sum);
}

int nums [ ] = new int[3];
for ( int r = 0; r < 3; r++){// r = 3
sum = 0;
	for ( int c = 0; c < 3; c++){// c = 2
	sum = sum + A[c][r]; // 180
}
	nums[r] = sum;
System.out.println(" ");
}
for(int i = 0; i < nums.length; i++){
System.out.print("\t" + nums[i]);
}

}
}


