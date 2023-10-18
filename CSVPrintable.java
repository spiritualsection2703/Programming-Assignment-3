package main;

import java.io.PrintWriter;


public interface CSVPrintable {
    String getName();
    int getID();
    void csvPrintln(PrintWriter out);
    
    // Define the Student class implementing the CSVPrintable interface
class Student implements CSVPrintable {
    private String name;
    private long phone;
    private int studentID;
    private int teacherID;

    // Constructor for Student class
    public Student(String name, long phone, int studentID, int teacherID) {
        this.name = name;
        this.phone = phone;
        this.studentID = studentID;
        this.teacherID = teacherID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getID() {
        return studentID;
    }

    @Override
    public void csvPrintln(PrintWriter out) {
        out.println(getName() + "," + getID() + "," + phone);
    }
}

// Define the Teacher class implementing the CSVPrintable interface
class Teacher implements CSVPrintable {
    private String name;
    private int phone; // 4-digit postfix of the phone number
    private int studentID;
    private int teacherID;

    // Constructor for Teacher class
    public Teacher(String name, int phone, int studentID, int teacherID) {
        this.name = name;
        this.phone = phone;
        this.studentID = studentID;
        this.teacherID = teacherID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getID() {
        return teacherID;
    }

    @Override
    public void csvPrintln(PrintWriter out) {
        out.println(getName() + "," + getID() + "," + phone);
    }
}

// Define the TA class extending Student and overriding getID
class TA extends Student {
    public TA(String name, long phone, int studentID, int teacherID) {
        super(name, phone, studentID, teacherID);
    }

    @Override
    public int getID() {
        // Return the maximum of StudentID and TeacherID
        return Math.max(super.studentID, super.teacherID);
    }
}
}
