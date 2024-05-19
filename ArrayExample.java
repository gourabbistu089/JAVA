public class ArrayExample {

    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Access and print elements of the array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Modify an element in the array
        numbers[2] = 10; // Change the element at index 2 to 10

        // Print the modified array
        System.out.println("\nModified array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Declare and initialize an array of strings
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Access and print elements of the string array using enhanced for loop
        System.out.println("\nArray of fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Array of arrays (2D array)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Access and print elements of the 2D array
        System.out.println("\n2D array elements:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println("Element at row " + row + ", col " + col + ": " + matrix[row][col]);
            }
        }
    }
}
