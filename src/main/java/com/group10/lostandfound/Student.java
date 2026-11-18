package com.group10.lostandfound;

/**
 * Represents a student who may use the Campus Lost and Found system.
 * Registration and account management will be connected in a later stage.
 */
public class Student {

    private final String studentId;
    private String fullName;
    private String email;

    public Student(String studentId, String fullName, String email) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.email = email;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayStudentInfo() {
        System.out.println("----------------------------------------");
        System.out.println("STUDENT INFORMATION");
        System.out.println("----------------------------------------");
        System.out.println("Student ID: " + studentId);
        System.out.println("Full Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("----------------------------------------");
    }
}
