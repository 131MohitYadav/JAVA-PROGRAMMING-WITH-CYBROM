import java.util.Scanner;

class NameAbbreviation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String fullName = sc.nextLine();

        String[] nameParts = fullName.split(" ");

        String abbreviatedName = "";

        for (int i = 0; i < nameParts.length; i++) {
            if (i < nameParts.length - 1) {
                abbreviatedName += nameParts[i].charAt(0) + ".";
            } else {
                abbreviatedName += nameParts[i];
            }
        }

        System.out.println("Result: " + abbreviatedName);
        sc.close();
    }
}