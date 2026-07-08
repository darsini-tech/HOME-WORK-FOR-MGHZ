import java.util.*;

public class Grade
 {
    public static void main(String[] args)
	{
        
        System.out.print("enter marks:");
        int marks = new Scanner(System.in).nextInt();
        
        if (marks >= 90)
			{
            System.out.println("grade:a");
        } else if (marks >= 75)
			{
            System.out.println("grade:b");
        } else if (marks >= 50)
			{
            System.out.println("grade:c");
        } else if(marks<50)
		{
            System.out.println("grade:fail");
        }
        else 
		{
			System.out.println("not found");
		}
    }
}
