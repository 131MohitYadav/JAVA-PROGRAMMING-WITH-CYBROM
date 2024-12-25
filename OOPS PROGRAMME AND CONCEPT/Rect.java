// Constructor -> it used to initiliaze user defind data type

class Rect {

int l , b;

Rect(int x , int y){
l = x;
b = y;
}
int rectArea(){
return ( l * b);
}

int peri(){
return 2 * ( l + b);
}
public static void main ( String args [ ]){

Rect r1 = new Rect(4,3);
int area = r1.rectArea();
int p = r1.peri();
System.out.println(" The area of rectangle: " + area);
System.out.println(" Perimeter of rectangle: " + p);
}
}

