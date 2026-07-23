import java.util.Scanner;

public class Cmds
{

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        // Object creation 
        Cmds obj = new Cmds();
        obj.runMenu();
    }

   
    public void runMenu()
    {
        System.out.print("Enter array size: ");
        int[] arr = new int[sc.nextInt()];

        while (true)
        {
            System.out.print("\n1.Insert 2.Even 3.Div5 4.Count20 5.Exit\nChoice: ");
            switch (sc.nextInt()) 
            {
                case 1: 
                    System.out.println("Enter elements:");
                    for (int i = 0; i < arr.length; i++)
                    {
                        arr[i] = sc.nextInt();
                    }
                    break;
                case 2: 
                    for (int x : arr) if (x % 2 == 0) System.out.print(x + " ");
                    System.out.println();
                    break;
                case 3: 
                    for (int x : arr) 
						if (x % 5 == 0)
						{
						System.out.print(x + " ");
						}
					
                    System.out.println();
                    break;
                case 4: 
                    int count = 0;
                    for (int x : arr) if (x == 20) count++;
                    System.out.println("Count: " + count);
                    break;
                case 5: 
                    System.out.println("Exit");
                    sc.close();
                    return;
                default: 
                    System.out.println("Invalid choice");
            }
        }
    }
}