
package innerclass;

import java.util.Scanner;
public class ShoppingCart
{
    String cartOwnerName;
    class Item 
    {
        String itemName;
        double price;
        int quantity;
        double[] priceHistory;

        void display(double bill) 
        {
            System.out.println("\nCart Owner: " + cartOwnerName);
            System.out.println("Item Name: " + (itemName != null ? itemName : "None"));
            System.out.println("Quantity: " + quantity);
            System.out.print("Price History: ");
            
            if (priceHistory != null && priceHistory.length > 0)
            {
                for (double p : priceHistory) 
                {
                    System.out.print((int) p + " ");
                }
            }
            else
            {
                System.out.print("No history available");
            }
            
            System.out.println("\nLatest Price: " + (int) price);
            System.out.println("Total Bill: " + (int) bill);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cart Owner Name: ");
        ShoppingCart cart = new ShoppingCart();
        cart.cartOwnerName = sc.next();
        
        ShoppingCart.Item item = cart.new Item();
        double totalBill = 0;
        int choice = 0;

        while (choice != 5)
        {
            System.out.print("\n1.Add Item 2.Update Prices 3.Calculate Bill 4.Display 5.Exit\nEnter choice: ");
            choice = sc.nextInt();

            if (choice == 1) 
            {
                System.out.print("Enter Item Name: ");
                item.itemName = sc.next();
                System.out.print("Enter Quantity: ");
                item.quantity = sc.nextInt();
                System.out.print("Enter Number of Price Updates: ");
                int updates = sc.nextInt();
                item.priceHistory = new double[updates];
                System.out.println("Enter " + updates + " prices now:");
                for (int i = 0; i < updates; i++) {
                    item.priceHistory[i] = sc.nextDouble();
                }
                if (updates > 0) {
                    item.price = item.priceHistory[updates - 1];
                }
            } 
            else if (choice == 2) {
                if (item.priceHistory != null && item.priceHistory.length > 0) {
                    System.out.println("Re-enter Prices:");
                    for (int i = 0; i < item.priceHistory.length; i++) {
                        item.priceHistory[i] = sc.nextDouble();
                    }
                    item.price = item.priceHistory[item.priceHistory.length - 1];
                    System.out.println("Prices Updated currently!");
                } else {
                    System.out.println("Please run Option 1 first to set size!");
                }
            } 
            else if (choice == 3) {
                totalBill = item.price * item.quantity;
                System.out.println("Total Bill Calculated!");
            } 
            else if (choice == 4) {
                item.display(totalBill);
            }
            else if (choice == 5) {
                System.out.println(" Poitu Vangaa Tataaaaa Byeeeeee ...");
            }
            else 
            {
                System.out.println("Invalid choice! Try again.");
            }
        }
    }
}