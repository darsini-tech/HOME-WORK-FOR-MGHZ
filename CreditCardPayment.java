
package Interface;


public class CreditCardPayment implements Payment {
       @Override
   public void pay(double amount)
   {
        System.out.println("Processing Credit Card payment of " + amount);
        System.out.println("Success: Amount charged to Credit Card successfully.");
    }
}

