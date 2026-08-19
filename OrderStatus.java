
package enumandgenerics;
import java.util.Scanner;
public class OrderStatus 
{

    enum Status {
        PLACED, SHIPPED, DELIVERED, CANCELLED
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Show Order Status");
            System.out.println("2. Check if Order is Completed");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Order Status: ");
                Status s = Status.valueOf(sc.next().toUpperCase());

                System.out.println("Order Status: " + s);

            } else if (choice == 2) {

                System.out.print("Enter Order Status: ");
                Status s = Status.valueOf(sc.next().toUpperCase());

                if (s == Status.DELIVERED)
                    System.out.println("Order is Completed");
                else
                    System.out.println("Order is Not Completed");

            } else if (choice == 3) {

                System.out.println("Avoloooo thann mudinchu ...");
                break;

            }
            else 
            {

                System.out.println("Invalid Choice");
            }
        }
    }
}
    

