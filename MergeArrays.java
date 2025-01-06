public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {11, 12, 13, 14, 15};
        
        int length1 = array1.length;
        int length2 = array2.length;
        int[] mergedArray = new int[length1 + length2];
        
        for (int i = 0; i < length1; i++) {
            mergedArray[i] = array1[i];
        }
        
        for (int i = 0; i < length2; i++) {
            mergedArray[length1 + i] = array2[i];
        }
        
        System.out.print("New array (After merging elements): ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}
