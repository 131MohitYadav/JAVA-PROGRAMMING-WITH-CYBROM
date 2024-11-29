// Write a java programme to find unique and  duplicate element  from the array

class ArrayDuplicate{

public static void main(String args [ ]){

int arr[ ] = {1,2,3,2,4,7,8,1,9,6};
int freq[ ] = new int[10];

for ( int i = 0; i<arr.length; i++){//1
  freq[arr[i]]++;//
}

System.out.println( "Unique element of the array: ");

for ( int i= 0; i<freq.length; i++){
if ( freq[i] == 1){
System.out.print( i + " ");
}
}


System.out.println( "\nDuplicate element of the array: ");

for ( int i= 0; i<freq.length; i++){
if ( freq[i] > 1){
System.out.print( i + " ");
}
}

}
}

