package main;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        people person = new people();  // I created an instance for the 'people' class
        person.collectInformation();   //  Here I called 'collectInformation' method to the instance

        System.out.println("Information collected:");
        System.out.println("Position: " + person.getPosition());
        System.out.println("Name: " + person.getName());
        System.out.println("Student ID: " + person.getStudentID());
        System.out.println("Teacher ID: " + person.getTeacherID());
        System.out.println("Phone: " + person.getPhone());

        // Create a PrintWriter to write to the CSV file
        try (PrintWriter writer = new PrintWriter("out.csv")) {
            String position = person.getPosition();
            String name = person.getName();
            long phone = Long.parseLong(person.getPhone());
            int studentID = Integer.parseInt(person.getStudentID());
            int teacherID = Integer.parseInt(person.getTeacherID());

            // Create an appropriate object based on 'position'
            if (position.equals("student")) {
                Student student = new Student(name, phone, studentID, 0);
                student.csvPrintln(writer);
            } else if (position.equals("teacher")) {
                Teacher teacher = new Teacher(name, phone, 0, teacherID);
                teacher.csvPrintln(writer);
            } else if (position.equals("TA")) {
                TA ta = new TA(name, phone, studentID, teacherID);
                ta.csvPrintln(writer);
            } else {
                System.out.println("Invalid position.");
            }

            System.out.println("Information saved to out.csv.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
