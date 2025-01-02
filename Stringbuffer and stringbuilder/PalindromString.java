// Write a java program given string is palindrome or not

import java.util.Scanner;
class PalindromeString{
public static void main(String args [ ] ){

Scanner sc = new Scanner(System.in);
System.out.println("ENTER ANY STRING: ");
String s1 = sc.nextLine();

StringBuffer s2 = new StringBuffer(s1);
String result = s2.reverse().toString();

if ( result.equals(s1 )){
System.out.println("This is Palindrom String");
}
else{
System.out.println("This is not a Palindrome String");
}



}
}