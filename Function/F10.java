//Write a java programme to check given string is Pangram or not by using function [TAKING SOMETHING AND RETURN SOMETHING]


import java.util.Scanner;

class F10{

 boolean isPangram ( String s  ){ // Formal Arugment

// perform the operation


boolean alphaList [ ]  = new boolean[26];
int index = 0;

for(int i = 0; i < s.length(); i++){
	if ( s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
		index = s.charAt(i) - 'A';
}
else if ( s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
		index = s.charAt(i) - 'a';
}
		alphaList[index] = true;
}


for( boolean b : alphaList){
if ( ! b ){
return false;
}
}
return true;
}


public static void main(String args [ ]){

// taking input
Scanner sc = new Scanner(System.in);

System.out.print("Enter Any String : ");
 String s = sc.nextLine();


F10 obj = new F10();
boolean result = obj.isPangram(s);
if ( result){
System.out.println("The given string is Palindrome");
}
else{
System.out.println("The given string is not Palindrome");
}
}
}

