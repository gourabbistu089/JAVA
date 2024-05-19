import java.util.Arrays;

public class ArrayInbuiltMethods {

    public static void main(String[] args) {
        // Initial array
        int[] numbers = {5, 2, 8, 3, 1};

        // 1. Convert array to string and print
        System.out.println("Original array: " + Arrays.toString(numbers));

        // 2. Sort the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // 3. Fill the array with a specified value
        Arrays.fill(numbers, 7);
        System.out.println("Array after fill: " + Arrays.toString(numbers));

        // Resetting the array for further examples
        numbers = new int[]{5, 2, 8, 3, 1};

        // 4. Copy the array
        int[] copy = Arrays.copyOf(numbers, 3);
        System.out.println("Copied array (first 3 elements): " + Arrays.toString(copy));

        // Sort the array before binary search
        Arrays.sort(numbers);
        
        // 5. Perform binary search
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of element '3' after sorting: " + index);

        // 6. Check if two arrays are equal
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 2, 3, 4, 5};
        boolean areEqual = Arrays.equals(numbers1, numbers2);
        System.out.println("Are arrays equal? " + areEqual);
    }
}
