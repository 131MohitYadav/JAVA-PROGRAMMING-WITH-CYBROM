
// Write a java program to print multiple of 3 and 5 from 1 to 60 using while , do while and for loop

class DoWhile5{

public static void main(String args [ ] ) {


int i  = 1;
do{
if ( i % 3 == 0 && i % 5 == 0 ){
System.out.println(i);
}
i++;

}
while ( i <= 60);

}
}