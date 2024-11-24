
// Write a java program to find the number of days in a month.

import java.util.Scanner;

class NumberMonth{

public static void main(String args [ ] ) {

Scanner sc = new Scanner (System.in);

// declare a variable

int  M , Y , daysInmonth;
String MonthName;

System.out.print("ENTER A  MONTH NUMBER : ");
M = sc.nextInt();

System.out.print("ENTER A YEAR: ");
Y = sc.nextInt();

switch(M){

case 1:
	MonthName = "January";
	daysInmonth = 31;
	break;

case 2:
	MonthName = "February";
  if( (Y % 4 == 0 && Y % 100 != 0 ) || ( Y % 400 == 0)){
 	daysInmonth = 29; // Leap year
}
else{
	daysInmonth = 28; // Non- leap year
}
	break;

case 3:
	MonthName = "March";
	daysInmonth = 31;
	break;

case 4:
	MonthName = "April";
	daysInmonth = 30;
	break;

case 5:
	MonthName = "May";
	daysInmonth = 31;
	break;

case 6:
	MonthName = "June";
	daysInmonth = 30;
	break;

case 7:
	MonthName = "July";
	daysInmonth = 31;
	break;

case 8:
	MonthName = "August";
	daysInmonth = 30;
	break;

case 9:
	MonthName = "September";
	daysInmonth = 31;
	break;

case 10:
	MonthName = "October";
	daysInmonth = 30;
	break;

case 11:
	MonthName = "November";
	daysInmonth = 31;
	break;

case 12:
	MonthName = "December";
	daysInmonth = 30;
	break;

default:
	MonthName = "Invalid";
	daysInmonth = 0;
	System.out.println("Invalid month number");

}
System.out.println(MonthName + " " + Y + " " + "has" + " " + daysInmonth + " " + "days"); 

}
}



