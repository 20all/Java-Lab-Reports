import java.util.Scanner;

public class Qsn_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noOfStudents = 65;
        System.out.println("Enter the marks obtained in C of "+noOfStudents+" students:");
        int[] marks = new int[noOfStudents];
        for(int i = 0; i < noOfStudents; i++) {
            marks[i] = input.nextInt();
        }
        int heighest = marks[0];
        int lowest = marks[0];
        for(int e : marks) {
            if(e < lowest) {
                lowest = e;
            }
            if(e > heighest) {
                heighest = e;
            }
        }
        System.out.println("Heighest marks obtained: "+heighest);
        System.out.println("Lowest marks obtained: "+lowest);
        input.close();
    }
}
