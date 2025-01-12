import java.util.Scanner;

public class CheckLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Any String: ");
        String input = scanner.nextLine();
        if (input.contains("e")) {
            System.out.println("e is Present in the word :YES");
        } else {
            System.out.println("e is not Present in the word :NO");
        }
    }
}
