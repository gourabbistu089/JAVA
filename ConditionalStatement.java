public class ConditionalStatement {
    public static void main(String[] args) {
        // if ladder
        int age = 18;
        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        // if else ladder
        int number = 8;
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // if elseif else ladder
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // Nested if else
        age = 25;
        boolean hasLicense = true;
        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You can drive a car.");
            } else {
                System.out.println("You need to obtain a license first.");
            }
        } else {
            System.out.println("You are too young to drive.");
        }

        // Switch Statment
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
        age = 10;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println("You are a " + status);
    }
}
