# Campus Lost and Found Coordinator

**Course:** CS350 – Object-Oriented Programming in Java  
**Group:** 10

## Project overview

The Campus Lost and Found Coordinator is a Java console application that helps members of the campus community record and search for lost and found belongings.

Each report stores the item name, category, colour, location, date, description, and whether the item was reported as LOST or FOUND.

## Current features

- Display an interactive main menu.
- Record a lost item.
- Record a found item.
- Search reports using case-insensitive keywords.
- View all reports and a summary of lost and found records.
- Validate menu choices and prevent empty report fields.

## Object-oriented structure

The active application has one source directory:

```text
src/main/java/com/group10/lostandfound/
├── Main.java
├── LostAndFoundSystem.java
├── Report.java
└── Student.java
```

- **Main:** starts the application, displays the menu, and routes user choices.
- **LostAndFoundSystem:** creates, stores, searches, and displays reports.
- **Report:** represents one lost or found report. Both report types use the same class.
- **Student:** stores basic student details and is a foundation for the registration feature. Registration is not connected yet.

The classes use the package `com.group10.lostandfound`.

## Compile and run

From the repository root, run:

```bash
javac -d out src/main/java/com/group10/lostandfound/*.java
java -cp out com.group10.lostandfound.Main
```

This requires a JDK to be installed.

## Current limitations / planned work

- Reports are stored in memory and are lost when the application closes.
- Search uses basic keyword matching; fuzzy matching is not implemented.
- Student is currently a model class only. Registration and login are not implemented.
- CSV loading and saving are not implemented.
- Automated test cases still need to be added.

## Development direction

The next stages are to test this OOP refactor, connect student registration to reports, add CSV persistence, implement lost/found matching, and expand the test cases.

## Team

1. MAKETO MAKETO – GitHub Lead
2. Kambani J.T Mbewe – Testing Lead
3. VINESS BUPE – Documentation Lead
4. Prince Banda – Chief Developer
