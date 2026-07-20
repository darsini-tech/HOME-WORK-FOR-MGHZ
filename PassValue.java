import java.util.Scanner;

class PassValue
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2]; 

        System.out.print("Enter two numbers: ");
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        System.out.println("Before method: " + arr[0] + ", " + arr[1]);

        PassValue obj = new PassValue();
        obj.modifyArray(arr); // Passing array to method

        System.out.println("After method:  " + arr[0] + ", " + arr[1]);
    }

    public void modifyArray(int[] b) {
        b[0] = 99; // Modifying  the first element
        System.out.println("Inside method: " + b[0] + ", " + b[1]);
    }
}
