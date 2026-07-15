import java.util.Scanner;

 class Fibonacci
 {

    // Simple method to print the fibonacci series
     void fibonacci(int m)
	 {
        int a = 0;
        int b = 1;

        System.out.print("Fibonacci series: ");
        
        for (int i = 1; i <= m; i++)
			{
            System.out.print(a + " ");
            
            int next = a + b;//logic part
            a = b;
            b = next;
        }
    }

    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of terms: ");
        int values = sc.nextInt();
        Fibonacci obj = new Fibonacci();//object creation
        
        // Calling the method using the object
        obj. fibonacci(values);
    }
}
