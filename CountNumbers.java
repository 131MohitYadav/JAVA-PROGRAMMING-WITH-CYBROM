import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] array = new int[n];
        System.out.println("Input elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] > 0) {
                positiveCount++;
            } else if (array[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive Numbers are: " + positiveCount);
        System.out.println("Negative Numbers are: " + negativeCount);
        System.out.println("Zeros are: " + zeroCount);
    }
}
