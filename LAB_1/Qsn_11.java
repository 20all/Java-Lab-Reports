import java.util.Scanner;

public class Qsn_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] students = new int[5];
        System.out.println("Enter the marks(5 subjects):");
        for(int i=0; i<students.length; i++) {
            students[i] = input.nextInt();
        }
        // for(int s: students) {
        //     students[s] = input.nextInt();
        // }
        int total = 0;
        System.out.println("output");
        for(int i: students) {
            total += i;
        }
        float percentage = total * 100 / (100 * students.length);
        System.out.println("Total marks obtained: "+total);
        System.out.println("Percentage obtained: "+percentage);
        boolean isPass = (percentage >= 40)? true : false;
        System.out.print("Result: ");
        if(isPass){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        input.close();
    }
}
