import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int index = sc.nextInt();
        char replacement = sc.next().charAt(0);

        if (index >= 0 && index < input.length()) {
            String result = input.substring(0, index) + replacement + input.substring(index + 1);
            System.out.println(result);
        } else {
            System.out.println("Invalid index");
        }
    }
}
