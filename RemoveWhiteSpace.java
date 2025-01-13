import java.util.Scanner;

public class RemoveWhiteSpace {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        scanner.close();

        String result = removeWhitespace(str);
        System.out.println("Result: " + result);
    }

    public static String removeWhitespace(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
}