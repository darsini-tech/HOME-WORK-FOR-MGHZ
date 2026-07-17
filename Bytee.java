import java.util.Scanner;

public class Bytee
 {
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        
        //  integer input (e.g., 130)
        int intValue = scanner.nextInt();
        byte byteValue = (byte) intValue;
        
        // Print the result (e.g., -126)
        System.out.println(byteValue);
    }
}