import java.util.Scanner;

public class Qsn_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number for table: ");
        int n = input.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
        input.close();
    }
}
