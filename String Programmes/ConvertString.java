// Write a java program to convert given lowercase String into Uppercase without using pre defined method?

import java.util.Scanner;
class CovertString{

public static void main(String args [ ]){

Scanner sc = new Scanner(System.in);

System.out.print("ENTER ANY STRING: ");
String s = sc.nextLine();

String r = " ";
String x = " ";
for ( int x : s.toCharArray()){
if ( x >= 'a' && x <= 'z'){
x = x - 32;
r = r + x;
}

else{
r = r + x;
}
}
System.out.println(r);

}
}




