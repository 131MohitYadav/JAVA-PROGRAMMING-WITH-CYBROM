

import java.util.Scanner;
class Pangram1{
public static void main(String args[ ] ){

Scanner sc =new Scanner(System.in);
System.out.print("ENTER ANY STRING: ");
String s = sc.nextLine();

boolean alphaList [ ]  = new boolean[26];
int index = 0;
int res = 1;
for(int i = 0; i < s.length(); i++){
	if ( s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
		index = s.charAt(i) - 'A';
}
else if ( s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
		index = s.charAt(i) - 'a';
}
		alphaList[index] = true;
}

for ( int i = 0; i <= 25; i++){
	if ( alphaList[i] == false)
	res = 0;
}
if ( res == 1){
System.out.print("YES");
}
else{
System.out.print("NO");
}
}
}

