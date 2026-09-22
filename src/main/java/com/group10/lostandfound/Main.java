//campus lost and found
import java.util.Scanner;
import java.util.ArrayList;

public class Main{

     //scanner method to receive user input
    static Scanner input = new Scanner(System.in);
    static ArrayList <String> foundItems = new ArrayList<String>();
    static ArrayList <String> lostItems = new ArrayList<String>();

    public static void main(String[] args){
    
    //declarations
    int choice;

    do{
        displayMenu();
        choice = input.nextInt();
        input.nextLine();

        switch(choice){
            case 1://report lost items
                reportLostItem();
                break;
            case 2://report found items
                reportFoundItem();
                break;
            case 3://search reports
                 searchReports();
                break;
            case 4://view reports
                   viewReports();
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default: System.out.println("Invalid Choice");
                break;
        }
    }while(choice != 5);

    input.close();
    }
    
    //METHODS

    //Display menu method
    private static void displayMenu(){
        System.out.println("=================================");
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
// 2. Report a lost item Method
// ==============================
    public static void reportLostItem() {

        // Variables for storing the lost item information
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


// ==============================
// 2. Report a found item Method
// ==============================
    
    public static void reportFoundItem() {

        // Variables for storing found item information
        String itemName;
        String category;
        String colour;
        String location;
        String dateFound;
        String description;

        System.out.println("\n----- REPORT FOUND ITEM -----");

        System.out.print("What is the name of the item? ");
        itemName = input.nextLine();

        System.out.print("What category does the item belong to? ");
        category = input.nextLine();

        System.out.print("What colour is the item? ");
        colour = input.nextLine();

        System.out.print("Where did you find the item? ");
        location = input.nextLine();

        System.out.print("What date did you find the item? ");
        dateFound = input.nextLine();

        System.out.print("Please describe the item: ");
        description = input.nextLine();

        // Store the found item
        String foundItem = "Item: " + itemName
                + " | Category: " + category
                + " | Colour: " + colour
                + " | Location: " + location
                + " | Date Found: " + dateFound
                + " | Description: " + description;

        foundItems.add(foundItem);

        // Display confirmation
        System.out.println("\n----- FOUND ITEM REPORT -----");
        System.out.println("Found item report recorded successfully.");
        System.out.println("Item: " + itemName);
        System.out.println("Category: " + category);
        System.out.println("Colour: " + colour);
        System.out.println("Location: " + location);
        System.out.println("Date Found: " + dateFound);
        System.out.println("Description: " + description);

        System.out.println("\nReturning to main menu...");
    }


// ==============================
// 3. Search Reports Method
// ==============================

public static void searchReports() {

    System.out.println("\n----- SEARCH REPORTS -----");
    System.out.println("1. Search Lost Items");
    System.out.println("2. Search Found Items");
    System.out.print("=> ");
    int listChoice = input.nextInt();
    input.nextLine();

    ArrayList<String> targetList;
    if (listChoice == 1) {
        targetList = lostItems;
    } else if (listChoice == 2) {
        targetList = foundItems;
    } else {
        System.out.println("Invalid choice. Returning to main menu...");
        return;
    }

    System.out.print("Enter a keyword to search for (name, category, colour, location, date, or description): ");
    String keyword = input.nextLine().toLowerCase();

    ArrayList<String> results = new ArrayList<String>();

    for (String report : targetList) {
        if (report.toLowerCase().contains(keyword)) {
            results.add(report);
        }
    }

    if (results.isEmpty()) {
        System.out.println("\nNo matching reports found.");
    } else {
        System.out.println("\n" + results.size() + " matching report(s) found:");
        printReportList(results);
    }

    System.out.println("\nReturning to main menu...");
}

// ==============================
// 4. View Reports Method
// ==============================

public static void viewReports() {

    System.out.println("\n----- VIEW REPORTS -----");
    System.out.println("1. View Lost Items");
    System.out.println("2. View Found Items");
    System.out.print("=> ");
    int listChoice = input.nextInt();
    input.nextLine();

    if (listChoice == 1) {
        printReportList(lostItems);
    } else if (listChoice == 2) {
        printReportList(foundItems);
    } else {
        System.out.println("Invalid choice. Returning to main menu...");
    }
}

  //Helper(both lost n found) — prints any given list of report strings
public static void printReportList(ArrayList<String> list) {

    if (list.isEmpty()) {
        System.out.println("No reports to display.");
        return;
    }

    for (int i = 0; i < list.size(); i++) {
        System.out.println("\nReport " + (i + 1) + ":");
        System.out.println(list.get(i));
    }
}
    
}

                


