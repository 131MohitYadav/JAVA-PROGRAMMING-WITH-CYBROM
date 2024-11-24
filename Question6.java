// write a java programme to increment,decrement,pre increment and decrement the value

class Question6{

public static void main(String args[]){

int a,b,c,d;

a = 10;
b = 20;

 //c = ++a;// pre increment 
// d = ++b;// pre increment

 // c = --a; // pre decrement 
// d = --b;  // pre decrement

c = a++; // post increment
d = b++; // post increment
 
//++a;
//b++;
//--a;
//b--;

System.out.println("Value of a is : " + a);
System.out.println("Value of b is: " + b);

System.out.println("Value of c is : " + c);
System.out.println("Value of d is: " + d);


}
}