import java.util.Scanner;

public class RemoveConsonants {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        String vowelsOnly = removeConsonants(inputString);
        System.out.println("Output: " + vowelsOnly);
    }

    public static String removeConsonants(String str) {
        String vowels = "a e i o u A E I O U ,";
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                result.append(c);
            }
        }
        return result.toString();
    }
}