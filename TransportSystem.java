
package encapsulation;
    import java.util.Scanner;
public class TransportSystem
{
    abstract static class Transport
    {
        int passengerId;
        String passengerName;
        String fromCity;
        String toCity;
        double distance;
        double fare;

        abstract void calculateFare();

        void displayTicket()
        {
            System.out.println("\n----- TICKET DETAILS -----");
            System.out.println("Passenger ID   : " + passengerId);
            System.out.println("Passenger Name : " + passengerName);
            System.out.println("Route          : " + fromCity + " -> " + toCity);
            System.out.println("Distance       : " + distance + " km");
            System.out.println("Total Fare     : rupees" + fare);
        }
    }

    // Subclass 1: CityBus
    static class CityBus extends Transport {
        void calculateFare() {
            fare = distance * 5;
        }
    }

    // Subclass 2: LuxuryBus
    static class LuxuryBus extends Transport {
        void calculateFare() {
            fare = (distance * 10) + 200;
        }
    }

    static Transport bus = null;

    public static void runSystem()
    {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- TRANSPORT MANAGEMENT SYSTEM ----");
            System.out.println("1. City Bus Booking");
            System.out.println("2. Luxury Bus Booking");
            System.out.println("3. Calculate Fare");
            System.out.println("4. Display Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) 
            {
                break;
            }

            switch (choice) 
            {
                case 1:
                case 2:
                    if (choice == 1) 
                    {
                        bus = new CityBus();
                    } 
                    else
                    {
                        bus = new LuxuryBus();
                    }

                    System.out.print("Enter Passenger ID: ");
                    bus.passengerId = sc.nextInt();
                    sc.nextLine(); // Clear the scanner buffer
                    System.out.print("Enter Passenger Name: ");
                    bus.passengerName = sc.nextLine();

                    System.out.println("\nSelect Route:");
                    System.out.println("1. Chennai -> Bangalore");
                    System.out.println("2. Chennai -> Coimbatore");
                    System.out.println("3. Chennai -> Madurai");
                    System.out.println("4. Chennai -> Trichy");
                    System.out.println("5. Chennai -> Salem");
                    System.out.print("Enter route choice: ");
                    int routeChoice = sc.nextInt();

                    bus.fromCity = "Chennai";
                    if (routeChoice == 1) { bus.toCity = "Bangalore"; bus.distance = 350; }
                    else if (routeChoice == 2) { bus.toCity = "Coimbatore"; bus.distance = 500; }
                    else if (routeChoice == 3) { bus.toCity = "Madurai"; bus.distance = 460; }
                    else if (routeChoice == 4) { bus.toCity = "Trichy"; bus.distance = 330; }
                    else if (routeChoice == 5) { bus.toCity = "Salem"; bus.distance = 340; }

                    System.out.println("Ticket Booked Successfully");
                    break;

                case 3:
                    if (bus != null) 
                    {
                        bus.calculateFare(); 
                        System.out.println("Fare Calculated Successfully");
                    } else {
                        System.out.println("Please book a ticket first!");
                    }
                    break;

                case 4:
                    if (bus != null) {
                        bus.displayTicket();
                    } else {
                        System.out.println("No ticket details available!");
                    }
                    break;

                default:
                    System.out.println("Invalid Option! Please try again.");
            }
        }

    }
}
    

