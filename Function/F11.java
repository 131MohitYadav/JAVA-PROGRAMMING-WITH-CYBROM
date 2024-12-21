//Write a java programme to check given string is Pangram or not by using function [TAKING SOMETHING AND RETURN SOMETHING]

import java.util.Arrays;
import java.util.Scanner;

class F11 {

     boolean areAnagrams(String s1, String s2) {
       
        if (s1.length() != s2.length()) {
            return false;
        }


		String s3 = s1.toLowerCase();
		String s4 = s2.toLowerCase();

        
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        
        return Arrays.equals(s1Array, s2Array);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

F11 obj = new F11();
  boolean res = obj.areAnagrams(s1,s2);
        if (res) {
            System.out.println("The given strings are anagrams.");
        } else {
            System.out.println("The given strings are not anagrams.");
        }
    }
}
