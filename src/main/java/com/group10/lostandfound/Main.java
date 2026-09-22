//campus lost and found
import java.util.Scanner;
import java.util.ArrayList;

public class Main{

     //scanner method to receive user input
    static 3
    Scanner input = new Scanner(System.in);
    static ArrayList <String> foundItems = new ArrayList<String>();
    static ArrayList <String> lostItems = new ArrayList<String>();

    public static void main(String[] args){
    
    //declarations
    int choice;

    do{
        displayMenu();
        choice = input.nextInt();

        switch(choice){
            case 1://report lost items
                reportLostItem();
                break;
            case 2://report found items
            
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

    //1.Report lost items method  .

    //2.Report Found items method

    //3.Search reports method

    //4.View reports methods
   
    /* private static void reportcard(
        int reportNo, String Type,String Item, String Category, String Location, String Date, String Description
    ){
        System.out.println("Report "+reportNo);
        System.out.println("Type: "+Type);
        System.out.println("Item: "+Item);
        System.out.println("Category: "+Categ..............................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................ory);
        System.out.println("Location: "+Location);                                        
        System.out.println("Date: "+Date);                                                                                                        
        System.out.println("Description: "+Description);
    }*/
    
 // Method for reporting a lost item
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
        itemName = scanner.nextLine();

        System.out.print("What category does the item belong to? ");
        category = scanner.nextLine();

        System.out.print("What colour is the item? ");
        colour = scanner.nextLine();

        System.out.print("Where did you lose the item? ");
        location = scanner.nextLine();

        System.out.print("What date did you lose the item? ");
        dateLost = scanner.nextLine();

        System.out.print("Please describe the item: ");
        description = scanner.nextLine();

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

                
