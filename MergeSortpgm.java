import java.util.Scanner;

public class MergeSortpgm
 {

    public void mergeSort(int[] arr, int left, int right)
	{
   
        if (left >= right) 
		{
            return;
        }
        int mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }

    public void merge(int[] arr, int left, int mid, int right)
	{ 
        int[] temp = new int[arr.length];

        int leftIndex = left;      
        int rightIndex = mid + 1;  
        int tempIndex = left;      
        while (leftIndex <= mid && rightIndex <= right)
			{
            if (arr[leftIndex] <= arr[rightIndex]) 
			{
                temp[tempIndex] = arr[leftIndex];
                leftIndex = leftIndex + 1;
            } 
			else
				{
                temp[tempIndex] = arr[rightIndex];
                rightIndex = rightIndex + 1;
            }
            tempIndex = tempIndex + 1;
        }
        for (int i = leftIndex; i <= mid; i++) 
		{
            temp[tempIndex] = arr[i];
            tempIndex = tempIndex + 1;
        }
        for (int j = rightIndex; j <= right; j++) 
		{
            temp[tempIndex] = arr[j];
            tempIndex = tempIndex + 1;
        }
        for (int i = left; i <= right; i++)
			{
            arr[i] = temp[i];
        }
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

        MergeSortpgm obj = new MergeSortpgm();
        obj.mergeSort(arr, 0, size - 1);

        System.out.println("Sorted Array:");
        for (int i = 0; i < size; i++) 
		{
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int midElementIndex = size / 2;
        System.out.println("Middle Element: " + arr[midElementIndex]);

    }
}
