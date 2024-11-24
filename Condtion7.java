// Condtional Statement
// else if 

// Write a java programme that reads the integer from the user and print it is Even, odd, Zero

class Condtion8{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

int n;

System.out.print("ENTER ANY NUMBER: ");
n = sc.nextInt();

if ( n % 2 == 0){
System.out.println("Even number");
}

else if( n % 2 == 1){
System.out.println("Odd number");
}
else{
System.out.println("Zero");
}

}
}