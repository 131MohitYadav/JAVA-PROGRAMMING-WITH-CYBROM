// RECURSION 

// Write a java program to calculate the factorial number by using recursion

class Recursion{

int fact ( int n ){
if ( n == 1){ // base case
return 1;
}
else{
return n*fact(n-1); // recursive case
}
}
public static void main(String args[ ]){
Recursion x = new Recursion();
System.out.println(x.fact(5));
}
}