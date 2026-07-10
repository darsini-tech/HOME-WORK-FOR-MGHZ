public class AlphabetPattern
 {
    public static void main(String[] args)
	{
        int rows = 5;

        // Outer loop for rows
        for (int i = 1; i <= rows; i++)
		{
            
            // Start each row with the character 'A'
            char letter = 'A';
            
            // Inner loop prints letters and increments to the next alphabet character
            for (int j = 1; j <= i; j++)
			{
                System.out.print(letter);
                letter++; // Moves to 'B', 'C', 'D', etc.
            }
            
            // Move to the next line
            System.out.println();
        }
    }
}