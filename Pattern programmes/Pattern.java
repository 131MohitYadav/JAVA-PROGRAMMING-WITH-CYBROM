// PATTERN PROGRAMMES

// Write a java programme to print following pattern 

class Pattern{

public static void main(String args [ ] ) {

int r , c;
// outer loop
for( r = 1; r <= 5;  r++){
// inner loop
	for( c = 1; c <= 5; c++){
System.out.print("*" + " ");
}
System.out.println(" ");
}

}
}

// time complexity is:  O(n2)