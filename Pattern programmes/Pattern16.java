// PATTERN PROGRAMMES

// Write a java programme to print following pattern 

class Pattern16{

public static void main(String args [ ] ) {

int r , c , s ;
int n = 0;
// outer loop
for( r = 1; r <= 5;  r ++){

// for spacing
for (  s = 5 ; s > r; s--){
System.out.print(" ");
}
	for( c = 1; c <= r; c++){
n++;

System.out.print( (char)  + ( 64 + n) );

}

System.out.println(" ");
}

}
}

// time complexity is:  O(n2)