// Homework program 

import java.util.Scanner;

public class CheckTitleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any string:");
        String input = sc.nextLine();

        
       boolean Titlecase = true;

        String words [ ] = input.split(" ");
        for (String word : words) {
                
   if (!Character.isUpperCase(word.charAt(0)) || !word.substring(1).equals(word.substring(1).toLowerCase())) {
                    Titlecase = false;
                    break; 
              
            }
        }
System.out.println(Titlecase);
        

       
    }
}
