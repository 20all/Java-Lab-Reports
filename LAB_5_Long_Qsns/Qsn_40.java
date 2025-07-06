import java.util.Scanner;

interface Shape {
    public void get_data(double x, double y);
    public void display_area();
}

class Rectangle implements Shape {
    private double length;
    private double bredth;
    Rectangle(double l, double b) {
        // this.length = l;
        // this.bredth = b;
        get_data(l, b);
    }
    @Override
    public void get_data(double l, double b) {
        this.length = l;
        this.bredth = b;
    }
    private double calculateArea() {
        return length * bredth;
    }
    @Override
    public void display_area() {
        System.out.printf("Area of Rectangle with length %.2f and bredth %.2f = %.2f%n",length, bredth, calculateArea());
    }
}

class Square implements Shape {
    private double length;
    Square(double l) {
        get_data(l, l);
    }
    @Override
    public void get_data(double l, double b) {
        this.length = l = b;
    }
    private double calculateArea() {
        return length * length;
    }
    @Override
    public void display_area() {
        System.out.printf("Area of Square of length %.2f = %.2f%n",length, calculateArea());
    }
}
public class Qsn_40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Rectangle's details,");
        System.out.print("length: ");
        double length = input.nextDouble();
        System.out.print("bredth: ");
        double bredth = input.nextDouble();
        Rectangle rectangle = new Rectangle(length, bredth);

        System.out.println("Enter Square's details,");
        System.out.print("length: ");
        double l = input.nextDouble();
        Square square = new Square(l);

        System.out.println("\n Shape's Info:");
        rectangle.display_area();
        square.display_area();
        input.close();
    }
}
// -> OUTPUT
// Enter Rectangle's details,
// length: 4
// bredth: 3
// Enter Square's details,
// length: 3

//  Shape's Info:
// Area of Rectangle with length 4.00 and bredth 3.00 = 12.00
// Area of Square of length 3.00 = 9.00