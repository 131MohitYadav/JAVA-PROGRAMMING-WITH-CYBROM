
// Question 1 -> Write a java program that takes three numbers from the user and print the  greatest number

import java.util.Scanner;


class GreatestNumber{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

int n1 , n2 , n3;

System.out.print("ENTER NUMBER 1 : ");
n1 = sc.nextInt();

System.out.print("ENTER NUMBER 2 : ");
n2 = sc.nextInt();

System.out.print("ENTER NUMBER 3 : ");
n3 = sc.nextInt();
System.out.print("The Greatest Value: ");
if ( n1 > n2 && n1 > n3){

System.out.println(n1);
}

else if( n2 > n1 && n2 > n3){
System.out.println(n2);
}

else if( n3 > n1 && n3 > n2){
System.out.println(n3);

}
}
}


