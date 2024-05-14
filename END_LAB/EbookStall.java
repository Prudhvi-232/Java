import java.util.Scanner;

class Book {
    String name;
    String author;
    int count;

    public Book(String name, String author, int count) {
        this.name = name;
        this.author = author;
        this.count = count;
    }

    public void display() {
        System.out.println("Book Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Count: " + count);
    }
}

class Customer {
    int id;
    String name;
    String address;

    public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void buyBook(Book book) {
        if (book.count > 0) {
            System.out.println("Customer " + name + " bought book: " + book.name);
            book.count--;
            System.out.println("Remaining count of " + book.name + ": " + book.count);
        } else {
            System.out.println("Sorry, the book " + book.name + " is out of stock.");
        }
    }
}

public class EbookStall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Book details:");
        System.out.print("Name: ");
        String bookName = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Count: ");
        int count = scanner.nextInt();

        Book book = new Book(bookName, author, count);

        System.out.println("\nEnter Customer details:");
        System.out.print("ID: ");
        int customerId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        String customerName = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();

        Customer customer = new Customer(customerId, customerName, address);

        customer.buyBook(book);
    }
}
