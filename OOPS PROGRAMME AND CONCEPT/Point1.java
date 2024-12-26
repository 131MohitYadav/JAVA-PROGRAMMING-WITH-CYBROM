// DEFAULT CONSTRUCTOR EXAMPLE

class Point1{
int x;
int y; // member data

public Point1(){
x = 1;
y =1;
System.out.println("Default Constructor called");
}
public void showData(){
System.out.println("X_CO : " + x);
System.out.println("Y_CO : " + y);

}
public static void main(String args [ ] ){
Point1 p1 = new Point1(); // Point class default constructor called
Point1 p2 = new Point1(); // Point class default constructor called
Point1 p3 = new Point1(); // Point class default constructor called
p1.showData();
p2.showData();
p3.showData();

}
}
