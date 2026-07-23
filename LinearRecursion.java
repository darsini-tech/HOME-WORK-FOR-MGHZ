import java.util.Scanner;

public class LinearRecursion
 {
  
    int linearSearch(int arr[], int index, int key)
	{
   
        if (index == arr.length)
			{
          
            return -1; 
           }
        
     
        if (arr[index] == key)
			{
            return index;
        }
        
    
        return linearSearch(arr, index + 1, key);
    }

    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
     
        int[] arr = new int[5]; 
        
       
        for (int i = 0; i < 4; i++)
			{
            arr[i] = sc.nextInt();
        }
        
        // Reading the key to search
        int key = sc.nextInt();
        
       
        LinearRecursion obj = new LinearRecursion();
        int result = obj.linearSearch(arr, 0, key);
        
       
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