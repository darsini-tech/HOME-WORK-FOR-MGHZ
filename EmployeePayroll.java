package fileee;
import java.util.ArrayList;
import java.util.Scanner;
class Employee
{
    int id;
    String name;
    String department;
    double basicSalary;

    Employee(int id, String name, String department, double basicSalary)
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    double calculateNetSalary()
    {
        double hra = basicSalary * 20 / 100;
        double da = basicSalary * 10 / 100;
        double pf = basicSalary * 5 / 100;

        double netSalary = basicSalary + hra + da - pf;

        return netSalary;
    }
}
public class EmployeePayroll
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> employees = new ArrayList<>();

        int choice;

        do
        {
            System.out.println("\n========================================");
            System.out.println("     EMPLOYEE PAYROLL MANAGEMENT");
            System.out.println("========================================");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Update Basic Salary");
            System.out.println("5. Calculate Net Salary");
            System.out.println("6. Delete Employee");
            System.out.println("7. Exit");
            System.out.println("========================================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:

                    System.out.println("\n--- Add Employee ---");

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();

                    boolean exists = false;

                    for(Employee e : employees)
                    {
                        if(e.id == id)
                        {
                            exists = true;
                            break;
                        }
                    }

                    if(exists)
                    {
                        System.out.println("Employee ID already exists.");
                    }
                    else
                    {
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Department: ");
                        String department = sc.nextLine();

                        System.out.print("Enter Basic Salary: ");
                        double salary = sc.nextDouble();

                        Employee emp = new Employee(id, name, department, salary);

                        employees.add(emp);

                        System.out.println("Employee added successfully.");
                    }
                    break;
                case 2:
                    System.out.println("\n--- All Employee Details ---");

                    if(employees.size() == 0)
                    {
                        System.out.println("No employees found.");
                    }
                    else
                    {
                        for(Employee e : employees)
                        {
                            System.out.println("------------------------------");
                            System.out.println("Employee ID : " + e.id);
                            System.out.println("Name        : " + e.name);
                            System.out.println("Department  : " + e.department);
                            System.out.println("Basic Salary: " + e.basicSalary);
                            System.out.println("Net Salary  : " + e.calculateNetSalary());
                        }

                        System.out.println("------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("\n--- Search Employee ---");
                    System.out.print("Enter Employee ID: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for(Employee e : employees)
                    {
                        if(e.id == searchId)
                        {
                            System.out.println("\nEmployee Found!");
                            System.out.println("------------------------------");
                            System.out.println("Employee ID : " + e.id);
                            System.out.println("Name        : " + e.name);
                            System.out.println("Department  : " + e.department);
                            System.out.println("Basic Salary: " + e.basicSalary);
                            System.out.println("------------------------------");

                            found = true;
                            break;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Employee not found.");
                    }

                    break;
                case 4:

                    System.out.println("\n--- Update Basic Salary ---");

                    System.out.print("Enter Employee ID: ");
                    int updateId = sc.nextInt();

                    boolean updated = false;

                    for(Employee e : employees)
                    {
                        if(e.id == updateId)
                        {
                            System.out.print("Enter New Basic Salary: ");
                            e.basicSalary = sc.nextDouble();

                            System.out.println("Salary updated successfully.");

                            updated = true;
                            break;
                        }
                    }
                    if(!updated)
                    {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 5:
                    System.out.println("\n--- Calculate Net Salary ---");

                    System.out.print("Enter Employee ID: ");
                    int salaryId = sc.nextInt();

                    boolean salaryFound = false;

                    for(Employee e : employees)
                    {
                        if(e.id == salaryId)
                        {
                            double hra = e.basicSalary * 20 / 100;
                            double da = e.basicSalary * 10 / 100;
                            double pf = e.basicSalary * 5 / 100;

                            double netSalary = e.calculateNetSalary();
                            System.out.println("\nSalary Details");
                            System.out.println("------------------------------");
                            System.out.println("Employee Name : " + e.name);
                            System.out.println("Basic Salary  : " + e.basicSalary);
                            System.out.println("HRA (20%)     : " + hra);
                            System.out.println("DA  (10%)     : " + da);
                            System.out.println("PF  (5%)      : " + pf);
                            System.out.println("------------------------------");
                            System.out.println("Net Salary    : " + netSalary);
                            System.out.println("------------------------------");

                            salaryFound = true;
                            break;
                        }
                    }
                    if(!salaryFound)
                    {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 6:
                    System.out.println("\n--- Delete Employee ---");

                    System.out.print("Enter Employee ID: ");
                    int deleteId = sc.nextInt();

                    boolean deleted = false;

                    for(int i = 0; i < employees.size(); i++)
                    {
                        if(employees.get(i).id == deleteId)
                        {
                            employees.remove(i);

                            System.out.println("Employee deleted successfully.");

                            deleted = true;
                            break;
                        }
                    }
                    if(!deleted)
                    {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 7:
                    System.out.println("\nThank you for using Employee Payroll Management System ");
                    System.out.println("Nandriiii Meendum Varugaaaaa!!!!!!");

                    break;
                default:

                    System.out.println("Invalid choice. Please enter 1 to 7.");
            }
        } while(choice != 7);
    }
}