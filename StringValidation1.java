import java.util.Scanner;

public class StringValidation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if (input.length() != 5) {
            System.out.println("Error: The string must have exactly 5 characters.");
        } else if (!input.matches("[0-9]+")) {
            System.out.println("Error: The string must contain only digits.");
        } else {
            System.out.println("Valid string: " + input);
        }
        
        scanner.close();
    }
}
