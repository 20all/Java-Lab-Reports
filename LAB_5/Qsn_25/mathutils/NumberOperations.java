package Qsn_25;

public class NumberOperations {
    private double number;
    // constructor
    NumberOperations(double n) {
        this.number = n;
    }

    // method to calculate square
    public double square() {
        return number*number;
    }

    // method to check if the number is positive
    public boolean isPositive() {
        return number > 0;
    }

    // getter 
    public double getNumber() {
        return number;
    }
}
