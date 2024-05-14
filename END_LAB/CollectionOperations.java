import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Scanner;

public class CollectionOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ArrayList operations
        System.out.println("ArrayList Operations:");
        List<String> arrayList = new ArrayList<>();
        performOperations(arrayList, scanner);

        // LinkedList operations
        System.out.println("\nLinkedList Operations:");
        List<String> linkedList = new LinkedList<>();
        performOperations(linkedList, scanner);

        // Vector operations
        System.out.println("\nVector Operations:");
        List<String> vector = new Vector<>();
        performOperations(vector, scanner);
    }

    public static void performOperations(List<String> list, Scanner scanner) {
        // Insertion
        System.out.println("Enter an item to insert:");
        String itemToInsert = scanner.nextLine();
        list.add(itemToInsert);
        System.out.println("List after insertion: " + list);

        // Updation
        System.out.println("Enter the index to update:");
        int indexToUpdate = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (indexToUpdate >= 0 && indexToUpdate < list.size()) {
            System.out.println("Enter the new value:");
            String newValue = scanner.nextLine();
            list.set(indexToUpdate, newValue);
            System.out.println("List after updating: " + list);
        } else {
            System.out.println("Invalid index!");
        }

        // Deletion
        System.out.println("Enter the index to delete:");
        int indexToDelete = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        if (indexToDelete >= 0 && indexToDelete < list.size()) {
            list.remove(indexToDelete);
            System.out.println("List after deletion: " + list);
        } else {
            System.out.println("Invalid index!");
        }

        // Iterate over the list
        iterateList(list);
    }

    public static void iterateList(List<String> list) {
        System.out.println("Iterating over the list:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
