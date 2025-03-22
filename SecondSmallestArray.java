import java.util.Scanner;

public class SecondSmallestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("Input elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int largest = Integer.MIN_VALUE;

        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        
        System.out.println("Second smallest element is: " + secondLargest);
    }
}
