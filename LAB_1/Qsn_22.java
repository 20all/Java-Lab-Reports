import java.util.Scanner;

public class Qsn_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the nth number for even numbers: ");
        int n = input.nextInt();
        for(int i = 0; i <= n; i+=2) {
            System.out.printf("%4d",i);
        }
        input.close();
    }
}
