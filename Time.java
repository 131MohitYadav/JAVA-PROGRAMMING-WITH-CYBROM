// write a java programme to convert a given integer ( in seconds) to hours , minutes and seconds


import java.util.Scanner;

class Time {

public static void main(String args[]){


//declare a variable

int sec,min,hr,Totalseconds;

Scanner sc = new Scanner(System.in);

System.out.print("ENTER THE NUMBER OF SECONDS: ");
Totalseconds = sc.nextInt();

// perform the operation

hr = Totalseconds/3600; // 1 hour  = 60 minute  and  1 minute = 60 seconds

min = (Totalseconds % 3600) / 60;

sec = Totalseconds % 60;

System.out.println("H:M:S- " + hr +":" + min +":" + sec);

}
}






