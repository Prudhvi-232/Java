import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

public class DataStructureOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // HashSet operations
        System.out.println("HashSet Operations:");
        Set<String> hashSet = new HashSet<>();
        performSetOperations("HashSet", hashSet, scanner);

        // TreeSet operations
        System.out.println("\nTreeSet Operations:");
        Set<String> treeSet = new TreeSet<>();
        performSetOperations("TreeSet", treeSet, scanner);

        // Hashtable operations
        System.out.println("\nHashtable Operations:");
        Map<String, String> hashTable = new Hashtable<>();
        performMapOperations("Hashtable", hashTable, scanner);

        // HashMap operations
        System.out.println("\nHashMap Operations:");
        Map<String, String> hashMap = new HashMap<>();
        performMapOperations("HashMap", hashMap, scanner);
    }

    public static void performSetOperations(String type, Set<String> set, Scanner scanner) {
        // Insertion
        System.out.println("Enter items to insert into " + type + " (separated by space):");
        String input = scanner.nextLine();
        set.addAll(Arrays.asList(input.split("\\s+")));
        System.out.println("Set after insertion: " + set);

        // Deletion
        System.out.println("Enter an item to delete from " + type + ":");
        String itemToDelete = scanner.nextLine();
        if (set.remove(itemToDelete)) {
            System.out.println("Set after deletion: " + set);
        } else {
            System.out.println("Item not found in the set.");
        }

        // Iterate over the set
        iterateSet(set);
    }

    public static void performMapOperations(String type, Map<String, String> map, Scanner scanner) {
        // Insertion
        System.out.println("Enter key-value pairs to insert into " + type + " (key-value separated by space):");
        String input = scanner.nextLine();
        String[] keyValuePairs = input.split("\\s+");
        for (int i = 0; i < keyValuePairs.length; i += 2) {
            map.put(keyValuePairs[i], keyValuePairs[i + 1]);
        }
        System.out.println("Map after insertion: " + map);

        // Update
        System.out.println("Enter a key to update its value in " + type + ":");
        String keyToUpdate = scanner.nextLine();
        if (map.containsKey(keyToUpdate)) {
            System.out.println("Enter the new value:");
            String newValue = scanner.nextLine();
            map.put(keyToUpdate, newValue);
            System.out.println("Map after updating: " + map);
        } else {
            System.out.println("Key not found in the map.");
        }

        // Deletion
        System.out.println("Enter a key to delete from " + type + ":");
        String keyToDelete = scanner.nextLine();
        if (map.containsKey(keyToDelete)) {
            map.remove(keyToDelete);
            System.out.println("Map after deletion: " + map);
        } else {
            System.out.println("Key not found in the map.");
        }

        // Iterate over the map
        iterateMap(map);
    }

    public static void iterateSet(Set<String> set) {
        System.out.println("Iterating over the set:");
        for (String item : set) {
            System.out.println(item);
        }
    }

    public static void iterateMap(Map<String, String> map) {
        System.out.println("Iterating over the map:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
