package mathutils;

public class NumberOperations {
    private double number;

    // Constructor
    public NumberOperations(double number) {
        this.number = number;
    }

    // Method to calculate square
    public double calculateSquare() {
        return number * number;
    }

    // Method to check if number is positive
    public boolean isPositive() {
        return number > 0;
    }

    // Getter for number
    public double getNumber() {
        return number;
    }
}