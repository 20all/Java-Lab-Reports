import java.util.Scanner;

class MathUtility {
    private int value;
    MathUtility(int v) {
        this.value = v;
    }
    // static method to calculate factorial
    public static long calculateFactorial(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers!");
        }
        if(n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for(int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    // static method to calculate power
    public static double calculatePower(double base, int poewr) {
        double result = 1.0;
        int absoutePower = (poewr < 0) ? -poewr : poewr;
        for(int i = 1; i <= absoutePower; i++) {
            result *= base;
        }
        return (poewr < 0) ? 1.0 / result : result;
    }

    // static method to check if a number is even 
    public static boolean isEven(int n) {
        return (n % 2 == 0) ? true : false;
    }

    // static method to compare with instance variable
    public boolean isGreaterThanValue(int n) {
        return n > value;
    }

    // getter
    public int getValue() {
        return value;
    }
}
public class Qsn_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // using static methods without creating objects
        System.out.print("Enter a number to calculate factorial: ");
        int num = input.nextInt();
        try {
            System.out.println("Factorial of "+num+" is: "+MathUtility.calculateFactorial(num));
        } catch(IllegalArgumentException e) {
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println("Enter base and power for calculating power(eg 2 and 3 for 2 to power 3):");
        double base = input.nextDouble();
        int power = input.nextInt();
        System.out.printf("%.2f to the power %d = %.2f%n",base, power, MathUtility.calculatePower(base, power));

        System.out.print("Enter a number to check if its even or odd: ");
        int evenNumber = input.nextInt();
        System.out.println(evenNumber+" is "+(MathUtility.isEven(evenNumber) ? "Even" : "Odd"));


        // using non-static method (requires creation of object)
        System.out.print("\n Enter value for MathUtility instance: ");
        int value = input.nextInt();
        MathUtility utility = new MathUtility(value);

        System.out.print("Enter a number to compare with instance value("+value+"): ");
        int compare = input.nextInt();
        System.out.println(compare+" is "+(utility.isGreaterThanValue(compare) ? "greater than" : "not greater than")+" "+utility.getValue());
        input.close();
    }
}