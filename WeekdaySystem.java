
package enumandgenerics;
 import java.util.Scanner;
public class WeekdaySystem 
{
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
        FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Check Working Day");
            System.out.println("2. Check Weekend");
            System.out.println("3. Display All Days");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Day: ");
                Day d = Day.valueOf(sc.next().toUpperCase());

                if (d == Day.SATURDAY || d == Day.SUNDAY)
                    System.out.println("Yeahhhh This is WeekkkkkEndddddd Soo Goo And Enjoyyyyyy!!!");
                else
                    System.out.println("Working Day");

            } else if (choice == 2) {

                System.out.print("Enter Day: ");
                Day d = Day.valueOf(sc.next().toUpperCase());

                if (d == Day.SATURDAY || d == Day.SUNDAY)
                    System.out.println("Yeahhhh This is WeekkkkkEndddddd Soo Goo And Enjoyyyyyy!!!");
                else
                    System.out.println("Thambiii innum week mudiyalaa, poitu velaiya paruuu!!!!");

            } else if (choice == 3) {

                System.out.println("\nDays of the Week:");

                for (Day d : Day.values())
                    System.out.println(d);

            } else if (choice == 4) {

                System.out.println("Tataaaa byeeeeeeeeee...");
                break;

            } else
            {

                System.out.println("Invalid Choice");
            }
        }
    }

}
