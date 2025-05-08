import java.util.Scanner;
public class Qsn_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Principle:"); 
        int p = input.nextInt();
        System.out.println("Rate(%):");
        double r = input.nextInt();
        System.out.println("Time(yrs):");
        double t = input.nextInt();
        double SI = (p*t*r)/100;
        double amount = p + SI;
        System.out.printf("Simple-Interest: %.2f%nAmount: %.2f%n",SI,amount);
        input.close();
    }
}
