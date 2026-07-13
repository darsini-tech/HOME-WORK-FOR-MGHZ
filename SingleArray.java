 import java.util.*;

public class SingleArray {
    public static void main(String[] args)
	{
        Scanner in = new Scanner(System.in);//input method

        System.out.print("Enter array size: ");
        int n = in.nextInt();// geting user input
        int[] arr = new int[n];// initializing the array

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int choice;
// menu driven program
        do {
            System.out.println( " Options:1= Display, 2=Sum , 3=Largest, 4=Smallest ,5= Exit");
            System.out.print("Enter choice: ");
            choice = in.nextInt();

            switch (choice)
			{
				// displaying the array
                case 1:
                    System.out.print("Array: ");
                    for (int i = 0; i < n; i++)
						{
                        System.out.print(arr[i] + " ");
                    }
					System.out.println();
                    break;
             // sum of the array 
                case 2:
                    int sum = 0;
                    for (int i = 0; i < n; i++)
						{
                        sum = sum + arr[i];
                    }
                    System.out.println("Sum = " + sum);
                    break;
                // maximum value
                case 3:
                    int max = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] > max) {
                            max = arr[i];
                        }
                    }
                    System.out.println("Largest = " + max);
                    break;
              // minimum value
                case 4:
                    int min = arr[0];
                    for (int i = 1; i < n; i++) {
                        if (arr[i] < min) {
                            min = arr[i];
                        }
						 }
                    System.out.println("Smallest = " + min);
                    break;
               // exit the array
                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid input!");
            }
        } while (choice != 5);
    }
}