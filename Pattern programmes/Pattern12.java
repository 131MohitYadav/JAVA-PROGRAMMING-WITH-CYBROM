// PATTERN PROGRAMMES

// Write a java programme to print following pattern 

class Pattern12{

public static void main(String args [ ] ) {

int r , c;
int n = 0;
// outer loop
for( r = 1; r <= 5;  r ++){
// inner loop
	for( c = 1; c <= r; c++){
n++;
System.out.print( ( char) ( 64 +  n) + " " );

}
System.out.println(" ");
}

}
}

// time complexity is:  O(n2)