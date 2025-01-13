public class FindOccurrences {

    public static void main(String[] args) {
        String str = "Hello, World";
        int firstO = str.indexOf('o');
        int lastO = str.lastIndexOf('o');
        int firstComma = str.indexOf(',');
        int lastComma = str.lastIndexOf(',');

        System.out.println("First Occurrence of 'o': " + firstO);
        System.out.println("Last Occurrence of 'o': " + lastO);
        System.out.println("First Occurrence of ',': " + firstComma);
        System.out.println("Last Occurrence of ',': " + lastComma);
    }
}