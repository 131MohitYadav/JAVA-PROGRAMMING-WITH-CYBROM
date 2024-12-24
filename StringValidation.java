import java.util.Scanner;

public class StringValidation1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if (input.length() < 3) {
            System.out.println("Error: The string must have at least 3 characters.");
        } else if (!input.matches("[a-zA-Z]+")) {
            System.out.println("Error: The string must contain only alphabets.");
        } else {
            System.out.println("Valid string: " + input);
        }
        
        scanner.close();
    }
}
