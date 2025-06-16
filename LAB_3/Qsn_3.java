import java.util.Scanner;

public class Qsn_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the range of prime numbers: ");
        int n = input.nextInt();
        int acc = 0;
        int sum = 0;
        for(int i = 2; i <= n; i++) {
            for(int j = 2; j < i; j++) {
                if(i%j == 0) {
                    acc++;
                    break;
                }
            }
            if(acc > 0) {
                sum +=i;
            }
        }
        System.out.println("sum of prime numbers up to "+n+" is "+sum);
        input.close();
    }
}
