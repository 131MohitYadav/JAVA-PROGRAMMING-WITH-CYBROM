import java.util.Scanner;

public class AverageArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements you want in array: ");
        int n = sc.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter all the elements:");
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        
        double average = (double) sum / n;
        
        System.out.println("Sum of the array elements is: " + sum);
        System.out.println("Average of the array elements is: " + average);
    }
}
