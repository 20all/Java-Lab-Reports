import java.util.Scanner;

public class Qsn_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int number = input.nextInt();
        boolean isPositive = (number >= 0) ? true : false;
        if(isPositive) {
            System.out.printf("%d is positive.\n",number);
        } else {
            System.out.printf("%d is negative.\n",number);
        }
        input.close();
    }
}
