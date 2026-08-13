
package exceptionss;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMarksSystem 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> marksList = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n--- Student Marks System ---");
            System.out.println("1. Enter student marks");
            System.out.println("2. Display marks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student marks (0 - 100): ");
                    int marks = scanner.nextInt();
                    
                    try {
                        // Input validation block
                        if (marks < 0 || marks > 100) {
                            throw new IllegalArgumentException("Error: Marks must be between 0 and 100!");
                        }
                        marksList.add(marks);
                        System.out.println("Marks added successfully!");
                        
                    } catch (IllegalArgumentException e) 
                    {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 2:
                    if (marksList.isEmpty()) {
                        System.out.println("No marks stored yet.");
                    } else {
                        System.out.println("Stored Student Marks:");
                        for (int m : marksList) {
                            System.out.println("- " + m);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1, 2, or 3.");
            }
        } while (choice != 3);

    }
}
