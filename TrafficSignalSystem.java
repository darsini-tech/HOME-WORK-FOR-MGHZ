package enumandgenerics;
import java.util.Scanner;

public class TrafficSignalSystem
{

    enum Signal 
    {
        RED,
        YELLOW,
        GREEN
    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        while (true)
        {

            System.out.println("\n--- TRAFFIC SIGNAL SYSTEM ---");
            System.out.println("1. Show Signal Meaning");
            System.out.println("2. Check Stop or Go");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) 
            {

                case 1:
                    System.out.print("Enter signal (RED/YELLOW/GREEN): ");
                    String signal1 = sc.next().toUpperCase();

                    Signal s1 = Signal.valueOf(signal1);

                    switch (s1) 
                    {
                        case RED:
                            System.out.println("RED means STOP");
                            break;

                        case YELLOW:
                            System.out.println("YELLOW means WAIT / GET READY");
                            break;

                        case GREEN:
                            System.out.println("GREEN means GO");
                            break;
                    }
                    break;

                case 2:
                    System.out.print("Enter signal (RED/YELLOW/GREEN): ");
                    String signal2 = sc.next().toUpperCase();

                    Signal s2 = Signal.valueOf(signal2);

                    if (s2 == Signal.RED) 
                    {
                        System.out.println("STOP");
                    } 
                    else if (s2 == Signal.GREEN)
                    {
                        System.out.println("GO");
                    } 
                    else 
                    {
                        System.out.println("WAIT");
                    }
                    break;

                case 3:
                    System.out.println(" Traffic Signal System Tataaa Byeee...");
                    sc.close();
                    return;

                default:
                    System.out.println("No choice Found !");
            }
        }
    }
}

