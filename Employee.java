
package abstractionn;

abstract class Employee { 
    String name; 

    // Constructor
    Employee(String name) { 
        this.name = name; 
    } 

    abstract double calculateSalary(); 

    void displayEmployee() { 
        System.out.println("Employee Name: " + name); 
        System.out.println("Calculated Salary: " + calculateSalary()); 
    } 
}