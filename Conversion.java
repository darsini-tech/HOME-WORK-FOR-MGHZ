import java.util.Scanner;

 class Coversionn{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        
        // integer input
        int intValue = scanner.nextInt();
        
        // Implicit casting happens automatically
        double doubleValue = intValue;
        
        
        System.out.println(doubleValue);
    }
}