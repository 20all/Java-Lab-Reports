import java.util.Scanner;

public class Qsn_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number: ");
        int n = input.nextInt();
        long factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of "+n+" = "+factorial);
        input.close();
    }
}
