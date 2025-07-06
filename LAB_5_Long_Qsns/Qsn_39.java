import java.util.Arrays;
import java.util.Scanner;

class Student_ {
    private int rollNo;
    public void readRollNo(int rN) {
        this.rollNo = rN;
    }
    public void displayRollNo() {
        System.out.println("Roll_No.: "+rollNo);
    }
}

class Test extends Student_ {
    private int size;
    protected int[] marks = new int[size];
    Test(int s, int[] m) {
        this.size = s;
        this.marks = m;
    }
    public void readMarks(int[] m) {
        this.marks = m;
    }
    public void displayMarks() {
        System.out.println("Marks : "+Arrays.toString(marks));
    }
}

class Result extends Test {
    Result(int s, int[] m) {
        super(s, m);
    }
    private int totalMarks;
    private int calculateTotal() {
        int sum = 0;
        for(int i : marks) {
            sum += i;
        }
        return sum;
    }

    public void displaySum() {
        totalMarks = calculateTotal();
        System.out.println("Total Marks = "+totalMarks);
    }
}
public class Qsn_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many subjects? ->");
        int size = input.nextInt();
        System.out.print("Enter roll_no: ");
        int rollNo = input.nextInt();
        System.out.println("Enter the marks obtained in " +size+" subjects: ");
        int[] marks = new int[size];
        for(int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }

        Result result = new Result(size, marks);
        result.readRollNo(rollNo);
        // displaying the information gathered
        result.displayRollNo();
        result.displayMarks();
        result.displaySum();

        input.close();
    }
}
// -> OUTPUT
// How many subjects? ->2
// Enter roll_no: 21
// Enter the marks obtained in 2 subjects: 
// 100
// 99
// Roll_No.: 21
// Marks : [100, 99]
// Total Marks = 199