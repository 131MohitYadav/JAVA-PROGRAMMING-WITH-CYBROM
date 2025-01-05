import java.util.Scanner;

public class MissingElementFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 6, 7};
        int n = array.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        
        for (int i = 0; i < array.length; i++) {
            actualSum += array[i];
        }
        
        System.out.println("Missing element is: " + (expectedSum - actualSum));
    }
}
