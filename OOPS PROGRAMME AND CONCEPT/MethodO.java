// METHOD OVERLOADING PROGRAMME

class MethodO{
public void add(){
int a , b , c;
a = 1;
b = 2;
c = a + b;
System.out.println("Addition without argument : " + c);
}

public void add ( int a , int b){

int c =
c = a + b;
System.out.println("Addition with two int argument: " + c);
}
public void add(int a , float b){
float c ;
c = a + b;
System.out.println("Addition with two int , float argument: " + c);
}
public void add(String a , String b){
int c ; 
c = Integer.parseInt(a) + Integer.parseInt(b);
System.out.println("Addition with two String argument: " + c);
}
public static void main(String a , String b){
String c;
c = "a" + "b";
System.out.println("Addition with two string: " + c);
}


public static void main(String args [ ]){
MethodO m = new MethodO();
m.add();
m.add(10,20);
m.add(10,2.5f);
m.add("2" , "2");
m.add(2, 2);

}
}
