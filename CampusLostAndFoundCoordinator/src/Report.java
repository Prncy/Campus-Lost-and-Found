public class Report {

    private String itemName;
    private String category;
    private String colour;
    private String location;
    private String date;
    private String description;
    private String reportType;

    public Report(String itemName, String category, String colour,
                  String location, String date, String description,
                  String reportType) {
        this.itemName = itemName;
        this.category = category;
        this.colour = colour;
        this.location = location;
        this.date = date;
        this.description = description;
        setReportType(reportType);
    }

    public String getItemName() {
        return itemName;
    }

    public String getCategory() {
        return category;
    }

    public String getColour() {
        return colour;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getReportType() {
        return reportType;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setReportType(String reportType) {
        if (reportType == null ||
            (!reportType.equalsIgnoreCase("LOST") &&
             !reportType.equalsIgnoreCase("FOUND"))) {
            throw new IllegalArgumentException(
                "Report type must be LOST or FOUND."
            );
        }

        this.reportType = reportType.toUpperCase();
    }

    public void displayReport() {
        System.out.println("------------------------------");
        System.out.println("REPORT DETAILS");
        System.out.println("------------------------------");
        System.out.println("Report Type: " + reportType);
        System.out.println("Item Name: " + itemName);
        System.out.println("Category: " + category);
        System.out.println("Colour: " + colour);
        System.out.println("Location: " + location);
        System.out.println("Date: " + date);
        System.out.println("Description: " + description);
        System.out.println("------------------------------");
    }

    // Supports basic keyword search; this is not fuzzy matching.
    public boolean matchesKeyword(String keyword) {
        String search = keyword.toLowerCase();

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
}
