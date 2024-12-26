import java.util.Scanner;

public class EndingWithH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[10];
        
        System.out.println("Enter 10 names:");
        for (int i = 0; i < 10; i++) {
            names[i] = scanner.nextLine();
        }
        
        System.out.println("Names ending with 'h':");
        for (String name : names) {
            if (name.endsWith("h")) {
                System.out.println(name);
            }
        }
        
        
    }
}
