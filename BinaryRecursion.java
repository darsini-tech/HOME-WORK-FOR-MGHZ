import java.util.Scanner;

public class BinaryRecursion {
    int binarySearch(int arr[], int left, int right, int key)
	{
        if (left > right)
			{
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == key)
			{
            return mid;
        }

        if (arr[mid] > key)
			{
            return binarySearch(arr, left, mid - 1, key);
        }

        return binarySearch(arr, mid + 1, right, key);
    }

    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        for (int i = 0; i < 6; i++) 
		{
            arr[i] = sc.nextInt();
        }

      
        int key = sc.nextInt();
        BinaryRecursion obj = new BinaryRecursion();
        
        int result = obj.binarySearch(arr, 0, arr.length - 1, key);

      
        if (result != -1)
			{
            System.out.println("Element found at index: " + result);
        } 
		else 
		{
            System.out.println("-1");
        }

     
    }
}