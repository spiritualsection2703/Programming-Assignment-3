package main;

import java.io.PrintWriter;

public interface CSVPrintable {
    String getName();
    int getID();
    void csvPrintln(PrintWriter out);
}

// Here I am implementing the Student class to the CSVPrintable interface
class Student implements CSVPrintable {
    private String name;
    private long phone;
    private int studentID;
    private int teacherID;

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
        out.println("Student," + getName() + "," + getID() + "," + phone);
    }
}

//Here I am implementing the Teacher class to the CSVPrintable interface
class Teacher implements CSVPrintable {
    private String name;
    private long phone;
    private int studentID;
    private int teacherID;

    public Teacher(String name, long phone, int studentID, int teacherID) {
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
        out.println("Teacher," + getName() + "," + getID() + "," + phone);
    }
}

// DHere I am implementing the TA class to the CSVPrintable interface
class TA implements CSVPrintable {
    private String name;
    private long phone;
    private int studentID;
    private int teacherID;

    public TA(String name, long phone, int studentID, int teacherID) {
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
        return Math.max(studentID, teacherID);
    }

    @Override
    public void csvPrintln(PrintWriter out) {
        out.println("TA," + getName() + "," + getID() + "," + phone);
    }
}