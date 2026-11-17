import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LostAndFoundSystem system = new LostAndFoundSystem(input);

        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");

            // Validate menu input so non-numeric input does not crash the program.
            while (!input.hasNextInt()) {
                System.out.println("Please enter a number from 1 to 5.");
                input.nextLine();
                System.out.print("Enter your choice: ");
            }

            choice = input.nextInt();
            input.nextLine(); // Clear the newline left by nextInt().

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
                    System.out.println("Thank you for using Campus Lost and Found!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        input.close();
    }

    // Displays the application menu.
    public static void displayMenu() {
        System.out.println("\\n===== CAMPUS LOST AND FOUND =====");
        System.out.println("1. Report Lost Item");
        System.out.println("2. Report Found Item");
        System.out.println("3. Search Reports");
        System.out.println("4. View Reports");
        System.out.println("5. Exit");
        System.out.println("================================");
    }
}
