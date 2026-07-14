
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[5];// creating a single dimensional array
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++)
			{
            numbers[i] = in.nextInt();// getting the user input
        }
        System.out.println("You entered:");
        for (int i = 0; i < numbers.length; i++)
			{
            System.out.println(numbers[i]);// printing the array
        }
        
        
    }
}
