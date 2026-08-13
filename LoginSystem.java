

package exceptionss;

import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUser = "darsini";
        String correctPass = "2026";
        int maxAttempts = 3;
        int attemptsLeft = maxAttempts;

        System.out.println("=== Smart Login System ===");

        while (true) {
            System.out.println("\n1. Login");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    try {
                        while (attemptsLeft > 0) {
                            System.out.print("Enter username: ");
                            String user = scanner.nextLine();
                            
                            System.out.print("Enter password: ");
                            String pass = scanner.nextLine();

                            if (user.equals(correctUser) && pass.equals(correctPass)) {
                                System.out.println("Login successful! Welcome.");
                                attemptsLeft = maxAttempts;
                                break;
                            } else {
                                attemptsLeft--;
                                if (attemptsLeft > 0) {
                                    System.out.println("Incorrect credentials. Remaining attempts: " + attemptsLeft);
                                } else {
                                    int trigger = 5 / 0;
                                }
                            }
                        }
                    } catch (java.lang.ArithmeticException e) {
                        System.out.println("Exception: Maximum attempts exceeded! Account is locked.");
                        System.out.println("Exiting login due to security lock.");
                        scanner.close();
                        return;
                    }
                    break;

                case 2:
                    System.out.println("Exiting system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
}
