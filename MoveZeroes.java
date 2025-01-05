public class MoveZeroes {
    public static void main(String[] args) {
        int[] array = {5, 1, 6, 0, 0, 3, 9, 0, 6, 7, 8, 12, 10, 0, 2};
        int n = array.length;
        
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (array[i] != 0) {
                array[count++] = array[i];
            }
        }
        
        while (count < n) {
            array[count++] = 0;
        }
        
        System.out.print("After moving 0 at the end\nOutput array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
