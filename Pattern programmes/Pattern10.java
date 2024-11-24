// PATTERN PROGRAMMES

// Write a java programme to print following pattern 

class Pattern10{

public static void main(String args [ ] ) {

int r , c;
// outer loop
for( r = 1; r <= 5;  r ++){
// inner loop
	for( c = 1; c <= r; c++){

System.out.print( ( char) ( 64 + r) + " " );
}
System.out.println(" ");
}

}
}

// time complexity is:  O(n2)