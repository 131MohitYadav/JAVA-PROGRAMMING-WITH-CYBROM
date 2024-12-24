// OOPS PROGRAMME

// Write a java program to create a class hra and da etc


import java.util.Scanner;

class Employee{
String name;
int empno;
float sal;

void getData(){
Scanner sc = new Scanner(System.in);
System.out.print("ENTER EMPLOYEE NAME: ");
name= sc.nextLine();
System.out.print("ENTER EMPLOYEE NO.: ");
empno= sc.nextInt();
System.out.print("ENTER SALARY AMOUNT: ");
sal = sc.nextFloat();
}

void showData(){
System.out.println("Employee name  is : " + name);
System.out.println("Emloyee number  is : " + empno);
System.out.println("Employee salary is : " + sal);
}

double getHRA(){
return sal * 0.2;
}
double getDA(){
  return sal *  0.1;
}
double getTA(){
return sal * 0.2;
}
 
double grossSalary(){
 return sal + totalHDT;
}

double getTotalIncentive(){
return totalHDT;
}

public static void main(String args [ ]){

Employee e = new Employee();

e.getData(); // these are member function
e.showData();
System.out.println("HRA : " + e.getHRA());
System.out.println("DA : " + e.getDA());
System.out.println("TA : " + e.getTA());
System.out.println( " All Incentive : " + e.getTotalIncentive());
//System.out.println( " All GrossSalary: " + e.grossSalary());

}
}

 