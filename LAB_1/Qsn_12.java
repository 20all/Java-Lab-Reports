import java.util.Scanner;

public class Qsn_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no of Days:");
        int days = input.nextInt();
        int months = days / 30;
        int rDays = days % 30;
        System.out.println(days+"Days = "+months+" Months and "+rDays+" days");
        input.close();
    }
}
