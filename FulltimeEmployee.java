
package abstractionn;


class FulltimeEmployee extends Employee {
    // Fixed: Declared missing instance variable
    double monthlysalary;

    FulltimeEmployee(String name, double monthlysalary) { 
        super(name); 
        this.monthlysalary = monthlysalary; 
    } 

    // Fixed: Replaced semicolon with proper method body curly braces
    @Override 
    double calculateSalary() {
        return monthlysalary; 
    }
}