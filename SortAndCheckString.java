import java.util.Scanner;
import java.util.Arrays;

public class SortAndCheckString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // Sort the string
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        System.out.println(sortedString);

        // Check if the string contains all letters from 'a' to 'z'
        input = input.toLowerCase();
        boolean containsAll = true;
        for (char c = 'a'; c <= 'z'; c++) {
            if (!input.contains(String.valueOf(c))) {
                containsAll = false;
                break;
            }
        }
        System.out.println(containsAll ? "Yes" : "No");
    }
}
