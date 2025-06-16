import java.util.Scanner;

public class Qsn_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int n = input.nextInt();
        int acc = 0;
        for(int i = 2; i < n; i++) {
            if(n%i == 0) {
                acc++;
                break;
            }
        }
        boolean isPrime = (acc == 1) ? false : true;
        if(isPrime) {
            System.out.println(n+" is prime.");
        } else {
            System.out.println(n+" is not prime.");
        }
        input.close();
    }
}
