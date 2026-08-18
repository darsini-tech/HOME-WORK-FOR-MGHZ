
package collection.framework;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private int rollNumber;
    private String name;
    private int age;
    private String course;
    private double marks;
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public Student(int rollNumber, String name, int age, String course, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Roll No: " + rollNumber + 
               " | Name: " + name + 
               " | Age: " + age + 
               " | Course: " + course + 
               " | Marks: " + marks;
    }
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n=== STUDENT MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Update Student Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number between 1 and 6: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudentMarks();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option! Please pick a choice from 1 to 6.");
            }
        } while (choice != 6);
    }

    private static void addStudent() {
        System.out.print("Enter Roll Number: ");
        int rollNumber = readIntInput();
        if (findStudentByRoll(rollNumber) != null) {
            System.out.println("Error: A student with Roll Number " + rollNumber + " already exists!");
            return;
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = readIntInput();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Marks: ");
        double marks = readDoubleInput();
        studentList.add(new Student(rollNumber, name, age, course, marks));
        System.out.println("Student record added successfully!");
    }
    private static void viewAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No student records available to display.");
            return;
        }

        System.out.println("\n--- Registered Students List ---");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i)); 
        }
    }
    private static void searchStudent() {
        System.out.print("Enter Roll Number to search: ");
        int rollNumber = readIntInput();
        
        Student student = findStudentByRoll(rollNumber);
        
        if (student != null) {
            System.out.println("\nStudent Found:\n" + student);
        } else 
        {
            System.out.println("Error: Student with Roll Number " + rollNumber + " not found.");
        }
    }
    private static void updateStudentMarks() {
        System.out.print("Enter Roll Number to update marks: ");
        int rollNumber = readIntInput();

        Student student = findStudentByRoll(rollNumber);

        if (student != null) {
            System.out.print("Enter New Marks: ");
            double newMarks = readDoubleInput();
            student.setMarks(newMarks);
            System.out.println("Marks updated successfully for roll number " + rollNumber + ".");
        } else {
            System.out.println("Error: Student with Roll Number " + rollNumber + " not found.");
        }
    }
    private static void deleteStudent() {
        System.out.print("Enter Roll Number to delete: ");
        int rollNumber = readIntInput();

        Student student = findStudentByRoll(rollNumber);

        if (student != null) 
        {
            studentList.remove(student);
            System.out.println("Student record deleted successfully!");
        } else {
            System.out.println("Error: Student with Roll Number " + rollNumber + " not found.");
        }
    }
    private static Student findStudentByRoll(int rollNumber) {
        for (Student s : studentList) {
            if (s.getRollNumber() == rollNumber) {
                return s;
            }
        }
        return null;
    }
    private static int readIntInput() {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid data type. Please enter a valid integer: ");
            scanner.next();
        }
        int val = scanner.nextInt();
        scanner.nextLine(); 
        return val;
    }
    private static double readDoubleInput()
    {
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid data type. Please enter a numeric value for marks: ");
            scanner.next();
        }
        double val = scanner.nextDouble();
        scanner.nextLine(); 
        return val;
    }
}