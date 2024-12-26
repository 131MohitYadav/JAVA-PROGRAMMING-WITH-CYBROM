// PARAMETERIZED CONSTRUCTOR EXAMPLE

class Point2{
int x;
int y; // member data

public Point2(int a , int b){
x = a;
y =b;
}
public void showData(){
System.out.println("X_CO : " + x);
System.out.println("Y_CO : " + y);

}
public static void main(String args [ ] ){



Point2 p4 = new Point2(121,131);
p4.showData();
Point2 p5 = new Point2(12,13);
p5.showData();


}
}
