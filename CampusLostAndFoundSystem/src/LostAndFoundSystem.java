import java.util.ArrayList;
import java.util.Scanner;

public class LostAndFoundSystem {

    // One shared collection for both LOST and FOUND reports.
    private final ArrayList<Report> reports;
    private final Scanner input;

    public LostAndFoundSystem(Scanner input) {
        this.input = input;
        this.reports = new ArrayList<>();
    }

    public void reportLostItem() {
        Report report = createReport("LOST");
        reports.add(report);

        System.out.println("\\nLost item reported successfully!");
        report.displayReport();
    }

    public void reportFoundItem() {
        Report report = createReport("FOUND");
        reports.add(report);

        System.out.println("\\nFound item reported successfully!");
        report.displayReport();
    }

    // Collects common information and creates either type of Report.
    private Report createReport(String reportType) {
        System.out.println("\\n===== REPORT " + reportType + " ITEM =====");

        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter category: ");
        String category = input.nextLine();

        System.out.print("Enter colour: ");
        String colour = input.nextLine();

        System.out.print("Enter location: ");
        String location = input.nextLine();

        System.out.print("Enter date: ");
        String date = input.nextLine();

        System.out.print("Enter description: ");
        String description = input.nextLine();

        return new Report(
            itemName, category, colour, location,
            date, description, reportType
        );
    }

    // Basic case-insensitive keyword search across report fields.
    public void searchReports() {
        System.out.println("\\n===== SEARCH REPORTS =====");
        System.out.print("Enter keyword to search: ");
        String keyword = input.nextLine().trim().toLowerCase();

        if (keyword.isEmpty()) {
            System.out.println("Please enter a search keyword.");
            return;
        }

        int matchCount = 0;

        for (Report report : reports) {
            if (report.matchesKeyword(keyword)) {
                report.displayReport();
                matchCount++;
            }
        }

        if (matchCount == 0) {
            System.out.println("No matching report found for: " + keyword);
        } else {
            System.out.println("Matching reports found: " + matchCount);
        }
    }

    // Displays every report and a summary of report types.
    public void viewReports() {
        System.out.println("\\n===== ALL RECORDED REPORTS =====");

        if (reports.isEmpty()) {
            System.out.println("No reports available.");
            return;
        }

        int lostCount = 0;
        int foundCount = 0;

        for (Report report : reports) {
            report.displayReport();

            if ("LOST".equals(report.getReportType())) {
                lostCount++;
            } else if ("FOUND".equals(report.getReportType())) {
                foundCount++;
            }
        }

        System.out.println("\\n===== REPORT SUMMARY =====");
        System.out.println("Total reports: " + reports.size());
        System.out.println("Lost reports: " + lostCount);
        System.out.println("Found reports: " + foundCount);
    }

    // Optional accessor useful for testing or future integration.
    public int getReportCount() {
        return reports.size();
    }
}
