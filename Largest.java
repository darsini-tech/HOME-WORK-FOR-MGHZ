import java.util.Scanner;

public class Largest 
{
    public static void main(String[] args)
	{
        
        System.out.print("enter first number :");
        int firstNumber = new Scanner(System.in).nextInt();
        
        System.out.print("enter second number:");
        int secondNumber = new Scanner(System.in).nextInt();
        
        if (firstNumber > secondNumber)
			{
            System.out.println(firstNumber + " is the largest number");
        } 
		else
			{
            System.out.println(secondNumber + " is the largest number");
        }
        
    }
}