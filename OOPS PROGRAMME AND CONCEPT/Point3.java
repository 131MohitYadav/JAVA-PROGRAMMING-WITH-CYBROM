// ENCAPSULATION EXAMPLE

class Point3{
 private int x;
 private int y; // member data

public int getX(){
return x;
}
public void setX(int x){
this.x = x;
}
public int getY(){
return y;
}
public void setY(int y){
this.y = y;
}


public static void main(String args [ ] ){

Point3 p1 = new Point3();
p1.setX(11);
p1.setY(12);
System.out.println("X_CO : " + p1.getX());
System.out.println(" y_CO : " + p1.getY());


}
}
