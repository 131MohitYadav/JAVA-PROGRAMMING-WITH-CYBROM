// ARRAY PROGRAMMES 

// Write a java programme to find  first and second  Greatest element form the array

import java.util.Scanner;

class ArraySecLargest{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

int arr [ ] = new int  [ 7 ] ;

int FirstMax = arr [ 0 ]; // also used integer.min_value 
int SecMax = arr [ 0 ];

// input of the array
for ( int i = 0; i<arr.length; i++){ 
System.out.print("Enter Element of the Array: " + i  + " :  ");
arr[i] = sc.nextInt(); // 100
}

for ( int i = 0 ; i < arr.length; i++){
if ( arr [ i ] > FirstMax){
SecMax = FirstMax;
FirstMax = arr [ i ];
}
else if ( arr [ i ] > SecMax && arr [ i ] != FirstMax){
SecMax = arr [ i ] ;
}
}

System.out.println("################################");

System.out.println(" First Greatest Element : " + FirstMax);
System.out.println("Second Greatest Element: " + SecMax);



}
}


