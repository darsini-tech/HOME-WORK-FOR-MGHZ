
package acessmodifier;

import java.util.*;
public class Studentmanagement {
private String name;
private String id;
private  int age;
public void runMenu()
{
    Scanner in = new Scanner(System.in);
    int choice;
    do
    {
        System.out.println("^^^^^^^^^^^^^^ Student Management System^^^^^^^^^^^^^^^^^^");
        System.out.println(" Add Student Deatials");
        System.out.println("Display Student Deatials");
        System.out.println("Update Student Age");
        System.out.println("Exit");
        System.out.println("Enter your choice(1-4): ");
        choice = in.nextInt();
        in.nextLine();
        switch(choice)
        {
            case 1:
        System.out.print("Enter Student ID: ");
                this.id = in.nextLine();
                    System.out.print("Enter Student Name: ");
                    this.name = in.nextLine();
                    System.out.print("Enter Student Age: ");
                    this.age = in.nextInt();
                      in.nextLine(); 
                    System.out.println("Student details added!!!!");
                    break;
            case 2:
                 if (this.id == null) {
                        System.out.println("No student details found. Please add a student first!");
                    } else {
                        System.out.println("ID: " + this.id + " | Name: " + this.name + " | Age: " + this.age);
                    }
                    break;

                case 3:
                    if (this.id == null) {
                        System.out.println("No student details found.");
                    } else {
                        System.out.print("Enter new age for " + this.name + ": ");
                        this.age = in.nextInt();
                        in.nextLine(); 
                        System.out.println("Age updated successfully!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the system. Tataaa byeee!");
                    break;
        
         default:
                    System.out.println("Invalid selection! Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

    }
}
        
        
        
        
    