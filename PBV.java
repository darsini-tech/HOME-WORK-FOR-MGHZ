import java.util.Scanner;

class PBV
 {
    public static void main(String[] args)
	{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int a = in.nextInt(); 

        PBV obj = new PBV();
        obj.passValue(a); // Passing it to method

        System.out.println("Outside method: " + a); // Printing outside method
    }

    public void passValue(int b) 
	{
        b = 20; // changing the value
        System.out.println("Inside method: " + b); // Printing  inside method
    }
}