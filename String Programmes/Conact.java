// concat() Method

class Concat{
public static void main(String args [ ]){

String s1 = "Soft";
String s2 = "ware";
String s3 = s1 + s2;
String s4 = "Software";
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println(s4);
System.out.println(s3 == s4); // false
System.out.println(s3.compareTo(s4) == 0); // true

}
}