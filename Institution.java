
package innerclass;
  import java.util.Scanner;
public class Institution {
    String institutionName;
    public Institution(String institutionName)
    {
        this.institutionName = institutionName;
    }
    class Student {
        String studentName;
        int rollNo;
        int[] marks;
        double average;
        String grade;
        void addStudentDetails(Scanner sc)
        {
            System.out.print("Enter Student Name: ");
            studentName = sc.next();
            System.out.print("Enter Roll No: ");
            rollNo = sc.nextInt();
            System.out.print("Enter Number of Subjects: ");
            int n = sc.nextInt();
            marks = new int[n];
        }
        void addMarks(Scanner sc)
        {
            if (marks == null) 
            {
                System.out.println("Please add student details first!");
                return;
            }
            System.out.println("Enter Marks for " + marks.length + " subjects:");
            for (int i = 0; i < marks.length; i++) {
                marks[i] = sc.nextInt();
            }
            System.out.println("Marks added successfully!");
        }
        void calculateGrade()
        {
            if (marks == null)
            {
                System.out.println("Marks are not entered yet!");
                return;
            }
            int sum = 0;
            for (int m : marks)
            {
                sum += m;
            }
            average = (double) sum / marks.length;

            if (average >= 90)
            {
                grade = "Grade A";
            } 
            else if (average >= 75)
            {
                grade = "Grade B";
            } else if (average >= 50)
            {
                grade = "Grade C";
            } 
            else
            {
                grade = "Fail";
            }
            System.out.println("Grade and average calculated successfully!");
        }
        void displayDetails() 
        {
            if (marks == null)
            {
                System.out.println("No student data available!");
                return;
            }
            System.out.println("\nInstitution Name: " + institutionName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Roll No: " + rollNo);
            System.out.print("Marks: ");
            for (int m : marks) {
                System.out.print(m + " ");
            }
            System.out.println();
            System.out.printf("Average: %.2f\n", average);
            System.out.println("Grade: " + grade);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Institution inst = new Institution("Magizichi Tech Institution");
        Institution.Student student = inst.new Student();

        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Marks");
            System.out.println("3. Calculate Grade");
            System.out.println("4. Display Student Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    student.addStudentDetails(sc);
                    break;
                case 2:
                    student.addMarks(sc);
                    break;
                case 3:
                    student.calculateGrade();
                    break;
                case 4:
                    student.displayDetails();
                    break;
                case 5:
                    System.out.println("Exiting the application. Thank you Good Byeeee Tataaa!!!!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } 
        while (choice != 5);

    }
}
    

