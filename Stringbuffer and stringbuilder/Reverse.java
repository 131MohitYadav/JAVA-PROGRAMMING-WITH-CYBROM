
// reverse() method

class Reverse{
public static void main(String args [ ]){

StringBuffer  sb1 = new StringBuffer("Welcome");
StringBuffer sb2 = new StringBuffer();
System.out.println(sb1);
sb2 = sb1.reverse();

if ( sb1 == sb2){
System.out.println("This is a Palindrome");
}
else{
System.out.println("This is not Palindrome");
}

}
}
