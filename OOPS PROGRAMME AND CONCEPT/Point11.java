//SAMAJNE KE LEYE EXAMPLE USE KIYA HAI

class Point11{
int x; 
int y; // instance variable

int count;

public Point11(){
count++;
}
public static void main(String args[]){
Point11 p1 = new Point11();
Point11 p2 = new Point11();
Point11 p3 = new Point11();

System.out.println(p1.count);
System.out.println(p2.count);
System.out.println(p3.count);
}
}

