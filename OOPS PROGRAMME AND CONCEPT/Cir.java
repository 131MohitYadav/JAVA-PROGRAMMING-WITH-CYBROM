// INHERITANCE PROGRAMME

class Point4{
int x;
int y; // member data

public Point4(){
System.out.println("Point class Default constructor is called ");
}
public Point4(int x , int y){
this.x = x; // agar member data and argument k namm same ho ga to this keyword ka use krte hai
this.y = y;
System.out.println("Point class parameterized constructor is called");

}
public static void main(String args [ ] ){

Point4 p1 = new Point4();
Point4 p2 = new Point4(10,20);
}
}

class Cir extends Point4{
public static void main(String args [ ] ) {
System.out.println("Circle class main method called");

Point4 p1 = new Point4();
Point4 p2 = new Point4(10,20);

}
}
