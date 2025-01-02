// Homework program 2

import java.util.Scanner;

public class TitleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any string:");
        String input = sc.nextLine();

        
        String result = ""; 

        String words [ ] = input.split(" ");
        for (String word : words) {
                // Convert the first letter to uppercase and the remaining to lowercase 
                String firstLetter = word.substring(0, 1).toUpperCase();
                String remainingLetters = word.substring(1).toLowerCase();
                result += firstLetter + remainingLetters + " ";
            
        }

        
        System.out.println("Result: " + result);

       
    }
}
