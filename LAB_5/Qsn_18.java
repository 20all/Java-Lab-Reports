
public class Qsn_18 {
    public static void main(String[] args) {
        
    }
}


import java.util.Scanner;

class Power {
    private double base;
    private int exponent;
    
    // Constructor
    public Power(double base, int exponent) {
        this.base = base;
        this.exponent = exponent;
    }
    
    // Method to calculate power
    public double calculatePower() {
        // Handle edge cases
        if (exponent == 0) {
            return 1.0;
        }
        
        double result = 1.0;
        int absExponent = Math.abs(exponent);
        
        // Calculate power using iterative multiplication
        for (int i = 1; i <= absExponent; i++) {
            result *= base;
        }
        
        // Handle negative exponent
        if (exponent < 0) {
            result = 1.0 / result;
        }
        
        return result;
    }
}

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input base
        System.out.print("Enter the base (x): ");
        double x = scanner.nextDouble();
        
        // Input exponent
        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();
        
        // Create Power object
        Power power = new Power(x, n);
        
        // Calculate and display result
        double result = power.calculatePower();
        System.out.println(x + " raised to the power " + n + " is: " + result);
        
        scanner.close();
    }
}