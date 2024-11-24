// Write a java programme that converts kilometers per hour to miles per hour


import java.util.Scanner ;

class ConvertKilo {

public static void main(String args [ ] ) {

// declare a variable

int K;
float Onekm = 0.6213712f , Mile;

Scanner sc = new Scanner(System.in);

System.out.print("ENTER A KILOMETER PER HOUR: " ) ;
K = sc.nextInt();


Mile = Onekm * K;

System.out.println(Mile + " miles per hour");

}

}

