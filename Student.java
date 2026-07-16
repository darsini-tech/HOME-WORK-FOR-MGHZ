import java.util.Scanner;

public class Student
{

    Scanner sc = new Scanner(System.in);
    int m1, m2, m3;

    
    public void getMarks() 
	{
        System.out.print("Enter Subject 1 Marks: ");
        m1 = sc.nextInt();
        System.out.print("Enter Subject 2 Marks: ");
        m2 = sc.nextInt();
        System.out.print("Enter Subject 3 Marks: ");
        m3 = sc.nextInt();
    }

    // 2. Calculate Total
    public void total()
	{
        int t = m1 + m2 + m3;
        System.out.println("Total Marks = " + t);
    }

    
    public void average()
	{
		double a = (m1 + m2 + m3) / 3.0;
        System.out.println("Average Marks = " + a);
    }
    public void grade()
	{
        double a = (m1 + m2 + m3) / 3.0;
        if (a >= 80)
			{
            System.out.println("Grade: A");
        } else if (a >= 50) 
		{
            System.out.println("Grade: B");
        } 
		else
			{
            System.out.println("Grade: C");
        }
    }

    public static void main(String[] args)
	{
        Student obj = new Student();
        int choice;

        do 
		{
            System.out.println("\n1.Enter Marks  2.Total  3.Average  4.Grade  5.Exit");
            System.out.print("Enter Choice: ");
            choice = obj.sc.nextInt(); 
			switch (choice) {
                case 1: obj.getMarks();
				break;
                case 2: obj.total();  
				break;
                case 3: obj.average();
				break;
                case 4: obj.grade();   
				break;
                case 5: System.out.println("Exit!");
				break;
                default: System.out.println("Invalid Choice!");
            }
        } while (choice != 5);
    }
}
