import java.util.*;
class DsaCombination
{
	void input(int a[])
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}
		
	}
	void display(int a[])
	{ 
	       for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
	     }
	}
		void Max(int[] brr)
	{
        int max = brr[0]; 
        for (int i = 1; i < brr.length; i++) 
		{
            if (brr[i] > max)
				{
                max = brr[i];
            }
        }
        System.out.println("Max = " + max);
    }
	void reverse(int a[])
	{
		
		for( int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
	// sum of the array
	void Sum(int arr[])
		{
        int t = 0;
        for (int i = 0; i < arr.length; i++)
			{
                    t = t + arr[i];
             }
        System.out.println("Sum = " + t);
}
         public static void main(String args[])
		 {
			 Scanner in = new Scanner(System.in);
			 int a[]=new int[5];

		
			 DsaCombination obj=new DsaCombination();
			 obj.input(a);
			  obj.display(a);
			 System.out.println("Display the array elements");
			 obj.Sum(a);
			 System.out.println("Sum of the array elements");
			 obj.Max(a);
			 System.out.println("Maximum of  the array elements");
			 
			 obj.reverse(a);
			 System.out.println("Reversed  array elements");
		 }
}
