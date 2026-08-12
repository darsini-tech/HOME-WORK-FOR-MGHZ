package staticcandfinal;

import java.util.*;

public class StaticandFinal {
    static final String BANK_NAME = "ABC Bank";
    static final float INTEREST_RATE = 7.5f;

    public static double calculateInterest(double principal, int years){
        return (principal * INTEREST_RATE * years) / 100;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double principal = in.nextDouble();
        System.out.print("Enter Number of Years: ");
        int years = in.nextInt();
        double interestAmount = StaticandFinal.calculateInterest(principal, years);

        System.out.println("\n--- Bank Details ---");
        System.out.println("Bank Name      : " + StaticandFinal.BANK_NAME);
        System.out.println("Principal Amount: " + principal);
        System.out.println("Years          : " + years);
        System.out.println("Interest Amount : " + interestAmount);
    }
}

