// PATTERN PROGRAMMES

// Write a java programme to print following pattern 

class Pattern18{

public static void main(String args [ ] ) {

int r , c , s ;

// outer loop
for( r = 5; r >= 1;  r--){

// for spacing
for (  s = 5 ; s > r; s--){
System.out.print(" ");
}
	for( c = 1; c <= 2 * r - 1; c++){


System.out.print( "*" );

}

System.out.println(" ");
}

}
}

// time complexity is:  O(n2)