import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 3, 4};
        
        LinkedHashSet<Integer> uniqueElements = new LinkedHashSet<>();
        for (int element : array) {
            uniqueElements.add(element);
        }
        
        System.out.print("Elements after removing duplicates: ");
        for (int element : uniqueElements) {
            System.out.print(element + " ");
        }
    }
}
