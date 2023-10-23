package main;

import java.util.Scanner;

public class people {
    // Here I am declaring the variables
    private String position;
    private String name;
    private String studentID;
    private String teacherID;
    private String phone;

    public void collectInformation() {
        Scanner scanner = new Scanner(System.in);
        
        //This is a while loop is asking for all of the information
        while (true) {
            System.out.print("Which Position would you like to choose student, teacher, or TA?: ");
            position = scanner.nextLine().trim();

            if (!position.equals("student") && !position.equals("teacher") && !position.equals("TA")) {
                System.out.println("Please enter 'student', 'teacher', or 'TA'.");
                continue;
            }

            System.out.print("Please enter their First and Last name: ");
            name = scanner.nextLine().trim();
            if (!name.matches("^[A-Za-z]+ [A-Za-z]+$")) {
                System.out.println("Please enter two words separated by a single space.");
                continue;
            }

            if (position.equals("student")) {
                System.out.print("Student ID (5 digits or 0): ");
                studentID = scanner.nextLine().trim();
                if (!studentID.matches("^\\d{5}$") && !studentID.equals("0")) {
                    System.out.println("Please enter 5 digits or '0'.");
                    continue;
                }
                teacherID = "0";
            } else if (position.equals("teacher")) {
                System.out.print("Teacher ID (5 digits or 0): ");
                teacherID = scanner.nextLine().trim();
                if (!teacherID.matches("^\\d{5}$") && !teacherID.equals("0")) {
                    System.out.println("Please enter 5 digits or '0'.");
                    continue;
                }
                studentID = "0";
            } else if (position.equals("TA")) {
                System.out.print("Enter Student ID (5 digits): ");
                studentID = scanner.nextLine().trim();
                if (!studentID.matches("^\\d{5}$")) {
                    System.out.println("Please enter 5 digits.");
                    continue;
                }
                System.out.print("Enter Teacher ID (5 digits): ");
                teacherID = scanner.nextLine().trim();
                if (!teacherID.matches("^\\d{5}$")) {
                    System.out.println("Please enter 5 digits.");
                    continue;
                }
            }

            System.out.print("Enter Phone Number (10 digits): ");
            phone = scanner.nextLine().trim();
            if (!phone.matches("^\\d{10}$")) {
                System.out.println("Please use a phone format of 10 digits.");
                continue;
            }
            break;
        }
    }

    //Here I used getters to get the information needed
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
