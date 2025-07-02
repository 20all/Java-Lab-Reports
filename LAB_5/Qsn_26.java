// interface definition

import java.rmi.dgc.Lease;
import java.util.Scanner;

interface Draw {
    void draw(); // abstract method for drawing the shape
    String getDescription(); // abstract method for describing the shape
}

// class implementing the Draw interface
class Circle implements Draw {
    private double radius;
    Circle(double r) {
        this.radius = r;
    }
    @Override 
    public void draw() {
        System.out.println("Drawing a circle with radius "+radius);
    }
    @Override
    public String getDescription() {
        return "Circle with radius " + radius+ "and Area "+String.format("%.2f", area());
    }
    // helper method for area calculation
    private double area() {
        return Math.PI * radius * radius;
    }
}
 
// class Rectangle implementing Draw interface
class Rectangle implements Draw {
    private double length;
    private double bredth;
    Rectangle(double l, double b) {
        this.length = l;
        this.bredth = b;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length "+length+" and bredth "+bredth);
    }
    @Override
    public String getDescription() {
        return "Rectangle with length "+length+" and bredth :"+bredth+" , and area "+String.format("%.2f",area());
    }
    private double area() {
        return length*bredth;
    }
}
public class Qsn_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // circle
        System.out.print("Enter radius for circle: ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);

        // rectangle
        System.out.println("Enter Rectangle's info,");
        System.out.print("Length: ");
        double l = input.nextDouble();
        System.out.print("Bredth: ");
        double b = input.nextDouble();
        Rectangle rectangle = new Rectangle(l, b);

        // 
        System.out.println("\n Drawing shapes");
        circle.draw();
        rectangle.draw();

        System.out.println("Shape Description:");
        System.out.println(circle.getDescription());
        System.out.println(rectangle.getDescription());

        input.close();
    }
}
