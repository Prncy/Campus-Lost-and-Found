import java.util.ArrayList;
import java.util.Scanner;

/**
 * Coordinates lost and found reports for the Campus Lost and Found application.
 * Reports are kept in memory using ArrayLists for this development stage.
 */
public class LostAndFoundSystem {

    private final Scanner input;
    private final ArrayList<String> foundItems;
    private final ArrayList<String> lostItems;

    public LostAndFoundSystem(Scanner input) {
        this.input = input;
        this.foundItems = new ArrayList<>();
        this.lostItems = new ArrayList<>();
    }

    // 1. Report a lost item
    public void reportLostItem() {
        System.out.println("\n----- REPORT LOST ITEM -----");

        System.out.print("What is the name of the item? ");
        String itemName = input.nextLine();

        System.out.print("What category does the item belong to? ");
        String category = input.nextLine();

        System.out.print("What colour is the item? ");
        String colour = input.nextLine();

        System.out.print("Where did you lose the item? ");
        String location = input.nextLine();

        System.out.print("What date did you lose the item? ");
        String dateLost = input.nextLine();

        System.out.print("Please describe the item: ");
        String description = input.nextLine();

        String lostItem = "Item: " + itemName
                + " | Category: " + category
                + " | Colour: " + colour
                + " | Location: " + location
                + " | Date Lost: " + dateLost
                + " | Description: " + description;

        lostItems.add(lostItem);

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

    // 2. Report a found item
    public void reportFoundItem() {
        System.out.println("\n----- REPORT FOUND ITEM -----");

        System.out.print("What is the name of the item? ");
        String itemName = input.nextLine();

        System.out.print("What category does the item belong to? ");
        String category = input.nextLine();

        System.out.print("What colour is the item? ");
        String colour = input.nextLine();

        System.out.print("Where did you find the item? ");
        String location = input.nextLine();

        System.out.print("What date did you find the item? ");
        String dateFound = input.nextLine();

        System.out.print("Please describe the item: ");
        String description = input.nextLine();

        String foundItem = "Item: " + itemName
                + " | Category: " + category
                + " | Colour: " + colour
                + " | Location: " + location
                + " | Date Found: " + dateFound
                + " | Description: " + description;

        foundItems.add(foundItem);

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

    // 3. Search lost or found reports
    public void searchReports() {
        System.out.println("\n----- SEARCH REPORTS -----");
        System.out.println("1. Search Lost Items");
        System.out.println("2. Search Found Items");
        System.out.print("=> ");

        String choiceInput = input.nextLine();
        int listChoice;

        try {
            listChoice = Integer.parseInt(choiceInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid choice. Returning to main menu...");
            return;
        }

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

        ArrayList<String> results = new ArrayList<>();
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

    // 4. View lost or found reports
    public void viewReports() {
        System.out.println("\n----- VIEW REPORTS -----");
        System.out.println("1. View Lost Items");
        System.out.println("2. View Found Items");
        System.out.print("=> ");

        String choiceInput = input.nextLine();
        int listChoice;

        try {
            listChoice = Integer.parseInt(choiceInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid choice. Returning to main menu...");
            return;
        }

        if (listChoice == 1) {
            printReportList(lostItems);
        } else if (listChoice == 2) {
            printReportList(foundItems);
        } else {
            System.out.println("Invalid choice. Returning to main menu...");
        }
    }

    // Shared helper for displaying either type of report
    private void printReportList(ArrayList<String> reports) {
        if (reports.isEmpty()) {
            System.out.println("No reports to display.");
            return;
        }

        for (int i = 0; i < reports.size(); i++) {
            System.out.println("\nReport " + (i + 1) + ":");
            System.out.println(reports.get(i));
        }
    }
}
