
package abstractionn;


public class Main { 
    public static void main(String[] args) { 
        // Fixed: Enclosed literal text inside double quotes ""
        FulltimeEmployee obj = new FulltimeEmployee("Darsini", 5000.0); 
        PartimeEmployee obi = new PartimeEmployee("Sai Sharvesh", 12, 30.0); 

        System.out.println(" *********** Employee Salary Details *******"); 
        obj.displayEmployee(); 
        System.out.println("--------------------------------------------");
        obi.displayEmployee(); 
    } 
}
