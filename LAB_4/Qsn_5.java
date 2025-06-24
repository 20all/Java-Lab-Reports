import java.util.Scanner;

public class Qsn_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter the no. of employees:");
        n= input.nextInt();
        int[] employees = new int[n];
        for(int i = 0; i < employees.length; i++) {
            employees[i] = input.nextInt();
        }
        int count = 0;
        for(int e : employees) {
            if(e >  20000) {
                count++;
            }
        }
        System.out.println("No. of employees receiving salary above 20000 is "+count);
        input.close();
    }
}
