package fileee;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class StudentClub
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Set<String> members = new HashSet<>();
        int choice;
        do
        {
            System.out.println("\n======================================");
            System.out.println("      STUDENT CLUB MANAGEMENT SYSTEM");
            System.out.println("======================================");
            System.out.println("1. Add Member");
            System.out.println("2. Remove Member");
            System.out.println("3. Search Member");
            System.out.println("4. Display All Members");
            System.out.println("5. Count Members");
            System.out.println("6. Exit");
            System.out.println("======================================");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1:

                    System.out.println("\n--- Add Member ---");

                    System.out.print("Enter Member Name: ");
                    String name = sc.nextLine();

                    if(members.add(name))
                    {
                        System.out.println("Member added successfully.");
                    }
                    else
                    {
                        System.out.println("Member already exists.");
                    }
                    break;
                case 2:
                    System.out.println("\n--- Remove Member ---");

                    System.out.print("Enter Member Name: ");
                    String removeName = sc.nextLine();

                    if(members.remove(removeName))
                    {
                        System.out.println("Member removed successfully.");
                    }
                    else
                    {
                        System.out.println("Apadi yarumeee illaaa.");
                    }
                    break;
                case 3:

                    System.out.println("\n--- Search Member ---");

                    System.out.print("Enter Member Name: ");
                    String searchName = sc.nextLine();

                    if(members.contains(searchName))
                    {
                        System.out.println("Member found in the club.");
                    }
                    else
                    {
                        System.out.println("Apadi yarumeee illaaa.");
                    }
                    break;
                case 4:

                    System.out.println("\n--- All Club Members ---");

                    if(members.size() == 0)
                    {
                        System.out.println("Apadi yarumeee illaaa.");
                    }
                    else
                    {
                        for(String member : members)
                        {
                            System.out.println(member);
                        }
                    }
                    break;
                case 5:

                    System.out.println("\n--- Count Members ---");

                    System.out.println("Total number of members: " + members.size());

                    break;
                case 6:

                    System.out.println("\nThank you for using Student Club Management System.");
                    System.out.println("Nandriiii Meendum Varugaaa!!!!!!");

                    break;
                default:

                    System.out.println("Invalid choice. Please enter 1 to 6.");
            }
        } while(choice != 6);
    }
}