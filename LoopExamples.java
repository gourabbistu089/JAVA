public class LoopExamples {

    public static void main(String[] args) {
        // For loop example
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While loop example
        System.out.println("\nWhile Loop:");
        int i = 0;
        while (i < 5) {
            System.out.println("Iteration: " + i);
            i++;
        }

        // Do-while loop example
        System.out.println("\nDo-While Loop:");
        i = 0;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i < 0);

        // Enhanced for loop example
        System.out.println("\nEnhanced For Loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // Nested loops example
        System.out.println("\nNested Loops:");
        for (int outer = 1; outer <= 3; outer++) {
            for (int inner = 1; inner <= 3; inner++) {
                System.out.println("Outer: " + outer + ", Inner: " + inner);
            }
        }

        // Break statement example
        System.out.println("\nBreak Statement:");
        for (i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Iteration: " + i);
        }

        // Continue statement example
        System.out.println("\nContinue Statement:");
        for (i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("Iteration: " + i);
        }
    }
}
