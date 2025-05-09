import java.util.Scanner;

public class Qsn_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Centigrade:");
        double c = input.nextDouble();
        double f = 9.0/5*c+32;
        System.out.printf("Fahrenheit: %.2f%n",f);
        input.close();
    }
}
