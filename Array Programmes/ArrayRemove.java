// Write a java program to remove duplicate element in any Array

class ArrayRemove {
    public static void main(String args[]) {
        int arr[] = {10, 20, 20, 30, 30, 40, 50, 50}; 
        int n = arr.length; // Length of the array

        if (n == 0 || n == 1) { 

            System.out.println("Array is empty or has only one element");
            return;
        }

        // Removing duplicates
        int temp = 0; // Pointer for the position of unique elements
        for (int i = 0; i < n - 1; i++) { 
            if (arr[i] != arr[i + 1]) { // arr[0] = 10; arr[1] = 20
                arr[temp++] = arr[i]; // 
            }
        }

        arr[temp++] = arr[n - 1]; // Add the last unique element

        // Printing the modified array
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < temp; i++) { // Print only up to the new length `j`
            System.out.print(arr[i] + " ");
        }
    }
}
































































