public class EvenOddArray {
    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 13, 14};
        
        System.out.print("Even numbers in the array are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        
        System.out.println();
        
        System.out.print("Odd numbers in the array are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
