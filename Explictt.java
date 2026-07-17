import java.util.Scanner;

public class Explictt
{
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        
        //  double input (e.g., 45.89)
        double doubleValue = scanner.nextDouble();
        
        
        int intValue = (int) doubleValue;
        
        // Printing the result (e.g., 45)
        System.out.println(intValue);
    }
}