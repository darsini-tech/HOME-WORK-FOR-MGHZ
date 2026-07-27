import java.util.Scanner;

public class BubbleSortpgm
 {

    public void sortArray(int[] arr)
	{
        int n = arr.length;
        int pass = 0;

        for (int i = 0; i < n - 1; i++)
			{
               pass = pass + 1; 

            for (int j = 0; j < n - 1; j++)
				{
                
                if (arr[j] > arr[j + 1])
					{
                    // swapping method
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) 
		{
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Number of Pass: " + pass);
    }

    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) 
		{
            arr[i] = scanner.nextInt();
        }
        BubbleSortpgm obj = new BubbleSortpgm();
        obj.sortArray(arr);
    }
}