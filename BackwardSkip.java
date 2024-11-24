// Write  java program to print numbers backwards from 100 to 1 by skipping 2 numbers i.e 100 97 94 91 88 85 82 79... 16 13 10 7 4 1.

class BackwardSkip{

public static void main(String args [ ] ) {

for ( int i = 100; i >= 1; i -= 3){
System.out.print(i + " ");
}

}
}