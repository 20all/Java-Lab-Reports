import java.util.Scanner;

class Person {
    protected String name;
    protected int age;
    Person(String n, int a) {
        this.name = n; // "this" refers to the current object's name field
        this.age = a; // 'this'  refers to the current object's age field
    }
    public void displayInfo() {
        System.out.println("Person's name: "+name+", Age: "+age);
    }
}
class Student extends Person {
    private String studentId;
    private int grade;
    Student(String n, int a, String s, int g) {
        super(n, a); // call super class consturctor using super()
        this.studentId = s;
        this.grade = g;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(name+" is a student whose,\n Student id : "+studentId+"\n Grade : "+grade);
    }
}
class Employee extends Person {
    private String employeeId;
    private int salary;
    Employee(String n, int a, String e, int s) {
        super(n, a); // call super class constructor using super()
        this.employeeId = e;
        this.salary = s;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(name+" is a employee whose,\n Employee id : "+employeeId+"\n Salary : "+salary);
    }
}
public class Qsn_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input for student
        System.out.println("Enter a student's details,");
        System.out.print("Name: ");
        String studentName = input.nextLine();
        System.out.print("Age: ");
        int studentAge = input.nextInt();
        input.nextLine();
        System.out.print("Id: ");
        String studentId = input.nextLine();
        System.out.print("Grade: ");
        int studentGrade = input.nextInt();
        input.nextLine();

        Person student = new Student(studentName, studentAge, studentId, studentGrade);

        // input for employee
        System.out.println("Enter a employee's details,");
        System.out.print("Name: ");
        String employeeName = input.nextLine();
        System.out.print("Age: ");
        int employeeAge = input.nextInt();
        input.nextLine();
        System.out.print("Id: ");
        String employeeId = input.nextLine();
        System.out.print("Salary: ");
        int employeeSalary = input.nextInt();
        input.nextLine();

        Person employee = new Employee(employeeName, employeeAge, employeeId, employeeSalary);

        System.out.println("\n Student's Info,");
        student.displayInfo();

        System.out.println("\n Employee's Info,");
        employee.displayInfo();

        input.close();
    }
}
