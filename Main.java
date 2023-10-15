package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        people person = new people();  // Create an instance of the 'people' class
        person.collectInformation();   // Call the 'collectInformation' method on the instance
        // You can now use the collected information as needed
       System.out.println("Information collected:");
       System.out.println("Position: " + person.getPosition());
       System.out.println("Name: " + person.getName());
       System.out.println("Student ID: " + person.getStudentID());
       System.out.println("Teacher ID: " + person.getTeacherID());
       System.out.println("Phone: " + person.getPhone());
    }    
}
