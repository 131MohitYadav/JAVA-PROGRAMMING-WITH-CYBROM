// Write a java program in java to input 5 number from the keyboard and find their sum and average
import java.util.Scanner;

public class AverageSum  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int numberOfInputs = 5;
	float average ;
        System.out.println("Enter " + numberOfInputs + " numbers:");

        
        for (int i = 1; i <= numberOfInputs; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = sc.nextInt();
            sum += number;
        }

        
        average = sum / numberOfInputs;

    
        System.out.println(" The Sum of 5 no. is: " + sum);
        System.out.println(" The Average is: " + average);

        
    }
}
