public class CountStringsIntegers {
    public static void main(String[] args) {
        String[] array = {"Raj", "77", "101", "99", "Jio"};
        int numericCount = 0;
        int stringCount = 0;
        
        for (String element : array) {
            try {
                Integer.parseInt(element);
                numericCount++;
            } catch (NumberFormatException e) {
                stringCount++;
            }
        }
        
        System.out.println("Numeric:" + numericCount);
        System.out.println("Strings:" + stringCount);
    }
}
