// MULTIPLE INHERITANCE USING INTERFACE CLASS


interface IA1 {
void a();
}
interface IB {
void b();
}

interface IC  extends IA1,IB{
void c();
}


class Test implements IC{
public void a() {
System.out.println("This is interface(IA) method called");
}
public void b() {
System.out.println("This is interface(IB)method called");
}

public void c() {
System.out.println("This is interface(IC)method called");
}

public void hello(){
System.out.println("This is Test Class method called");
}
public static void main(String args [ ] ){


Test t = new Test();
t.a();
t.b();
t.c();
t.hello();


}
}
