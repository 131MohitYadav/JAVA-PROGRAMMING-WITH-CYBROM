
// Write java program to print the palindrome number
// like -> 131 , 121 , 333 etc

import java.util.Scanner;
class Palindrome{
public static void main(String args [ ] ) {
Scanner sc = new Scanner(System.in);

System.out.print("ENTER ANY NUMBER: ");
 int n = sc.nextInt();

int rev = 0;
int m = n;
while( n != 0 ){
int r = n % 10;
rev = rev * 10 + r;
n = n / 10;
}
if ( m == rev){
System.out.println("This is palindrome number");
}
else{
System.out.println("This is not palindrome number");
}

}
}