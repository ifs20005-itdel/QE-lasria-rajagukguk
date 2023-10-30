import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class BookManagementApp {
    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu Program.");
            System.out.println("Welcome to book management app");
            System.out.println("Please choose your menu:");
            System.out.println("1. Create a new book");
            System.out.println("2. Get all books");
            System.out.println("3. Get book by ID");
            System.out.println("4. Update book");
            System.out.println("5. Delete book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    createBook();
                    break;
                case 2:
                    getAllBooks();
                    break;
                case 3:
                    getBookById();
                    break;
                case 4:
                    updateBook();
                    break;
                case 5:
                    deleteBook();
                    break;
                case 6:
                    System.out.println("Bye....");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        } while (choice != 6);
    }

    private static void createBook() {
        System.out.println("Enter title:");
        String title = scanner.nextLine();
        System.out.println("Enter author:");
        String author = scanner.nextLine();
        System.out.println("Enter category:");
        String category = scanner.nextLine();

        Book newBook = new Book(title, author, category);
        books.add(newBook);

        System.out.println("Book created!");
        System.out.println(newBook);
    }

    private static void getAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static void getBookById() {
        System.out.println("Enter book ID:");
        UUID id = UUID.fromString(scanner.nextLine());

        for (Book book : books) {
            if (book.getId().equals(id)) {
                System.out.println(book);
                return;
            }
        }

        System.out.println("Book not found with ID: " + id);
    }

    private static void updateBook() {
        System.out.println("Enter book ID:");
        UUID id = UUID.fromString(scanner.nextLine());

        for (Book book : books) {
            if (book.getId().equals(id)) {
                System.out.println("Enter title:");
                String title = scanner.nextLine();
                System.out.println("Enter author:");
                String author = scanner.nextLine();
                System.out.println("Enter category:");
                String category = scanner.nextLine();

                book.setTitle(title);
                book.setAuthor(author);
                book.setCategory(category);

                System.out.println("Book updated!");
                System.out.println(book);
                return;
            }
        }

        System.out.println("Book not found with ID: " + id);
    }

    private static void deleteBook() {
        System.out.println("Enter book ID:");
        UUID id = UUID.fromString(scanner.nextLine());

        for (Book book : books) {
            if (book.getId().equals(id)) {
                books.remove(book);
                System.out.println("Book deleted!");
                return;
            }
        }

        System.out.println("Book not found with ID: " + id);
    }
}