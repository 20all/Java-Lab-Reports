import java.util.Scanner;

public class Qsn_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int n = input.nextInt();
        System.out.printf("Reverse: ");
        while(n>0) {
            System.out.printf("%d",n%10);
            n/=10;
        }
        input.close();
    }
}