import java.util.Scanner;

public class CheckWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Any String: ");
        String input = scanner.nextLine();
        if (input.contains("orange")) {
            System.out.println("orange is Present in the Sentence :YES");
        } else {
            System.out.println("orange is not Present in the Sentence :NO");
        }
    }
}
