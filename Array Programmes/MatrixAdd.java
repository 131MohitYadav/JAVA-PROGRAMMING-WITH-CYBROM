// MATRIX PROGRAMMES

// Write a java program to add two matrix?

import java.util.Scanner;

class MatrixAdd{
public static void main(String args [ ]){

int A [ ] [ ] = new int [3][3];
int B [ ] [ ] = new int [3][3];
int C [ ] [ ] = new int [3][3];

Scanner sc = new Scanner(System.in);

// input matrix A
System.out.println("Matrix A ");
for ( int i = 0; i<3; i++){
for ( int j = 0; j < 3; j++){
System.out.println("Enter Element Index of  " + i + j + " : ");
A[i][j] = sc.nextInt();
}
}

// input matrix B
System.out.println("Matrix B ");
for ( int i = 0; i<3; i++){
for ( int j = 0; j < 3; j++){
System.out.println("Enter Element Index of  " + i + j + " : ");
B[i][j] = sc.nextInt();
}
}

// Addition logic
for ( int i = 0; i < 3; i++){
	for ( int j = 0; j < 3; j++){
C[i][j] = A[i][j] + B[i][j];

}
}
System.out.println("\n Output Matrix A : ");
for ( int i = 0; i<3; i++){
for ( int j = 0; j<3; j++){
	System.out.print("\t" + A[i][j]);
}
System.out.println("");
}//print matrix A

System.out.println("\n Output Matrix B : ");
for ( int i = 0; i<3; i++){
for ( int j = 0; j<3; j++){
	System.out.print("\t" + B[i][j]);
}
System.out.println("");// print matrix B
}
System.out.println("\n Output Matrix C : ");
for ( int i = 0; i<3; i++){
for ( int j = 0; j<3; j++){
	System.out.print("\t" + C[i][j]); 
}
System.out.println("");// print matrix C
}

}
}









