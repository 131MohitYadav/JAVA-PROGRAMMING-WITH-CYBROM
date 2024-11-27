// Array Programmes

// Write a java program to sort array in Descending order

class ArraySort1{

public static void main(String args [ ]){

int arr [ ]  = {30,20,10,40, 50};

System.out.println("Before Sorting");

for ( int i = 0; i< arr.length; i++){
System.out.print("\t" + arr[i]);
}

// bubble sort logic

for ( int i = 0; i< arr.length; i++){
	
	for ( int j = i + 1; j<arr.length; j++){
		if ( arr [ i ] < arr [ j ]){
int temp = arr [ i ] ; 
arr [ i ] = arr [ j ];
arr [ j ] = temp;
}
}
}

System.out.println(" \nAfter Sorting");

for ( int i = 0; i< arr.length; i++){
System.out.print("\t" + arr[i]);
}

}
}




