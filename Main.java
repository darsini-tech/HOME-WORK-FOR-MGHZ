import java.util.Scanner;

public class Main
 {
    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);

        System.out.println("===== Bank Loan Eligibility System =====");

        System.out.print("Enter Name: ");
        String name = in.nextLine();

        System.out.print("Enter Age: ");
        int age = in.nextInt();

        System.out.print("Enter Monthly Salary: ");
        int salary = in.nextInt();

        System.out.print("Enter CIBIL Score: ");
        int cibil = in.nextInt();

        System.out.print("Are you an Existing Customer? (true/false): ");
        boolean customer = in.nextBoolean();

        System.out.println("Checking Loan Eligibility...");

        if (age >= 21)
			{
            if (salary >= 20000)
				{
                if (cibil >= 750) 
				{
                    if (customer)
						{
                        System.out.println(name + " Eligible for Premium Loan ");
                    } 
					else
						{
                        System.out.println(name + " Eligible for Standard Loan");
                    }
					
                }
				else if (cibil >= 650)
					{
                    System.out.println(name + " Eligible for Low Amount Loan");
                } 
				else 
				{
                    System.out.println(name + " Not Eligible (Low CIBIL Score)");
                }
            }
			else 
			{
                System.out.println(name + " Not Eligible (Low Salary)");
            }
        }
		else 
		{
            System.out.println(name + " Not Eligible (Age criteria not satisfied)");
        }
    }
}
