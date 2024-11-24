
// Write java program to check given number is strong number is Strong Number / Krishnmurthy Number;

import java.util.Scanner;
class Knumber{
public static void main(String args [ ] ) {
Scanner sc = new Scanner(System.in);

System.out.print("ENTER ANY NUMBER: ");
 int n = sc.nextInt();

int fact;
int sum = 0;
int m = n;
while( n != 0 ){
int r = n % 10;
//factorial logic
fact = 1;
for( int i = r ; i >= 1; i--) {
fact = fact * i;
}
sum = sum + fact;
n = n / 10;
}
if ( m == sum){
System.out.println("This is Strong number");
}
else{
System.out.println("This is not Strong number");
}

}
}