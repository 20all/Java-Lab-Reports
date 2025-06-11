import java.util.Scanner;

public class Qsn_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int number = input.nextInt();
        boolean isEven = (number % 2 == 0) ? true : false;
        if(isEven) {
            System.out.printf("%d is Even.\n",number);
        } else {
            System.out.printf("%d is Odd.\n",number);
        }     
        input.close();
    }
}
