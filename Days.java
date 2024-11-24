
// Write a java program to convert a given integer(in days) to years, months and day,s assumes that all months have 30 days and all years have 365 days. 


import java.util.Scanner;

class  Days {

public static void main(String args [ ] ) {

int Y,M,D,Totaldays,Remainingdays;

Scanner sc = new Scanner(System.in);

System.out.println("ENTER NUMBER OF DAYS: " );
Totaldays = sc.nextInt();

Y = Totaldays / 365;
Remainingdays = Totaldays % 365;

M = Remainingdays/30;
D = Remainingdays % 30;

System.out.println("YEARS: " + Y);
System.out.println("MONTHS: " + M);
System.out.println("DAYS: " + D);
}
}
