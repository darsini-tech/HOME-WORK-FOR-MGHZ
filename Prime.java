import java.util.Scanner;
public class Prime
 {
    void check(int n) 
	{
        int c = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) c++;
        System.out.println(n + (c == 2 ? " is Prime" : " is Not Prime"));
    }
    public static void main(String[] args)// main method
	{
        Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		 int n;
		n =in.nextInt();//getting user input
        Prime obj = new Prime(); // object creation
        obj.check(n);            // calling the method
    }
}