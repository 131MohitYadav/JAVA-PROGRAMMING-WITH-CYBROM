// INHERITANCE PROGRAMME

class Point4{
int x;
int y; // member data

public Point4(){
System.out.println("Point class Default constructor is called ");
}
public Point4(int x , int y){
this.x = x;
this.y = y;
System.out.println("Point class parameterized constructor is called");

}
public static void main(String args [ ] ){

Point4 p1 = new Point4();
Point4 p2 = new Point4(10,20);
}
}

