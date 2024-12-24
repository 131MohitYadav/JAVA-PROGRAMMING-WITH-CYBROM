
public class StringOperations {
    public static void main(String[] args) {
        String text = "Betty got a bit of bitter better butter";
        
        // Part (a)
        System.out.println("Part (a): Indexes of 'b' and 't'");
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (c == 'b') {
                System.out.println("'b' found at index " + i);
            }
            if (c == 't') {
                System.out.println("'t' found at index " + i);
            }
        }
        
        // Part (b)
        System.out.println("\nPart (b): Each word with its length");
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word + ": " + word.length());
        }
        
        // Part (c)
        System.out.println("\nPart (c): Words starting with 'b'");
        for (String word : words) {
            if (word.toLowerCase().startsWith("b")) {
                System.out.println(word);
            }
        }
    }
}
