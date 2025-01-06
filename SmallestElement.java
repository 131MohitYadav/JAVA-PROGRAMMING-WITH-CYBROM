import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();

        int[] array = new int[n];
        System.out.println("Input elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        int smallest = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        System.out.println("Smallest element: " + smallest);
    }
}
