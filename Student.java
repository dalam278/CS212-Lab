import java.util.*;
import java.io.*;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(int id, String firstName, String lastName, double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    // Getters and setters omitted for brevity

    public static void main(String[] args) throws IOException {
        TreeMap<Integer, Student> students = new TreeMap<>();
        readStudentsFromFile(students, "students.txt");

        // Additional functionalities like add, delete, find can be implemented here
    }

    private static void readStudentsFromFile(TreeMap<Integer, Student> students, String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int id = Integer.parseInt(line.substring(0, 2).trim());
                String firstName = line.substring(2, line.lastIndexOf(" ")).trim();
                String lastName = line.substring(line.lastIndexOf(" "), line.lastIndexOf(" ")+5).trim();
                double gpa = Double.parseDouble(line.substring(line.length() - 4).trim());

                Student student = new Student(id, firstName, lastName, gpa);
                students.put(id, student);
            }
        }
    }

    // Additional methods for adding, deleting, and finding a student
}

