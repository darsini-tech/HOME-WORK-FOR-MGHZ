import java.util.Scanner;

public class LargestNumber
 {
    public static void main(String[] args) 
	{
        Scanner in = new Scanner(System.in);

        System.out.print("Enter total number of elements: ");
        int total = in.nextInt();// getting user input
        System.out.println("Enter the numbers:");
        int largest = in.nextInt();
        for (int i = 1; i < total; i++)//logic part
			{
            int currentNumber = in.nextInt();
            if (currentNumber > largest)
				{
                largest = currentNumber;// to check which number is the largest
            }
        }

        //  Display the result
        System.out.println("Output Largest = " + largest);
    }
}