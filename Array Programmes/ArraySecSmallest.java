// ARRAY PROGRAMMES 

// Write a java programme to find  first and second  Smallest element from  the array

import java.util.Scanner;

class ArraySecSmallest{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

int arr [ ] = new int  [ 7 ] ;

int FirstMin = Integer.MAX_VALUE;
int SecMin = Integer.MAX_VALUE;

// input of the array
for ( int i = 0; i<arr.length; i++){
System.out.print("Enter Element of the Array: " + i  + " :  ");
arr[i] = sc.nextInt();//100
}

for ( int i = 0 ; i < arr.length; i++){
if ( arr [ i ] < FirstMin){
SecMin = FirstMin;//100
FirstMin = arr [ i ];//100
}
else if ( arr [ i ] < SecMin && arr [ i ] != FirstMin){
SecMin = arr [ i ] ;
}
}
System.out.println("######################################");

System.out.println(" First Smallest Element : " + FirstMin);

System.out.println("Second Smallest Element: " + SecMin);




}
}


