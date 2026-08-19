
package enumandgenerics;

    import java.util.Scanner;

public class GenericCalculator
{

    static class Calculator<T extends Number> 
    {

        double add(T a, T b)
        {
            return a.doubleValue() + b.doubleValue();
        }

        double subtract(T a, T b)
        {
            return a.doubleValue() - b.doubleValue();
        }
    }

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        while (true)
        {

            System.out.println("\n1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) 
            {

                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                Calculator<Double> c = new Calculator<>();

                System.out.println("Result: " + c.add(a, b));

            }
            else if (choice == 2)
            {

                System.out.print("Enter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                Calculator<Double> c = new Calculator<>();

                System.out.println("Result: " + c.subtract(a, b));

            } 
            else if (choice == 3) 
            {

                System.out.println("Tataaaa Byeeeeeeeeee...");
                break;

            } 
            else 
            {

                System.out.println("Invalid Choice");
            }
        }
    }
}