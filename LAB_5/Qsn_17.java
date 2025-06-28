import java.util.Scanner;
class Power {
    private double base;
    private int exponent;
    // constructor
    Power(double b, int e) {
        this.base = b;
        this.exponent = e;
    }
    //method for calculating power
    public double calculatePower() {
        // handling the '0' power case
        if(exponent == 0) {
            return 1.0;
        }
        double result = 1.0;
        int absoluteExponent = (exponent < 0) ? -exponent : exponent; // converting -ve to +ve for perfect iteration
        // int absoluteExponent = Math.abs(exponent);
        for(int i = 1; i <= absoluteExponent; i++) {
            result *= base;
        }
        // if the exponent is -ve then it should be 1/result
        if(exponent < 0) { 
            result = 1.0 / result;
        }
        return result;
    }
    }
public class Qsn_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base(x): ");
        double x = input.nextDouble();
        System.out.print("Enter the exponent(n): ");
        int n = input.nextInt();
        Power power = new Power(x, n);
        double result = power.calculatePower();
        System.out.printf("%.2f to the power %d is %.2f%n",x,n,result);
        input.close();
    }
}


