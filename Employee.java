
package collection.framework;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    private String employeeID;
    private String employeeName;
    private String department;
    private double basicSalary;

    public Employee(String employeeID, String employeeName, String department, double basicSalary) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getEmployeeName() 
    {
        return employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double calculateNetSalary() {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        double pf = 0.05 * basicSalary;
        return basicSalary + hra + da - pf;
    }

    public void displayEmployee() {
        System.out.println("ID: " + employeeID + " | Name: " + employeeName + " | Dept: " + department + " | Basic Salary: " + basicSalary);
    }
}

class EmployeePayrollSystem {
    private static ArrayList<Employee> payrollList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n========== EMPLOYEE PAYROLL MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Basic Salary");
            System.out.println("5. Calculate Net Salary");
            System.out.println("6. Delete Employee");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    addEmployee();
                    break;
                case "2":
                    viewAllBooks();
                    break;
                case "3":
                    searchEmployeeByID();
                    break;
                case "4":
                    updateBasicSalary();
                    break;
                case "5":
                    calculateEmployeeNetSalary();
                    break;
                case "6":
                    deleteEmployee();
                    break;
                case "7":
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
            }
        }
    }

    private static void addEmployee() {
        System.out.print("Enter Employee ID: ");
        String id = scanner.nextLine().trim();

        if (findEmployee(id) != null) {
            System.out.println("Error: An employee with ID '" + id + "' already exists! Cannot add duplicate IDs.");
            return;
        }

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter Department: ");
        String dept = scanner.nextLine().trim();
        System.out.print("Enter Basic Salary: ");
        
        double salary;
        try {
            salary = Double.parseDouble(scanner.nextLine().trim());
            if (salary < 0) {
                System.out.println("Error: Salary cannot be negative.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric formatting for salary input.");
            return;
        }

        if (id.isEmpty() || name.isEmpty() || dept.isEmpty()) {
            System.out.println("Error: Fields cannot be blank.");
            return;
        }

        payrollList.add(new Employee(id, name, dept, salary));
        System.out.println("Success: Employee details added successfully!");
    }

    private static void viewAllBooks() {
        if (payrollList.isEmpty()) {
            System.out.println("The payroll database is currently empty.");
            return;
        }
        System.out.println("\n--- All Employee List ---");
        for (Employee emp : payrollList) {
            emp.displayEmployee();
        }
    }

    private static void searchEmployeeByID() {
        System.out.print("Enter Employee ID to search: ");
        String id = scanner.nextLine().trim();

        Employee emp = findEmployee(id);
        if (emp != null) {
            System.out.println("Employee Found:");
            emp.displayEmployee();
        } else {
            System.out.println("Error: Employee with ID '" + id + "' not found.");
        }
    }

    private static void updateBasicSalary() {
        System.out.print("Enter Employee ID to update salary: ");
        String id = scanner.nextLine().trim();

        Employee emp = findEmployee(id);
        if (emp == null) {
            System.out.println("Error: Employee with ID '" + id + "' not found.");
            return;
        }

        System.out.print("Enter New Basic Salary: ");
        try {
            double newSalary = Double.parseDouble(scanner.nextLine().trim());
            if (newSalary < 0) {
                System.out.println("Error: Salary cannot be negative.");
                return;
            }
            emp.setBasicSalary(newSalary);
            System.out.println("Success: Basic salary updated successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric formatting for salary input.");
        }
    }

    private static void calculateEmployeeNetSalary() {
        System.out.print("Enter Employee ID to calculate net salary: ");
        String id = scanner.nextLine().trim();

        Employee emp = findEmployee(id);
        if (emp != null) {
            System.out.println("Salary Breakdown for " + emp.getEmployeeName() + " (ID: " + emp.getEmployeeID() + "):");
            System.out.println("Basic Salary: " + emp.getBasicSalary());
            System.out.println("Net Salary Calculated: " + emp.calculateNetSalary());
        } else {
            System.out.println("Error: Employee with ID '" + id + "' not found.");
        }
    }

    private static void deleteEmployee() {
        System.out.print("Enter Employee ID to delete: ");
        String id = scanner.nextLine().trim();

        Employee emp = findEmployee(id);
        if (emp != null) {
            payrollList.remove(emp);
            System.out.println("Success: Employee with ID '" + id + "' has been deleted from the collection.");
        } else {
            System.out.println("Error: Employee with ID '" + id + "' not found.");
        }
    }

    private static Employee findEmployee(String id) {
        for (Employee emp : payrollList) {
            if (emp.getEmployeeID().equalsIgnoreCase(id))
            {
                return emp;
            }
        }
        return null;
    }
}
