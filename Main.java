
package Interface;


public class Main {
    public static void main(String[] args) {
        double amount = 2500.50; 

        System.out.println("Initiating transaction for amount: ₹" + amount + "\n");

        Payment creditCard = new CreditCardPayment();
        Payment upi = new UpiPayment();

        creditCard.pay(amount);
        upi.pay(amount);
    }
}