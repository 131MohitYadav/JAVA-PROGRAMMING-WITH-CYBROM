// compareTo Method

// Write a java program to check which one String is greater on the basis order of the character


import java.util.Scanner;

class StringGreater{
public static  void main(String ags [ ]){

Scanner sc = new Scanner(System.in);
System.out.print("Enter String 1 : ");
String s1 = sc.nextLine();
System.out.print("Enter String 2 : ");
String s2 = sc.nextLine();

int x = s1.compareTo(s2);

if ( x > 0){
System.out.println( s1 + "  Is Greater");
}
else if ( x < 0 ){
System.out.println( s2 + " Is Greater");
}
else if ( x== 0){
System.out.println( s1 + " and "+ s2 + " are Equal");
}

}
}

