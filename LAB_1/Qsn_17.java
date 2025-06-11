import java.util.Scanner;

public class Qsn_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Give the C.P.: ");
        double cp = input.nextDouble();
        System.out.printf("Give the S.P.: ");
        double sp = input.nextDouble();
        boolean isProfit = (sp > cp) ? true : false;
        if(isProfit) {
            System.out.println("Profit!");
        } else {
            System.out.println("Loss!");
        }
        input.close();
    }
}
