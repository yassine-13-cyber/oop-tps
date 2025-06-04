import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample { // Renamed the class to avoid conflict

    public static void main(String[] args) { // Fixed the method name from "mian" to "main"
        Scanner scanner = new Scanner(System.in);

        // Task 01: Add elements and print the list after each entry
        ArrayList<String> list = new ArrayList<>(); // Simplified ArrayList declaration

        while (true) {
            System.out.print("Enter an element (or type 'exit' to stop): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            list.add(input);
            System.out.println("Current List: " + list);
        }

        // Task 02: Search for an element and return the first match
        System.out.print("Enter an element to search (Task 02): ");
        String searchElement = scanner.nextLine();
        String result = searchElement(list, searchElement);
        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Element not found.");
        }

        // Task 03: Search for an element and return a sublist of all matches
        System.out.print("Enter an element to search for sublist (Task 03): ");
        String searchElementSublist = scanner.nextLine();
        ArrayList<String> sublist = searchSublist(list, searchElementSublist);
        if (!sublist.isEmpty()) {
            System.out.println("Sublist of matching elements: " + sublist);
        } else {
            System.out.println("No matching elements found.");
        }

        scanner.close();
    }

    // Task 02: Search method to return the first matching element
    public static String searchElement(ArrayList<String> list, String element) {
        for (String item : list) {
            if (item.equalsIgnoreCase(element)) {
                return item;
            }
        }
        return null; // Return null if no match is found
    }

    // Task 03: Search method to return a sublist of all matching elements
    public static ArrayList<String> searchSublist(ArrayList<String> list, String element) {
        ArrayList<String> sublist = new ArrayList<>();
        for (String item : list) {
            if (item.equalsIgnoreCase(element)) {
                sublist.add(item);
            }
        }
        return sublist;
    }
}