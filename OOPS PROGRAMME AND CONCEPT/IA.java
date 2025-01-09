// INTERFACE PROGRAMME

interface IA {
void a();
}
interface IB {
void b();
}


class Test implements IA{
public void a() {
System.out.println("This is interface(IA) method called");
}
public void b() {
System.out.println("This is interface(IB)method called");
}

public void hello(){
System.out.println("This is Test Class method called");
}
public static void main(String args [ ] ){

IA obj = new Test();
obj.a();
// obj.hello();
Test t = new Test();
t.a();
t.hello();
t.b();

}
}
