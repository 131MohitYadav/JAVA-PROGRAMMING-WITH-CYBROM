// ARRAY PROGRAMMES 

// Write a java programme to convert given binary number

import java.util.Scanner;

class ArrayBinary{

public static void main(String args [ ] ) {

Scanner sc = new Scanner(System.in);

System.out.print("ENTER ANY NUMBER: ");
int n = sc.nextInt();

int i = 0;
int arr [ ] = new int  [ 10 ] ;

while( n > 0){

int r = n % 2;
arr[i] = r;
i++;
n = n / 2;
}

System.out.println("Binary Number is: ");

for (  i = i - 1 ; i >= 0; i--){
System.out.print("\t" + arr [ i ]);
}


}
}


