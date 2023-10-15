package main;

import java.util.Scanner;

public class people {
    // Declare instance variables
    private String position;
    private String name;
    private String studentID;
    private String teacherID;
    private String phone;

    public void collectInformation() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter position (student, teacher, or TA): ");
            position = scanner.nextLine().trim();

            if (!position.equals("student") && !position.equals("teacher") && !position.equals("TA")) {
                System.out.println("Invalid position. Please enter 'student', 'teacher', or 'TA'.");
                continue;
            }

            System.out.print("Enter name (First Last): ");
            name = scanner.nextLine().trim();
            if (!name.matches("^[A-Za-z]+ [A-Za-z]+$")) {
                System.out.println("Invalid name format. Please enter two words separated by a single space.");
                continue;
            }

            if (position.equals("student")) {
                System.out.print("Enter Student ID (5 digits or 0): ");
                studentID = scanner.nextLine().trim();
                if (!studentID.matches("^\\d{5}$") && !studentID.equals("0")) {
                    System.out.println("Invalid Student ID format. Please enter 5 digits or '0'.");
                    continue;
                }
                teacherID = "0";
            } else if (position.equals("teacher")) {
                System.out.print("Enter Teacher ID (5 digits or 0): ");
                teacherID = scanner.nextLine().trim();
                if (!teacherID.matches("^\\d{5}$") && !teacherID.equals("0")) {
                    System.out.println("Invalid Teacher ID format. Please enter 5 digits or '0'.");
                    continue;
                }
                studentID = "0";
            } else if (position.equals("TA")) {
                System.out.print("Enter Student ID (5 digits): ");
                studentID = scanner.nextLine().trim();
                if (!studentID.matches("^\\d{5}$")) {
                    System.out.println("Invalid Student ID format. Please enter 5 digits.");
                    continue;
                }
                System.out.print("Enter Teacher ID (5 digits): ");
                teacherID = scanner.nextLine().trim();
                if (!teacherID.matches("^\\d{5}$")) {
                    System.out.println("Invalid Teacher ID format. Please enter 5 digits.");
                    continue;
                }
            }

            System.out.print("Enter phone (10 digits): ");
            phone = scanner.nextLine().trim();
            if (!phone.matches("^\\d{10}$")) {
                System.out.println("Invalid phone format. Please enter 10 digits.");
                continue;
            }
            break;
        }
    }

    // Add getters to access the information
    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public String getPhone() {
        return phone;
    }
}
