// ARRAY PROGRAMMES 


import java.util.Scanner;
class Array3{

public static void main(String args [ ] ) {


int arr [ ] = new int [ 5 ];

Scanner sc = new Scanner(System.in);


System.out.println("Enter Element Index of 0 : ");
arr[0] = sc.nextInt();

System.out.println("Enter Element Index of 1 : ");
arr[1] = sc.nextInt();


System.out.println("Enter Element Index of 2 : ");
arr[2] = sc.nextInt();


System.out.println("Enter Element Index of 3 : ");
arr[3] = sc.nextInt();


System.out.println("Enter Element Index of 4 : ");
arr[4] = sc.nextInt();


System.out.println("Length of the array: "  + arr.length);

System.out.println( " Array Element at index 0 :  " + arr [0] );
System.out.println( " Array Element at index 1 :  " + arr [1] );
System.out.println( " Array Element at index 2 :  " + arr [2] );
System.out.println( " Array Element at index 3 :  " + arr [3] );
System.out.println( " Array Element at index 4 :  " + arr [4] );

}
}


