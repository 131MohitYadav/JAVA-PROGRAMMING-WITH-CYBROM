// ARRAY PROGRAMMES 

// Write a java programme to find Greatest element form the array

import java.util.Scanner;

class Array9{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

int arr [ ] = new int  [ 7 ] ;
// int arr [ ] = {100 ,0 , 3 , 4 , 7, 200};
int max = arr [ 0 ];

// input of the array
for ( int i = 0; i<arr.length; i++){
System.out.print("Enter Element of the Array: " + i  + " :  ");
arr[i] = sc.nextInt();
}

for ( int i = 0 ; i < arr.length; i++){
if ( arr [ i ] > max){
max = arr [ i ];
}
}

System.out.println("Greatest Element : " + max);


}
}


