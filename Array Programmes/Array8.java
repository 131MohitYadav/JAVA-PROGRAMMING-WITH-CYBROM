// ARRAY PROGRAMMES 

// Write a java programme to find smallest element form the array

import java.util.Scanner;

class Array8{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

int arr [ ] = new int  [ 7 ] ;
int min = arr [ 0 ];

// input of the array
for ( int i = 0; i<arr.length; i++){
System.out.print("Enter Element of the Array: " + i  + " :  ");
arr[i] = sc.nextInt();
}

for ( int i = 0 ; i < arr.length; i++){
if ( arr [ i ] < min){
min = arr [ i ];
}
}

System.out.println("Smallest Element : " + min);


}
}


