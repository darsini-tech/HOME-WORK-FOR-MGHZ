
package enumandgenerics;
import java.util.Scanner;
public class StorageBox 
{
  static class Box<T> 
  {

        T value;

        void store(T value)
        {
            this.value = value;
        }

        void display() 
        {
            System.out.println("Stored Value: " + value);
        }
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        Box<Integer> intBox = new Box<>();
        Box<String> stringBox = new Box<>();

        while (true) 
        {

            System.out.println("\n1. Store Integer");
            System.out.println("2. Store String");
            System.out.println("3. Display Value");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1)
            {

                System.out.print("Enter Integer: ");
                int n = sc.nextInt();

                intBox.store(n);
                System.out.println("Integer Stored");

            } 
            else if (choice == 2)
            {

                System.out.print("Enter String: ");
                String s = sc.next();

                stringBox.store(s);
                System.out.println("String Stored");

            }
            else if (choice == 3) 
            {

                System.out.println("\nInteger Which Is Stored :");
                intBox.display();

                System.out.println("String Which Is Stored :");
                stringBox.display();

            } 
            else if (choice == 4)
            {

                System.out.println("Poitu  Vangaa  Tataaaa Byeeeee...");
                break;
            } 
            else 
            {

                System.out.println("Invalid Choice");
            }
        }
    }
}