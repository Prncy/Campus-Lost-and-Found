CAMPUS LOST AND FOUND COORDINATOR
CS350 - Object-Oriented Programming in Java

PROJECT CONTENTS
----------------
src/
  Main.java
  LostAndFoundSystem.java
  Report.java
  User.java

TASK COVERAGE
-------------
Task 1: Main.java controls the menu and program flow.
        LostAndFoundSystem.java handles the system operations.

Task 2: Report.java is one reusable class for both LOST and FOUND items.
        The report type is restricted to LOST or FOUND.

Task 3: User.java stores basic user information:
        user ID, full name, and email address.
        No registration, login, password, or authentication is implemented.

Task 4: LostAndFoundSystem.java searches report fields using basic
        case-insensitive keyword matching and displays all reports.

HOW TO COMPILE AND RUN
----------------------
1. Open a terminal or command prompt.
2. Change directory into the src folder.
3. Compile all Java files:

   javac *.java

4. Run the application:

   java Main

NOTES
-----
- All files use the default package and should remain in the same source folder.
- Reports are stored in memory using ArrayList<Report>.
- Data is not saved after the program closes.
- CSV storage, fuzzy matching, login, and registration are not included.
- User.java is a foundation class only and is not yet connected to reports.
