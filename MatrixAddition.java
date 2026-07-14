import java.util.Scanner;

public class MatrixAddition
 {
    public static void main(String[] args)
	{
        Scanner in = new Scanner(System.in);
        
        int[][] m1 = new int[2][2];// initializing the array
        int[][] m2 = new int[2][2];// initializing the array

        System.out.println("Enter 4 numbers for Matrix 1:");
        for(int i = 0; i < 2; i++) // outer loop for rows
		{
            for(int j = 0; j < 2; j++)// inner loop for coloumns
				{
                m1[i][j] = in.nextInt();// getting user input for first  array
            }
        }

        System.out.println("Enter 4 numbers for Matrix 2:");
        for(int i = 0; i < 2; i++)// outer loop for rows
			{
            for(int j = 0; j < 2; j++)// inner loop for coloumns
				{
                m2[i][j] = in.nextInt();// getting user input for second  array
            }
        }

        System.out.println("Output Matrix:");//display method
        for(int i = 0; i < 2; i++)// outer loop for rows
			{
            for(int j = 0; j < 2; j++)// inner loop for coloumns
			{
                System.out.print((m1[i][j] + m2[i][j]) + " ");// printing the added matrix
				 }
            System.out.println();
        }
    }
}