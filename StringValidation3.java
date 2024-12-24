import java.util.Scanner;

public class StringValidation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];
        
        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = scanner.nextLine();
        }
        
        System.out.println("Names starting with 'A':");
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
        
        scanner.close();
    }
}
