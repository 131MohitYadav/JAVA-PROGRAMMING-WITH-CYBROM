
public class Op4{

public static void main(String args [ ] ) {

int a = 123;
int b = 234;
int sum = 0;
int res = 0;

int r = a % 10;
sum = sum + r;
int s = b % 10;
res = res + s;

int total = sum  + res;

System.out.println(" Sum of Last digit of number: " + total);

}
}