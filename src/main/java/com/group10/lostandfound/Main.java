package com.group10.lostandfound;

import java.util.Scanner;

/**
 * Entry point for the Campus Lost and Found application.
 * Main is responsible for displaying the menu and accepting choices.
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LostAndFoundSystem system = new LostAndFoundSystem(input);

        int choice = 0;

        while (choice != 5) {
            displayMenu();

            String choiceInput = input.nextLine().trim();

            try {
                choice = Integer.parseInt(choiceInput);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number from 1 to 5.");
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
                    System.out.println("Thank you for using Campus Lost and Found!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose from 1 to 5.");
            }
        }

        input.close();
    }

    private static void displayMenu() {
        System.out.println();
        System.out.println("========================================");
        System.out.println("       CAMPUS LOST AND FOUND");
        System.out.println("========================================");
        System.out.println("1. Report a Lost Item");
        System.out.println("2. Report a Found Item");
        System.out.println("3. Search Reports");
        System.out.println("4. View Reports");
        System.out.println("5. Exit");
        System.out.println("========================================");
        System.out.print("Enter your choice: ");
    }
}
