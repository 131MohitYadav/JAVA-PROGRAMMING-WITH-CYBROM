// Write a java program to delete first and middle and last character of String
// deleteCharAt() method

class DeleteCharacter{
public static void main(String args [ ]){

StringBuffer  sb1 = new StringBuffer("Welcome");
System.out.println(sb1);

sb1.deleteCharAt(sb1.length()/2);
sb1.deleteCharAt(0);
sb1.deleteCharAt(sb1.length()-1);
System.out.println(sb1.toString());

}
}
