import java.util.Scanner;

class MenuDriven 
{
    public static void main(String args[]) 
    {
        int a[] = {10, 20, 30, 40, 50};
        int index = 2;
        int value = 25;
        int b[] = new int[a.length + 1];

        // 1. Copy elements before insertion point
        for (int i = 0; i < index; i++) {
            b[i] = a[i];
        }
        
        // 2. Insert the new value
        b[index] = value;

        // 3. Copy elements after insertion point
        for (int i = index + 1; i < b.length; i++) {
            b[i] = a[i - 1];
        }

        // 4. Print the newly formed array
        System.out.println("Modified Array elements are: ");
		for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("\n----------------------------");

        // 5. Menu Driven Search Logic
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you want to search: ");
        int target = sc.nextInt();

        System.out.println("Choose Search Method:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        int resultPos = -1; // Standard variable to store the found index location

        switch (choice) 
        {
            case 1: // Linear Search Logic
                for (int i = 0; i < b.length; i++) {
                    if (b[i] == target) {
                        resultPos = i; // Found, update position
                        break;         // Exit loop immediately
                    }
					 }
                break;

            case 2: // Binary Search Logic
                int low = 0;
                int high = b.length - 1;

                while (low <= high) {
                    int mid = (low + high) / 2;

                    if (b[mid] == target) {
                        resultPos = mid; // Match found
                        break;
                    } else if (b[mid] < target) {
                        low = mid + 1;   // Search the right half
                    } else {
                        high = mid - 1;  // Search the left half
                    }
                }
                break;

            default:
                System.out.println("Invalid choice selected.");
                return;
        }
          if(resultPos != -1) {
            System.out.println("Element " + target + " successfully found at index position: " + resultPos);
        } else {
            System.out.println("Element " + target + " does not exist in the array.");
        }
    }
}
