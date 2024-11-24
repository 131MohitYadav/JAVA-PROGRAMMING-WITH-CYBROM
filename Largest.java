// Ternary Operator

// Write a java programme  to print largest number from the given two number




import java.util.Scanner;

class Largest {

public static void main(String args [ ] ){

int n1 , n2;
String result;

Scanner sc = new Scanner(System.in);

System.out.print("ENTER NUMBER 1: ");
n1 = sc.nextInt();

System.out.print("ENTER NUMBER 2: ");
n2 = sc.nextInt();

//result = n1 == n2 ? "Both number are equal " :  n1 > n2 ? " Number 1 is greater " : //"Number 2 is greater";

result = n1 >= n2 ? " Number 1 is greater " : " Number 2 is greater ";

System.out.println(result + " " );

}
}