import java.util.Scanner;

public class Combination {
    public static void main(String[] args)
	{
        // Initialize the Scanner to read user input
        Scanner in = new Scanner(System.in);

        System.out.println(" The If & If-Else statements");
        System.out.print("Enter your age: ");
        int age = in.nextInt();

        // 1. The'if' statement
        if (age < 0) {
            System.out.println("No age found!");
        }

        // 2.The 'if-else' statement
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a kid.");
        }

        System.out.println(" The Nested If ");
        System.out.print("Do you have a Proof? (true/false): ");
        boolean hasProof = in.nextBoolean();
		// 3. Nested 'if' statement
        if (age >= 18) {
            if (hasProof) {
                System.out.println(" Allowed: You are an adult with a valid Proof.");
            } else {
                System.out.println("Not allowed: Missing valid Proof.");
            }
        } else {
            System.out.println("Not allowed: You must be 18 or older.");
        }

        System.out.println("The If-Else-If Ladder ");
        System.out.print("Enter your Interview marks  (0-100): ");
        int marks = in.nextInt();

        // 4. 'if-else-if' ladder
        if (marks >= 90) {
            System.out.println("Grade: O");// OUTSTANDING
        } else if (marks >= 75) {
            System.out.println("Grade: A");// VERY GOOD
        } else if (marks >= 50) {
            System.out.println("Grade: B");//GOOD
        } else {
            System.out.println("Grade: F (Fail)");
        }

        System.out.println("The Switch Case");
System.out.print("Enter a menu choice number (1, 2, or 3): ");
        int choice = in.nextInt();

        // 5. 'switch' case statement
        switch (choice) {
            case 1:
                System.out.println(" First choice 1: I want to score centum.");
                break;
            case 2:
                System.out.println("Second choice 2: I want to work hard.");
                break;
            case 3:
                System.out.println("Third choice 3: I won.");
                break;
            default:
                System.out.println("Invalid menu choice.");
                break;
        }

        // Close the scanner resource
        in.close();
        System.out.println("Program completed.");
    }
}