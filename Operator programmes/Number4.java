// Write a java program to print alternate number from 80 to 70.

class Number4{

public static void main(String args [ ] ){

for ( int i = 80; i >= 70; i -= 2){
System.out.println(i);
if ( i > 70) {
System.out.println("skip");
}
}

}
}