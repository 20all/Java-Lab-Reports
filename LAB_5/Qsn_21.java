import java.util.Scanner;

class Student {
    private String name; 
    private int rollNo;
    private double gpa;
    // default constructor 
    Student() {
        this.name = "Unknown";
        this.rollNo = 0;
        this.gpa = 0.0;
    }
    // parameterized constructor
    Student(String n, int rN, double gpa) {
        this.name = n;
        this.rollNo = rN;
        this.gpa = gpa;
    }
    // copy constructor
    Student(Student others) {
        this.name = others.name;
        this.rollNo = others.rollNo;
        this.gpa = others.gpa;
    }

    // method to display Student information
    public void displayInfo() {
        System.out.printf("Student: %s -> Roll.no: %d , GPA: %.2f%n",name,rollNo,gpa);
    }

    // getters (for accesing private fields)
    public String getName() {
        return name;
    }
    public int getRollNo() {
        return rollNo;
    }
    public double getGpa() {
        return gpa;
    }
}
public class Qsn_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // use of default constructor
        Student student1 = new Student();
        System.out.println("Student1(default constructor):");
        student1.displayInfo();

        // use of parameterized constructor
        Student student2 = new Student("Bishal", 21, 3.99);
        System.out.println("Student2(parameterized constructor):");
        student2.displayInfo();

        // use of copy constructor
        Student student3 =  new Student(student2);
        System.out.println("Student3(copy constructor):");
        student3.displayInfo();
        input.close();
    }
}
