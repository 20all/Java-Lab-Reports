import java.util.Scanner;

abstract class Shape {
    protected String name;
    // constructor
    Shape(String n) {
        this.name = n;
    }
    // abstract method
    public abstract double calculateArea();
    // concrete method
    public void displayInfo() {
        System.out.printf("Shape : %s , Area : %.2f%n",name, calculateArea());
    }
}
// concrete class extending abstract class Shape
class Rectangle extends Shape {
    private double length;
    private double bredth;
    // constructor
    public Rectangle(String n, double l, double b) {
        super(n);
        this.length = l;
        this.bredth = b;
    }
    @Override
    public double calculateArea() {
        return length * bredth;
    }
}
// concrete class Circle extending abstract class Shape
class Circle extends Shape {
    private double radius;
    // constructor 
    Circle(String n, double r) {
        super(n);
        this.radius = r;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
public class Qsn_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input for Rectangle 
        System.out.println("Enter the details of Rectangle:");
        System.out.print("Length: ");
        double length = input.nextDouble();
        System.out.print("Bredth: ");
        double bredth = input.nextDouble();
        Shape rectangle = new Rectangle("RECTANGLE",length , bredth);

        // input for Circle
        System.out.println("Enter the detail of Circle:");
        System.out.print("Radius: ");
        double radius = input.nextDouble();
        Shape circle = new Circle("CIRCLE", radius);

        // Displaying Information 
        System.out.println("INFO of the Shapes");
        rectangle.displayInfo();
        circle.displayInfo();
        input.close();
    }
}
