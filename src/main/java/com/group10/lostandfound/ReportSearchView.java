package com.group10.lostandfound;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Handles searching and viewing the reports recorded in the system.
 * This class uses the existing shared report collection; it does not
 * create or maintain a separate collection.
 */
public class ReportSearchView {

    private final ArrayList<Report> reports;
    private final Scanner input;

    public ReportSearchView(ArrayList<Report> reports, Scanner input) {
        this.reports = reports;
        this.input = input;
    }

    /**
     * Displays every recorded report and a summary of LOST and FOUND reports.
     */
    public void viewReports() {
        System.out.println("\n===== ALL RECORDED REPORTS =====");

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

        System.out.println("\n===== REPORT SUMMARY =====");
        System.out.println("Total reports: " + reports.size());
        System.out.println("Lost reports: " + lostCount);
        System.out.println("Found reports: " + foundCount);
    }

    /**
     * Searches report fields using a case-insensitive keyword.
     * Matching is delegated to Report.matchesKeyword().
     */
    public void searchReports() {
        System.out.println("\n===== SEARCH REPORTS =====");
        System.out.print("Enter keyword to search: ");

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
            System.out.println("No matching report found for: " + keyword);
        } else {
            System.out.println("Matching reports found: " + matchCount);
        }
    }
}
