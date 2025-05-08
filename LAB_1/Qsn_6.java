import java.util.Scanner;
public class Qsn_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length(km):");
        double km = input.nextDouble();
        double m = km * 1000;
        System.out.printf("%f km = %.2f m%n",km,m);
        input.close();
    }
}
