package com.group10.lostandfound;

/** Represents one lost or found item report. */
public class Report {

    public static final String LOST = "LOST";
    public static final String FOUND = "FOUND";

    private final String itemName;
    private final String category;
    private final String colour;
    private final String location;
    private final String date;
    private final String description;
    private final String reportType;

    public Report(String itemName, String category, String colour,
                  String location, String date, String description,
                  String reportType) {
        if (reportType == null
                || (!LOST.equalsIgnoreCase(reportType)
                && !FOUND.equalsIgnoreCase(reportType))) {
            throw new IllegalArgumentException("Report type must be LOST or FOUND.");
        }

        this.itemName = itemName;
        this.category = category;
        this.colour = colour;
        this.location = location;
        this.date = date;
        this.description = description;
        this.reportType = reportType.toUpperCase();
    }

    public String getItemName() { return itemName; }
    public String getCategory() { return category; }
    public String getColour() { return colour; }
    public String getLocation() { return location; }
    public String getDate() { return date; }
    public String getDescription() { return description; }
    public String getReportType() { return reportType; }

    public boolean matchesKeyword(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return false;
        }
        String search = keyword.trim().toLowerCase();
        return contains(itemName, search)
                || contains(category, search)
                || contains(colour, search)
                || contains(location, search)
                || contains(date, search)
                || contains(description, search)
                || contains(reportType, search);
    }

    private boolean contains(String value, String search) {
        return value != null && value.toLowerCase().contains(search);
    }

    public void displayReport() {
        System.out.println("----------------------------------------");
        System.out.println("Report type: " + reportType);
        System.out.println("Item name: " + itemName);
        System.out.println("Category: " + category);
        System.out.println("Colour: " + colour);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Description: " + description);
        System.out.println("----------------------------------------");
    }
}
