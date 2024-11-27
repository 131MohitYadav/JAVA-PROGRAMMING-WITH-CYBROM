// ARRAY PROGRAMMES 

// Write a java programme to print  the alternate  odd array element and element starts with 0

import java.util.Scanner;

class Array7{

public static void main(String args [ ] ) {


int arr [ ] = new int [ 5 ];

Scanner sc = new Scanner(System.in);

// input of the array
for ( int i = 0; i<arr.length; i++){
System.out.print("Enter Element of the Array: " + i  + " :  ");
arr[i] = sc.nextInt();
}

//length of the array
System.out.println("Length of the array: "  + arr.length);

// output of the array
System.out.println(" Odd Index  Element of the Array: ");
for ( int i = 0; i< arr.length; i++){

// for odd case
if ( i % 2 != 0 ){
System.out.println(i + " Index Element " + arr [ i ] );
}
}

}
}


