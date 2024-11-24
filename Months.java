// Write a java programme that reads an integer between 1 and 12 and print the month of the year in English

// BY USING SWITCH CASE

import java.util.Scanner ;

class Months{

public static void main(String args[ ] ) {

// delcare a variable

String month;
int monthnumber;

Scanner sc = new Scanner(System.in);

System.out.print("INPUT A NUMBER BETWEEN  1 TO 12  AND GET THE MONTH NAME: ");
monthnumber = sc.nextInt();


switch(monthnumber){

case 1:
    month = " January ";
break;

case 2:
    month = " February ";
break;

case 3:
    month = " March ";
break;

case 4:
    month = " April ";
break;

case 5:
    month = " May ";
break;

case 6:
    month = " June ";
break;

case 7:
    month = " July ";
break;

case 8:
    month = " August ";
break;

case 9:
    month = " September ";
break;

case 10:
    month = " October ";
break;

case 11:
    month = " November ";
break;

case 12:
    month = " December ";
break;

default:
    month = " Invalid month number ";

}

System.out.println("MONTH: " + month);
}

}




