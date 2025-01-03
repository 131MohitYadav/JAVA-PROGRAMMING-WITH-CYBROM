// MATRIX PROGRAMMES
// Time complexity of this program -> big O(n3)
// Write a java program  Multiply or Product two matrix?

import java.util.Scanner;

class MatrixMul{
public static void main(String args [ ]){

int A [ ] [ ] = new int [3][3];
int B [ ] [ ] = new int [3][3];
int C [ ] [ ] = new int [3][3];
int K [ ] [ ] = new int [3][3];

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

// Matrix logic
for ( int i = 0; i < 3; i++){
	for ( int j = 0; j < 3; j++){
		for(int k = 0; k < 3; k++){
C[i][j] =  C[i][j] + A[i][k] * B[k][j];
}
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









