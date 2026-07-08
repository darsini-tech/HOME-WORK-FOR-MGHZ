import java.util.*;
public class operator
{
	public static void main (String args[])
 {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Input second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform calculations using operators
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        
        // Handle division by zero check
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Division (/)       : " + quotient);
        } else {
            System.out.println("Division (/)       : Cannot divide by zero!");
        }

 // Display results
        System.out.println("\n--- Results ---");
        System.out.println("Addition (+)       : " + sum);
        System.out.println("Subtraction (-)    : " + difference);
        System.out.println("Multiplication (*) : " + product);

        scanner.close();
    }
}