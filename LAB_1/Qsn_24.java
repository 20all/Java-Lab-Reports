import java.util.Scanner;

public class Qsn_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the nth number for odd numbers: ");
        int n = input.nextInt();
        int p = 1;
        for(int i = 1; i <= n; i+=2) {
            System.out.printf("%2d *",i);
            p*=i;
        }
        System.out.println(" = "+p);
        input.close();
    }
}
