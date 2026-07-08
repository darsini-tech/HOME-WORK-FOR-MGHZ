import java.util.Scanner;

public class Calculator
 {
    public static void main(String[] args)
	{
        
        System.out.print("enter first number:");
        int firstNumber = new Scanner(System.in).nextInt();
        
        System.out.print("enter second number:");
        int secondNumber = new Scanner(System.in).nextInt();
        
        System.out.print("enter operator (+, -, *, /):");
        char operator = new Scanner(System.in).next().charAt(0);
        
        if (operator == '+')
		{
            System.out.println("result=" + (firstNumber + secondNumber));
        } else if (operator == '-')
		{
            System.out.println("result=" + (firstNumber - secondNumber));
        } else if (operator == '*')
		{
            System.out.println("result=" + (firstNumber * secondNumber));
        } else if (operator == '/')
		{
            if (secondNumber != 0)
			{
                System.out.println("result=" + (firstNumber / secondNumber));
            } else
			{
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else
		{
            System.out.println("Invalid operator entered.");
        }
      }
	  }