// INHERITANCE PROGRAM 


// PARENT CLASS
class Point5{
public int x;
public int y;//instance variable
public int z=101;
public Point5(){
System.out.println("Point class Default Constructor is called");
}

public Point5(int x,int y){
this.x=x;
this.y=y;
System.out.println("Point class Parameterized Constructor is called");
}

void showData(){
System.out.println("X_CO : "+x);
System.out.println("Y_CO : "+y);

}
void hi(){
System.out.println("Hi... Method is Called");

int x=111;
int y=222;
System.out.printf("\nx=%d  Y=%d ",this.x,this.y);


}

}

// CHILD CLASS
class Circle1 extends Point5{
float r;
int z=102;
public Circle1(){
System.out.println("Circle class Default Constructor");
}
public Circle1(int x,int y,float r){
super(x,y);//call  parent class constructor
this.r=r;
System.out.println("Circle class Parameterized Constructor");
}
void showData(){
super.hi();
System.out.println("X_CO : "+x);
System.out.println("Y_CO : "+y);
System.out.println("Radius is : "+r);
System.out.println("circle z= : "+z);
System.out.println("Point class z= : "+super.z);
}

public static void main(String args[]){
//Circle1 c1=new Circle1();
//Point class default constructor (1)and Circle class default constructor(2)
Circle1 c2=new Circle1(11,22,5.6f);
c2.showData();
}

}