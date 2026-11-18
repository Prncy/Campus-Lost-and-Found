package com.group10.lostandfound;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Manages report creation, storage, searching, and display.
 * Reports are currently kept in memory. CSV persistence will be added later.
 */
public class LostAndFoundSystem {

    private final Scanner input;
    private final ArrayList<Report> reports;

    public LostAndFoundSystem(Scanner input) {
        this.input = input;
        this.reports = new ArrayList<>();
    }

    public void reportLostItem() {
        createReport(Report.LOST);
    }

    public void reportFoundItem() {
        createReport(Report.FOUND);
    }

    /**
     * Collects the shared report details and stores one Report object.
     */
    private void createReport(String reportType) {
        System.out.println();
        System.out.println("===== REPORT " + reportType + " ITEM =====");

        String itemName = readRequired("Item name: ");
        String category = readRequired("Category: ");
        String colour = readRequired("Colour: ");

        String locationPrompt = Report.LOST.equals(reportType)
                ? "Where did you lose the item? "
                : "Where did you find the item? ";
        String location = readRequired(locationPrompt);

        String datePrompt = Report.LOST.equals(reportType)
                ? "Date lost: "
                : "Date found: ";
        String date = readRequired(datePrompt);

        String description = readRequired("Description: ");

        Report report = new Report(
                itemName, category, colour, location,
                date, description, reportType
        );

        reports.add(report);

        System.out.println();
        System.out.println(reportType + " item report recorded successfully.");
        report.displayReport();
    }

    /**
     * Reads a non-empty value so incomplete reports are not stored.
     */
    private String readRequired(String prompt) {
        String value;

        do {
            System.out.print(prompt);
            value = input.nextLine().trim();

            if (value.isEmpty()) {
                System.out.println("This field cannot be empty. Please try again.");
            }
        } while (value.isEmpty());

        return value;
    }

    /**
     * Performs case-insensitive keyword search across all report fields.
     * This is basic keyword matching, not fuzzy matching.
     */
    public void searchReports() {
        System.out.println();
        System.out.println("===== SEARCH REPORTS =====");
        System.out.print("Enter a keyword: ");
        String keyword = input.nextLine().trim();

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
            System.out.println("No matching reports found.");
        } else {
            System.out.println("Matching reports found: " + matchCount);
        }
    }

    /**
     * Displays all reports and a summary of lost and found records.
     */
    public void viewReports() {
        System.out.println();
        System.out.println("===== ALL RECORDED REPORTS =====");

        if (reports.isEmpty()) {
            System.out.println("No reports available.");
            return;
        }

        int lostCount = 0;
        int foundCount = 0;

        for (int i = 0; i < reports.size(); i++) {
            System.out.println();
            System.out.println("Report " + (i + 1));
            reports.get(i).displayReport();

            if (Report.LOST.equals(reports.get(i).getReportType())) {
                lostCount++;
            } else {
                foundCount++;
            }
        }

        System.out.println();
        System.out.println("===== REPORT SUMMARY =====");
        System.out.println("Total reports: " + reports.size());
        System.out.println("Lost reports: " + lostCount);
        System.out.println("Found reports: " + foundCount);
    }

    public int getReportCount() {
        return reports.size();
    }
}
