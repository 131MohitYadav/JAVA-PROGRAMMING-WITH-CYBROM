// Write a java programme to take input from the user 

import java.util.Scanner;

class Input{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);
int A [ ] [ ] = new int [ 2] [5];

for ( int r = 0; r < A.length; r++){
for( int c = 0; c < A[r].length; c++){
System.out.print("ENTER ELEMENT INDEX OF  " + r + c + " : ");
A[r][c] = sc.nextInt();
}
}

System.out.println("OUTPUT OF 2D ARRAY: ");

for ( int r = 0; r < A.length; r++){
for( int c = 0; c < A[r].length; c++){
System.out.print(" " + A[r][c]);
}
System.out.println("");
}

}
}


