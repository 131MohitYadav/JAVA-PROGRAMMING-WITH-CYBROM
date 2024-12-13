// Write a java program to update all vowel by Z in the Given String

class VowelUpdate{
public static void main(String args [ ]){


StringBuffer s = new StringBuffer("welcome");
for ( int i = 0; i < s.length(); i++){
 char c = s.charAt(i);
if ( c== 'a' || c=='o' || c == 'u' || c == 'e'  || c == 'i'){
s.setharAt(i,'Z');
}
}

System.out.println(s);

}
}