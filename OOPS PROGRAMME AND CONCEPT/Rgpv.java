// ABSTRACT CLASS

 abstract class Rgpv{
public Rgpv(){
System.out.println("Thisis RGPV class Constructor ");
}

public abstract void lab();
public abstract void cctv();
public void copyCheck(){
System.out.println("This is copy check method in Rgpv class and this is a non-abstract method");
}
}

class College extends Rgpv{
public College(){
System.out.println("This is college class constructor");
}
public void cctv(){
System.out.println("This is rgpv cctv method");
}
public void lab(){
System.out.println("This is rgpv lab method");
}
public void staff(){
System.out.println("This is college staff method");
}

public static void main(String args[]){
Rgpv r = new College();
r.cctv();
r.lab();
r.copyCheck();
// r.staff();
College c = new College();
c.staff();
c.lab();
c.copyCheck();
c.staff();
}
}