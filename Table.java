import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.print("Enter the number for the multiplication table: ");
        
        // Use System.in directly inside Scanner without assigning it to an object variable
        int num = new Scanner(System.in).nextInt();
        
        int i = 1;
        
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++; 
        } while (i <= 10);
    }
}