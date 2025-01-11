import java.util.Scanner;

public class RemoveLeadingZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = input.replaceFirst("^0+", "");
        System.out.println(result);
    }
}
