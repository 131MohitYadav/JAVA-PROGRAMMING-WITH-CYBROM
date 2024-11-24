// ARRAY PROGRAMMES 

// Write a java programme to print  the alternate array element and element starts with 0

import java.util.Scanner;

class Array6{

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
System.out.println(" Reverse Element of the Array: ");
for ( int i = 0; i< arr.length; i += 2){
System.out.println(i + " Index Element " + arr [ i ] );
}
}
}


