// Campus Lost and Found
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    // Scanner declared as a class variable so all methods can use it
    static Scanner input = new Scanner(System.in);

    // ArrayLists for storing lost and found items
    static ArrayList<String> foundItems = new ArrayList<String>();
    static ArrayList<String> lostItems = new ArrayList<String>();

    public static void main(String[] args) {

        // Declaration
        int choice;

        do {
            displayMenu();

            // Receive user's menu choice
            choice = input.nextInt();

            // Clear the newline left by nextInt()
            input.nextLine();

            switch (choice) {

                case 1:
                    // Report lost item
                    reportLostItem();
                    break;

                case 2:
                    // Report found item
                    System.out.println("Report Found Item selected.");
                    break;

                case 3:
                    // Search reports
                    System.out.println("Search Reports selected.");
                    break;

                case 4:
                    // View reports
                    System.out.println("View Reports selected.");
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice. Please enter 1-5.");
                    break;
            }

        } while (choice != 5);

        input.close();
    }

    // ==============================
    // METHODS
    // ==============================

    // Display menu method
    private static void displayMenu() {

        System.out.println("\n=================================");
        System.out.println("      Campus Lost and Found");
        System.out.println("=================================");
        System.out.println("1. Report a Lost Item");
        System.out.println("2. Report a Found Item");
        System.out.println("3. Search Reports");
        System.out.println("4. View Reports");
        System.out.println("5. Exit");
        System.out.println("=================================");
        System.out.print("=> ");
    }

    // ==============================
    // 1. Report Lost Item Method
    // ==============================

    public static void reportLostItem() {

        // Variables for storing lost item information
        String itemName;
        String category;
        String colour;
        String location;
        String dateLost;
        String description;

        System.out.println("\n----- REPORT LOST ITEM -----");

        System.out.print("What is the name of the item? ");
        itemName = input.nextLine();

        System.out.print("What category does the item belong to? ");
        category = input.nextLine();

        System.out.print("What colour is the item? ");
        colour = input.nextLine();

        System.out.print("Where did you lose the item? ");
        location = input.nextLine();

        System.out.print("What date did you lose the item? ");
        dateLost = input.nextLine();

        System.out.print("Please describe the item: ");
        description = input.nextLine();

        // Store the lost item
        String lostItem = "Item: " + itemName
                + " | Category: " + category
                + " | Colour: " + colour
                + " | Location: " + location
                + " | Date Lost: " + dateLost
                + " | Description: " + description;

        lostItems.add(lostItem);

        // Display confirmation
        System.out.println("\n----- LOST ITEM REPORT -----");
        System.out.println("Lost item report recorded successfully.");
        System.out.println("Item: " + itemName);
        System.out.println("Category: " + category);
        System.out.println("Colour: " + colour);
        System.out.println("Location: " + location);
        System.out.println("Date Lost: " + dateLost);
        System.out.println("Description: " + description);

        System.out.println("\nReturning to main menu...");
    }
}
