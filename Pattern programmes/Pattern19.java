// Write a java programme to print following pattern 

class Pattern19{

public static void main(String args [ ] ) {

int r , c , s ;

// outer loop
for( r = 1; r <= 4;  r ++){

// for spacing
for (  s = 5 ; s > r; s--){
System.out.print(" ");
}
	for( c = 1; c <= 2 * r - 1; c++){


System.out.print( "*" );

}

System.out.println(" ");
}

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
