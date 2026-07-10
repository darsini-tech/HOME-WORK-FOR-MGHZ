
public class Star
 {
    public static void main(String[] args)
	{
        // initializing the value
        int rows = 5; 
        
        // Outer loop for the 5 rows
        for (int i = 1; i <= rows; i++)
			{
            
            // Inner loop prints exactly 
            for (int j = 1; j <= i; j++) 
			{
                System.out.print("*");
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}
