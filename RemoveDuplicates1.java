public class RemoveDuplicates1 {

    public static void main(String[] args) {
        String str = "HappyNewYear"; 
        String result = removeDuplicates(str);
        System.out.println("Result: " + result);
    }

    public static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) { 
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}