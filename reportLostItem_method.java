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
}