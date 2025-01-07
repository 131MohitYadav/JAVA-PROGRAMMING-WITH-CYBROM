// STATIC METHOD EXAMPLE

class Point12{
int x; // instance variable
int y;

static int count;

public Point12(){
count++;
}
public static void main(String args [ ]){

Point12 p1 = new Point12();
Point12 p2 = new Point12();
Point12 p3 = new Point12();
 System.out.println(p1.count);
System.out.println(p2.count);
}
}
