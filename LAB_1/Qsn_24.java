import java.util.Scanner;

public class Qsn_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the nth number for odd numbers: ");
        int n = input.nextInt();
        for(int i = 1; i < n; i+=2) {
            System.out.printf("%4d",i);
        }
        input.close();
    }
}
