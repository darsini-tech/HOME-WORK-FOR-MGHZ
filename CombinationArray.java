import java.util.Scanner;

public class CombinationArray {
    public static void main(String[] args)
	{
        Scanner in = new Scanner(System.in);
        
        int[] numbers = new int[3];// initializing the array
        
        System.out.println("Enter 3 numbers:");
        numbers[0] = in.nextInt();// getting user input
        numbers[1] = in.nextInt();
        numbers[2] = in.nextInt();

        CombinationArray obj = new CombinationArray();

        obj.Sum(numbers);// calling of objects
        obj.Max(numbers);
        obj.Min(numbers);
    }

    void Sum(int[] arr)
	{
        int total = arr[0] + arr[1] + arr[2];
        System.out.println("Sum = " + total);
    }

    void Max(int[] arr)
	{
        int max = arr[0];
        if (arr[1] > max) max = arr[1];
		if (arr[2] > max) max = arr[2];
        System.out.println("Max = " + max);
    }

    void Min(int[] arr)
	{
        int min = arr[0];
        if (arr[1] < min) min = arr[1];
        if (arr[2] < min) min = arr[2];
        System.out.println("Min = " + min);
    }
}
