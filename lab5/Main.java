import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    // Method to add a student to the list
    public static void add_student(String name, double noteTP, ArrayList<Student> students) {
        Student newStudent = new Student(name, noteTP);
        students.add(newStudent);
        System.out.println("Student added successfully!");
    }

    // Method to show all students
    public static void show_all_student(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                student.showInfo();
            }
        }
    }

    // Method to search for one student by name
    public static void search_one(String name, ArrayList<Student> students) {
        for (Student student : students) {
            if (student.getName().contains(name)) {
                student.showInfo();
                return;
            }
        }
        System.out.println("No student found with the name: " + name);
    }

    // Method to search for all students with a matching name
    public static void search_many(String name, ArrayList<Student> students) {
        boolean found = false;
        for (Student student : students) {
            if (student.getName().contains(name)) {
                student.showInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found with the name: " + name);
        }
    }

    // Method to compute and display the average noteTP of all students
    public static void compute_average_notes(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students to compute average.");
        } else {
            double total = 0;
            for (Student student : students) {
                total += student.getNoteTP();
            }
            System.out.println("Average NoteTP: " + (total / students.size()));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        boolean stop = false;

        while (!stop) {
            System.out.println("Welcome to the system:");
            System.out.println("Enter (add) to add a student");
            System.out.println("Enter (show) to show all students");
            System.out.println("Enter (search) to search for a student by name");
            System.out.println("Enter (searchAll) to search for all students with a matching name");
            System.out.println("Enter (avg) to compute and display the class average");
            System.out.println("Enter (exit) to exit the program");
            System.out.print("Enter the operation you want: ");
            String operation = scan.nextLine();

            switch (operation) {
                case "add":
                    System.out.print("Enter student's name to add: ");
                    String newSName = scan.nextLine();
                    System.out.print("Enter student's note TP to add: ");
                    double noteTP = scan.nextDouble();
                    scan.nextLine(); // Consume the newline character
                    add_student(newSName, noteTP, students);
                    break;

                case "show":
                    show_all_student(students);
                    break;

                case "search":
                    System.out.print("Enter the name of the student you want to search: ");
                    newSName = scan.nextLine();
                    search_one(newSName, students);
                    break;

                case "searchAll":
                    System.out.print("Enter the name of the students you want to search: ");
                    newSName = scan.nextLine();
                    search_many(newSName, students);
                    break;

                case "avg":
                    compute_average_notes(students);
                    break;

                case "exit":
                    stop = true;
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid operation. Please try again.");
                    break;
            }
            System.out.println("---------------------------");
        }

        scan.close();
    }
}

class Student {
    private static int nextID = 1; // Static variable to generate unique IDs
    private int id;
    private String name;
    private double noteTP;

    // Constructor
    public Student(String name, double noteTP) {
        this.id = nextID++;
        this.name = name;
        this.noteTP = noteTP;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getNoteTP() {
        return noteTP;
    }

    // Method to display student information
    public void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("NoteTP: " + noteTP);
        System.out.println("********************");
    }
}