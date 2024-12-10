// Homwork program

import java.util.Scanner;
class CovertUandL{

public static void main(String args [ ]){

Scanner sc = new Scanner(System.in);

System.out.print("ENTER ANY STRING: ");
String s = sc.nextLine();

char arr[ ] = s.toCharArray();

// for LowerCase
for ( int i = 0; i < arr.length; i++){
if ( arr[i] >= 'a' && arr[i] <= 'z'){
arr[i] =  (char) (arr[i] - 32);
}

// for UpperCase
else if( arr[i] >= 'A' && arr[i] <= 'Z'){
arr[i] = (char) (arr[i] + 32);
}
}
String result = new String(arr);

System.out.println(result);

}
}

