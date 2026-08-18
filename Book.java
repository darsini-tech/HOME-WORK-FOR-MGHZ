package collection.framework;
import java.util.ArrayList;
import java.util.Scanner;

public class Book 
{
    private String bookID;
    private String title;
    private String authorName;
    private String bookStatus;

    public Book(String bookID, String title, String authorName) {
        this.bookID = bookID;
        this.title = title;
        this.authorName = authorName;
        this.bookStatus = "Available";
    }

    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    public void displayBook() {
        System.out.println("ID: " + bookID + " | Title: " + title + " | Author: " + authorName + " | Status: " + bookStatus);
    }
}

class LibraryManagementSystem {
    private static ArrayList<Book> library = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n========== LIBRARY MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");
            
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    addBook();
                    break;
                case "2":
                    viewAllBooks();
                    break;
                case "3":
                    searchBookByID();
                    break;
                case "4":
                    issueBook();
                    break;
                case "5":
                    returnBook();
                    break;
                case "6":
                    deleteBook();
                    break;
                case "7":
                    System.out.println("Exiting the application. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 7.");
            }
        }
    }

    private static void addBook() {
        System.out.print("Enter Book ID: ");
        String id = scanner.nextLine().trim();

        if (findBook(id) != null) {
            System.out.println("Error: A book with ID '" + id + "' already exists! Cannot add duplicate IDs.");
            return;
        }

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine().trim();
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine().trim();

        if (id.isEmpty() || title.isEmpty() || author.isEmpty()) {
            System.out.println("Error: Fields cannot be blank.");
            return;
        }

        library.add(new Book(id, title, author));
        System.out.println("Success: Book added successfully!");
    }

    private static void viewAllBooks() 
    {
        if (library.isEmpty()) {
            System.out.println("The library is currently empty.");
            return;
        }
        System.out.println("\n--- All Books List ---");
        for (Book book : library) {
            book.displayBook();
        }
    }

    private static void searchBookByID() {
        System.out.print("Enter Book ID to search: ");
        String id = scanner.nextLine().trim();
        
        Book book = findBook(id);
        if (book != null) {
            System.out.println("Book Found:");
            book.displayBook();
        } else {
            System.out.println("Error: Book with ID '" + id + "' not found.");
        }
    }

    private static void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        String id = scanner.nextLine().trim();

        Book book = findBook(id);
        if (book == null) {
            System.out.println("Error: Book with ID '" + id + "' not found.");
            return;
        }

        if (book.getBookStatus().equalsIgnoreCase("Issued")) {
            System.out.println("Warning: This book is already issued to someone else!");
        } else {
            book.setBookStatus("Issued");
            System.out.println("Success: The book has been successfully issued.");
        }
    }

    private static void returnBook() {
        System.out.print("Enter Book ID to return: ");
        String id = scanner.nextLine().trim();

        Book book = findBook(id);
        if (book == null) {
            System.out.println("Error: Book with ID '" + id + "' not found.");
            return;
        }

        if (book.getBookStatus().equalsIgnoreCase("Available")) {
            System.out.println("Warning: This book is already available in the library! It cannot be returned.");
        } else {
            book.setBookStatus("Available");
            System.out.println("Success: The book has been successfully returned and is now available.");
        }
    }

    private static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        String id = scanner.nextLine().trim();

        Book book = findBook(id);
        if (book != null) {
            library.remove(book);
            System.out.println("Success: Book with ID '" + id + "' has been deleted from the collection.");
        } else {
            System.out.println("Error: Book with ID '" + id + "' not found.");
        }
    }

    private static Book findBook(String id) {
        for (Book book : library) {
            if (book.getBookID().equalsIgnoreCase(id)) {
                return book;
            }
        }
        return null;
    }
}