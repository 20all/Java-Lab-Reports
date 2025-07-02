import mathutils.NumberOperations;
import java.util.Scanner;

public class NumberOperationsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        double input = scanner.nextDouble();

        // Create NumberOperations object
        NumberOperations numOps = new NumberOperations(input);

        // Access methods
        System.out.printf("Square of %.2f is: %.2f%n", numOps.getNumber(), numOps.calculateSquare());
        System.out.println("Is " + numOps.getNumber() + " positive? " + (numOps.isPositive() ? "Yes" : "No"));

        scanner.close();
    }
}