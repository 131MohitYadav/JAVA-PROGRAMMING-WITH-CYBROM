// PATTERN PROGRAMMES

// Write a java programme to print following pattern in binary form

class Pattern13{

public static void main(String args [ ] ) {

int r , c;
int n = 0;
// outer loop
for( r = 1; r <= 5;  r ++){
// inner loop
	for( c = 1; c <= r; c++){

//if ( ( r + c) % 2 == 0 ) {
//System.out.print("0" + " ");
//}
//else{
//System.out.print("1" + " ");
//}

System.out.print( ( r + c ) % 2 + " " );

}
System.out.println(" ");
}

}
}

// time complexity is:  O(n2)