// EXCEPTION HANDLING BY USING TRY AND CATCH  PROGRAMME


class Exc2{

public static void main(String args [ ] ) {

System.out.println("Hello...Mohit");
int a , b , c = 0;
a = 10;
b = 2;
System.out.println("Before Exception");
try{
System.out.println("Enter try");
c = a / b;
System.out.println("Exit try");
}
catch(ArithmeticException ae ){
System.out.println("This is catch block");
System.out.println("Denominator should not be zero");
}

System.out.println(c);
System.out.println("Bye");
System.out.println("After Exception");
}
}

