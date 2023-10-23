package main;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (PrintWriter writer = new PrintWriter("out.csv")) {
            while (true) {
                people person = new people(); 
                person.collectInformation();   

                System.out.println("Information collected:");
                System.out.println(person.getPosition() + " " + person.getName() + " " + person.getStudentID() + " " + person.getTeacherID() + " " + person.getPhone());

                String position = person.getPosition();
                String name = person.getName();
                long phone = Long.parseLong(person.getPhone());
                int studentID = Integer.parseInt(person.getStudentID());
                int teacherID = Integer.parseInt(person.getTeacherID());

                if (position.equals("Student")) {
                    Student student = new Student(name, phone, studentID, 0);
                    student.csvPrintln(writer);
                } else if (position.equals("Teacher")) {
                    Teacher teacher = new Teacher(name, phone, 0, teacherID);
                    teacher.csvPrintln(writer);
                } else if (position.equals("TA")) {
                    TA ta = new TA(name, phone, studentID, teacherID);
                    ta.csvPrintln(writer);
                } else {
                    System.out.println("Invalid position.");
                }

                System.out.println("Information saved to out.csv.");

                System.out.print("Do you want to add more information (yes/no)? ");
                String response = scanner.nextLine().trim().toLowerCase();
                if (!response.equals("yes")) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
