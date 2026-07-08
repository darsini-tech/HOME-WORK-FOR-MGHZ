import java.util.Scanner;

public class Voting
 {
    public static void main(String[] args)
	{
        
        System.out.print("enter age :");
        int age = new Scanner(System.in).nextInt();
        
        if (age >= 18)
			{
            System.out.println("eligible to vote");
        } 
		else
			{
            System.out.println("not eligible to vote");
        }
        
    }
}
