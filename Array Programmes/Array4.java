// ARRAY PROGRAMMES 


import java.util.Scanner;
class Array4{

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

System.out.println("Element of the Array: ");
for ( int i = 0; i< arr.length; i++){
System.out.println(i + " Index Element " + arr [ i ] );
}
}
}


