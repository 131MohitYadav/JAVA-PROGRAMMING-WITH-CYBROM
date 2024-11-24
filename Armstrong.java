
// Write java program to check given number is strong number is Strong Number / Krishnmurthy Number;
// if the sum of th factorials of its digits is equal to the number itself like
// 145 => 1 ! + 4 ! + 5 ! -> 1 + 24 + 120 = 145

import java.util.Scanner;
class Armstrong{
public static void main(String args [ ] ) {
Scanner sc = new Scanner(System.in);

System.out.print("ENTER ANY  3 DIGIT NUMBER: ");
 int n = sc.nextInt();

int Arm ;
int sum = 0;
int m = n; // store the original value of n


while( n != 0 ){ // 153
int r = n % 10; // 3
 Arm = r * r * r;
sum = sum + Arm; //27
n = n / 10;//15
}
if ( m == sum){
System.out.println("This is Armstrong number");
}
else{
System.out.println("This is not Armstrong number");
}

}
}