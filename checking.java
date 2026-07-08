import java.util.*;
public class checking
{
 
    public static void main(String[] args) 
	{
        
        // Prompt the user for input
        System.out.print("enter number=");
        
        // Using a Scanner method directly without creating an object reference
        int number = new Scanner(System.in).nextInt();
        
        // Conditional statement to check if the number is even or odd
        if (number % 2 == 0)
		{
            System.out.println(number + " is an even number");
        } 
		else
		{
            System.out.println(number + " is an odd number");
        }
        
    }
}

