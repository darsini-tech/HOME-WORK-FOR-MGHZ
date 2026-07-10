public class NumberPattern
 {
    public static void main(String[] args)
	{
        int rows = 5;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++)
			{
            
            // Inner loop
            for (int j = 1; j <= i; j++)
				{
                System.out.print(j);
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}