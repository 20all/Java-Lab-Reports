import java.util.ArrayList;
import java.util.Scanner;

// Abstract Student class
abstract class Student {
    protected String name;
    protected int rollNumber;
    protected double[] marks; // Array to store marks for subjects

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.rollNumber = 0;
        this.marks = new double[0];
    }

    // Parameterized constructor
    public Student(String name, int rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Abstract method to calculate average marks
    public abstract double calculateAverage();

    // Method to display student info
    public void displayInfo() {
        System.out.printf("Student: %s, Roll Number: %d, Average Marks: %.2f%n", 
            name, rollNumber, calculateAverage());
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for roll number
    public int getRollNumber() {
        return rollNumber;
    }
}

// ComputerScienceStudent class derived from Student
class ComputerScienceStudent extends Student {
    private double programmingMarks;
    private double databaseMarks;

    // Constructor
    public ComputerScienceStudent(String name, int rollNumber, double programmingMarks, double databaseMarks) {
        super(name, rollNumber, new double[]{programmingMarks, databaseMarks});
        this.programmingMarks = programmingMarks;
        this.databaseMarks = databaseMarks;
    }

    // Override calculateAverage
    @Override
    public double calculateAverage() {
        return (programmingMarks + databaseMarks) / 2.0;
    }

    // Override displayInfo to include specific subjects
    @Override
    public void displayInfo() {
        System.out.printf("Computer Science Student: %s, Roll Number: %d, Programming: %.2f, Database: %.2f, Average: %.2f%n",
            name, rollNumber, programmingMarks, databaseMarks, calculateAverage());
    }
}

// MathematicsStudent class derived from Student
class MathematicsStudent extends Student {
    private double calculusMarks;
    private double algebraMarks;

    // Constructor
    public MathematicsStudent(String name, int rollNumber, double calculusMarks, double algebraMarks) {
        super(name, rollNumber, new double[]{calculusMarks, algebraMarks});
        this.calculusMarks = calculusMarks;
        this.algebraMarks = algebraMarks;
    }

    // Override calculateAverage
    @Override
    public double calculateAverage() {
        return (calculusMarks + algebraMarks) / 2.0;
    }

    // Override displayInfo to include specific subjects
    @Override
    public void displayInfo() {
        System.out.printf("Mathematics Student: %s, Roll Number: %d, Calculus: %.2f, Algebra: %.2f, Average: %.2f%n",
            name, rollNumber, calculusMarks, algebraMarks, calculateAverage());
    }
}

public class Qsn_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // Input for Computer Science Students
        System.out.print("Enter number of Computer Science students: ");
        int numCSStudents = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        for (int i = 0; i < numCSStudents; i++) {
            System.out.printf("\nEnter details for Computer Science Student %d:%n", i + 1);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            System.out.print("Programming Marks: ");
            double programmingMarks = scanner.nextDouble();
            System.out.print("Database Marks: ");
            double databaseMarks = scanner.nextDouble();
            scanner.nextLine(); // Clear buffer
            students.add(new ComputerScienceStudent(name, rollNumber, programmingMarks, databaseMarks));
        }

        // Input for Mathematics Students
        System.out.print("\nEnter number of Mathematics students: ");
        int numMathStudents = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        for (int i = 0; i < numMathStudents; i++) {
            System.out.printf("\nEnter details for Mathematics Student %d:%n", i + 1);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            System.out.print("Calculus Marks: ");
            double calculusMarks = scanner.nextDouble();
            System.out.print("Algebra Marks: ");
            double algebraMarks = scanner.nextDouble();
            scanner.nextLine(); // Clear buffer
            students.add(new MathematicsStudent(name, rollNumber, calculusMarks, algebraMarks));
        }

        // Display information and calculate overall averages
        System.out.println("\nStudent Information:");
        double csTotalAverage = 0.0;
        int csCount = 0;
        double mathTotalAverage = 0.0;
        int mathCount = 0;

        for (Student student : students) {
            student.displayInfo();
            if (student instanceof ComputerScienceStudent) {
                csTotalAverage += student.calculateAverage();
                csCount++;
            } else if (student instanceof MathematicsStudent) {
                mathTotalAverage += student.calculateAverage();
                mathCount++;
            }
        }

        // Display average marks for each group
        System.out.printf("\nAverage marks for %d Computer Science students: %.2f%n", 
            csCount, csCount > 0 ? csTotalAverage / csCount : 0.0);
        System.out.printf("Average marks for %d Mathematics students: %.2f%n", 
            mathCount, mathCount > 0 ? mathTotalAverage / mathCount : 0.0);

        scanner.close();
    }
}