import java.util.Arrays;
import java.util.Scanner;

abstract class Student {
    protected String name;
    protected String studentId;
    protected double[] marks;
    Student(String n, String s, double[] m) {
        this.name = n;
        this.studentId = s;
        this.marks = m;
    }
    public abstract double calculateAverage();
    public void studentInfo() {
        System.out.printf("%s is a student whose,\n Student-Id : %d \n Average-Marks : %.2f%n",name,studentId,calculateAverage());
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return studentId;
    }
}

class ComputerScience extends Student {
    private String[] subjects = {"DSA", "SAD", "Web", "DBMS"};
    private double[] csMarks = new double[subjects.length];
    ComputerScience(String n, String s, double[] csM) {
        super(n, s, csM);
    }
    @Override
    public double calculateAverage() {
        double sum = 0.0;
        for(double e : csMarks) {
            sum += e;
        }
        return sum / csMarks.length;
    }
    @Override
    public void studentInfo() {
        System.out.println("Name: "+name);
        System.out.println("Subjects: "+Arrays.toString(subjects));
        System.out.println("Marks Obtained: "+Arrays.toString(csMarks));
        super.studentInfo();
    }
}

class Mathematics extends Student {
    public String[] subjects = {"Probability", "Stastics", "Calculus", "Linear_alzebra"};
    private double[] mMarks = new double[subjects.length];
    Mathematics(String n, String s, double[] mM) {
        super(n, s, mM);
    }
    @Override
    public double calculateAverage() {
        double sum = 0.0;
        for(double e : mMarks) {
            sum += e;
        }
        return sum / mMarks.length;
    }
    @Override
    public void studentInfo() {
        System.out.println("Name: "+name);
        System.out.println("Subjects: "+Arrays.toString(subjects));
        System.out.println("Marks Obtained: " +Arrays.toString(mMarks));
        super.studentInfo();
    }
}
public class Qsn_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Computer Science students: ");
        int numberOfCsStudents = input.nextInt();
        input.nextLine();
        for(int i = 0; i < numberOfCsStudents; i++) {
            System.out.printf("Enter details for Computer science student %d%n",i+1);
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Id: ");
            int sId = input.nextInt();
            input.nextLine();
            for(int j = 0; i < 4; i++) {
                
            }
        }

        System.out.print("Enter number of Mathematics students: ");
        int numberOfMStudents = input.nextInt();
        input.nextLine();
        input.close();
    } 
}