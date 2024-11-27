/*
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

for ( int i = 0 ; i < arr.length; i++){//i=7
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
==========================================================
Q1. Write a java program to check given array is sorted or not?
Ans:

Example1
Array Elements: 10 20 30 40 50
Yes It is already sorted Array


Example1
Array Elements: 10 200 30 400 50
No It is not sorted Array


*/
class A2{

public static void main(String args[]){

int arr[]={10,200,30};
int count=0;
for(int i=0;i<arr.length;i++){//i=2
	for(int j=i+1;j<arr.length;j++){
		if(arr[i]>arr[j]){
			count++;
		}
	}
  }
	if(count==0){
	System.out.println("Yes Array elements are already sorted");

	}
	else{
	System.out.println("No Array elements are not sorted");


	
}
}
}

 

