// Write a java programe that takes hours and minutes as input, and calculate the total number of minutes

import java.util.Scanner;

class TotalMinutes{

public static void main(String args [ ] ) {

// declare a variable

int H , M , Total;

Scanner sc = new Scanner(System.in);s

System.out.print("ENTER A HOURS : ");
H = sc.nextInt();

System.out.print("ENTER A MINUTES: ");
M = sc.nextInt();

Total = (H * 60 ) + M; // 1 hour = 60 minutes

System.out.println("TOTAL NUMBER OF MINUTES: " + Total);

}

}

