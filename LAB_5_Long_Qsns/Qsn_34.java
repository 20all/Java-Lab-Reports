import java.util.Scanner;

class Member {
    private String name;
    private int age;
    private String phone;
    private String address;
    private double salary;
    public void setMemberDetails(String n, int a, String p, String add, double s) {
        this.name = n;
        this.age = a;
        this.phone = p;
        this.address = add;
        this.salary = s;
    }
    public void printMemberDetails() {
        System.out.printf("Member Name: %s\nAge: %d\nPhone_no.: %s\nAddress: %s\n,Salary: %.2f\n",name,age,phone, address, salary);
    }
}

class Employee extends Member {
    private String specialization;
    Employee(String s) {
        this.specialization = s;
    }
    private void printSpecialization() {
        System.out.println("Specialization: "+specialization);
    }
    @Override
    public void printMemberDetails() {
        super.printMemberDetails();
        printSpecialization();
    }
}

class Manager_ extends Member {
    private String department;
    private String specialization;
    Manager_(String s) {
        this.specialization = s;
    }
    private void printSpecialization() {
        System.out.println("Specialization: "+specialization);
    }
    public void setDepartment(String d) {
        this.department = d;
    }
    public void printDepartment() {
        System.out.println("Department: "+department);
    }
    @Override
    public void printMemberDetails() {
        super.printMemberDetails();
        printSpecialization();
        printDepartment();
    }
}
public class Qsn_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the employee's details,");
        System.out.print("Name: ");
        String empName = input.nextLine();
        System.out.print("Age: ");
        int empAge = input.nextInt();
        input.nextLine();
        System.out.print("Phone No.: ");
        String empPhone = input.nextLine();
        System.out.print("Address: ");
        String empAddress = input.nextLine();
        System.out.print("Salary: ");
        double empSalary = input.nextDouble();
        input.nextLine();
        System.out.print("Specialization: ");
        String empSpecialization = input.nextLine();
        
        Employee employee = new Employee(empSpecialization);
        employee.setMemberDetails(empName, empAge, empPhone, empAddress, empSalary);

        System.out.println("Enter the Manager's details,");
        System.out.print("Name: ");
        String managerName = input.nextLine();
        System.out.print("Age: ");
        int managerAge = input.nextInt();
        input.nextLine();
        System.out.print("Phone No.: ");
        String managerPhone = input.nextLine();
        System.out.print("Address: ");
        String managerAddress = input.nextLine();
        System.out.print("Salary: ");
        double managerSalary = input.nextDouble();
        input.nextLine();
        System.out.print("Specialization: ");
        String managerSpecialization = input.nextLine();
        System.out.print("Department: ");
        String managerDepartment = input.nextLine();

        Manager_ manager_ = new Manager_(managerSpecialization);
        manager_.setMemberDetails(managerName, managerAge, managerPhone, managerAddress, managerSalary);
        manager_.setDepartment(managerDepartment);

        System.out.println("\n Employee details,");
        employee.printMemberDetails();

        System.out.println("\n Manager details,");
        manager_.printMemberDetails();

        input.close();
    }
}
 
// -> OUTPUT
// Enter the employee's details,
// Name: Bishal
// Age: 18
// Phone No.: 9817951598
// Address: Buddhashanti
// Salary: 50000
// Specialization: Backend with Kafka(java)
// Enter the Manager's details,
// Name: 20al
// Age: 20
// Phone No.: 9898989898
// Address: Unknown
// Salary: 150000
// Specialization: AI expert
// Department: AI

//  Employee details,
// Member Name: Bishal
// Age: 18
// Phone_no.: 9817951598
// Address: Buddhashanti
// ,Salary: 50000.00
// Specialization: Backend with Kafka(java)

//  Manager details,
// Member Name: 20al
// Age: 20
// Phone_no.: 9898989898
// Address: Unknown
// ,Salary: 150000.00
// Specialization: AI expert
// Department: AI