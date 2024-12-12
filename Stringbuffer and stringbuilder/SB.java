// STRINGBUFFER PROGRAM

class SB{
public static void main(String args [ ]){

StringBuffer sb1 = new StringBuffer();
System.out.println(sb1); // 16 default length print

StringBuffer sb2 = new StringBuffer("Hello");
System.out.println(sb2.capacity()); // sb1 + sb2 = 21

StringBuffer sb3 = new StringBuffer(1001);
System.out.println(sb3.capacity()); // 1001

}
}

