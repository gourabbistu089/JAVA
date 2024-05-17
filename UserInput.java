import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        // Reading a string input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read a line of text
        System.out.println("Your name is: " + name);

        // Reading an integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read an integer value
        System.out.println("Your age is: " + age);

        // Reading a double input
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble(); // Read a double value
        System.out.println("Your height is: " + height + " meters");

        // Reading a boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean(); // Read a boolean value
        System.out.println("Are you a student? " + isStudent);

        // Reading a character input
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0); // Read the first character of the input string
        System.out.println("The character you entered is: " + character);

        System.out.println("Enter a long number : ");
        long lNum = scanner.nextLong();
        System.out.println("Your long number is " + lNum);

        scanner.close(); // Close the Scanner object
    }
}