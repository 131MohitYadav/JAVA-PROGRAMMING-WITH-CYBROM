// Write a java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input.  if the user input is not letter ( between a and z or A and Z ) , or is a string of length > 1, print an error  message.

import java.util.Scanner;

class CheckCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER ANY CHARACTER: ");
        String str = sc.nextLine();
	char c = str.charAt(0);
       
        if (str.length() > 1 || !Character.isLetter(str.charAt(0))) {
            System.out.println("Error: Please enter a single alphabet character.");
        } else {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.println("Input letter is a vowel");
            } else {
                System.out.println("Input letter is a consonant");
            }
        }

       
    }
}
