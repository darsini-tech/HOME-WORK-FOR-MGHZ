
package exceptionss;

import java.util.Scanner;
class AtmBalanceException extends Exception 
{
    public AtmBalanceException(String message) 
    {
        super(message);
    }
}
public class ATMSystem 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        double balance = 3000.00; 
        boolean isgoing = true;

        System.out.println(" Welcome to the Bank ATM ");

        while (isgoing)
        {
            System.out.println("\nPlease choose an operation:");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Check Account Balance");
            System.out.println("3. Exit");
            System.out.print("Enter choice (1-3): ");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter amount to withdraw: $");
                    double amount = scanner.nextDouble();
                    
                    try
                    {
                        if (amount > balance) 
                        {
                            throw new AtmBalanceException("Error: You do not have enough money in your balance.");
                        }
                        
                        balance =balance- amount;
                        System.out.println("Transaction Successful! Please collect your cash.");
                        System.out.println("Remaining Balance: $" + balance);
                        
                    }
                    catch (AtmBalanceException a)
                    {
                        System.out.println(a.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Your current balance is: $" + balance);
                    break;

                case 3:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    isgoing = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }
        
    }
}
