// PATTERN PROGRAMMES

// Write a java programme to print following pattern 

class Pattern5{

public static void main(String args [ ] ) {

int r , c;
// outer loop
for( r = 5; r >= 1;  r--){
// inner loop
	for( c = 1; c <= r; c++){
System.out.print(r + " ");
}
System.out.println(" ");
}

}
}

// time complexity is:  O(n2)