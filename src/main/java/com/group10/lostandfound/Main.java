import java.util.Scanner;

/**
 * Entry point for the Campus Lost and Found application.
 * Main handles the menu and program flow; LostAndFoundSystem handles
 * report creation, storage, searching, and viewing.
 */
public class Main {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        LostAndFoundSystem system = new LostAndFoundSystem(input);
        int choice;

        do {
            displayMenu();
            String choiceInput = input.nextLine();

            try {
                choice = Integer.parseInt(choiceInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Please enter a number from 1 to 5.");
                choice = 0;
                continue;
            }

            switch (choice) {
                case 1:
                    system.reportLostItem();
                    break;
                case 2:
                    system.reportFoundItem();
                    break;
                case 3:
                    system.searchReports();
                    break;
                case 4:
                    system.viewReports();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        } while (choice != 5);

        input.close();
    }

    // Displays the main application menu.
    private static void displayMenu() {
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
}
