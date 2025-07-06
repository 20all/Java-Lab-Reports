import java.util.Scanner;

class Employee {
    private String name;
    private double salary;
    Employee(String n, double s) {
        this.name = n;
        this.salary = s;
    }
    public void to_String() {
        System.out.println("Employee's Name: "+name+" and Salary : "+salary);
    }
}

class Manager extends Employee {
    private String department;
    Manager(String n, double s, String d) {
        super(n, s);
        this.department = d;
    }
    @Override
    public void to_String() {
        super.to_String();
        System.out.println("Department: "+department);
    }
}

class Executive extends Manager {
    Executive(String n, double s, String d) {
        super(n, s, d);
    }
    @Override
    public void to_String() {
        super.to_String();
    }
}
public class Qsn_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter details of employee,");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Salary: ");
        double salary = input.nextDouble();
        input.nextLine();
        System.out.print("Department: ");
        String department = input.nextLine();

        Employee employee = new Executive(name, salary, department);
        System.out.println("\n Employees info:");
        employee.to_String();
        input.close();
    }
}
// ->OUTPUT

// Enter details of employee,
// Name: Bishal
// Salary: 200000
// Department: Backend

//  Employees info:
// Employee's Name: Bishal and Salary : 200000.0
// Department: Backend