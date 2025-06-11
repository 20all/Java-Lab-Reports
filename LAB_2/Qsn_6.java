import java.util.Scanner;

public class Qsn_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int n = input.nextInt();
        int originalNumber = n;
        int reverse = 0;
        while(n>0) {
            int digits = n % 10;
            reverse = reverse * 10 + digits;
            n/=10;
        }
        if(reverse == originalNumber) {
            System.out.println(originalNumber+" is a palindrome number.");
        } else {
            System.out.println(originalNumber+" isn't a palindrome number!");
        }
        input.close();
    }
}
