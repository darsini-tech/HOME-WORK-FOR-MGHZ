
package abstractionn;

class PartimeEmployee extends Employee { 
    int hoursWorked; 
    double hourlyRate; 

    PartimeEmployee(String name, int hoursWorked, double hourlyRate) { 
        super(name); 
        // Fixed: Added correct assignments using the '=' operator
        this.hoursWorked = hoursWorked; 
        this.hourlyRate = hourlyRate; 
    } 

    @Override 
    double calculateSalary() { 
        return hoursWorked * hourlyRate; 
    } 
}