// VARIABLE ARGUMENT(varargs)

class VariableArg{

public static void add(int...x){
int sum = 0;
for ( int a : x ) {
sum = sum + a;
}
System.out.println("The sum is: " + sum);
}
public static void main(String...args){
add();																															

}
}

