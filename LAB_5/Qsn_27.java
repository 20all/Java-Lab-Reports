// base interface

import java.util.Scanner;

interface Polygon {
    void draw();
    double area();
}

// extended interface
interface ColoredPolygon extends Polygon {
    void setColor(String color);
    String getColor();
}

// class implementing the extended interface
class Triangle implements ColoredPolygon {
    private double height;
    private double base;
    private String color;
    Triangle(double h, double b) {
        this.height = h;
        this.base = b;
        this.color = "None";
    }
    
    // implementing Polygon interface methods
    @Override
    public void draw() {
        System.out.println("Drawing a triangle with height "+height+" base "+base+" and color "+color);
    }
    @Override
    public double area() {
        return (height * base) / 2;
    }

    // implementing ColoredPolygon methods
    @Override
    public void setColor(String c) {
        this.color = c;
    }
    @Override
    public String getColor() {
        return color;
    }
}
public class Qsn_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the info of Triangle,");
        System.out.print("Height: ");
        double height = input.nextDouble();
        input.nextLine();
        System.out.print("base: ");
        double base = input.nextDouble();
        input.nextLine();
        System.out.print("Color: ");
        String triangleColor = input.nextLine();
        ColoredPolygon triangle = new Triangle(height, base);
        triangle.setColor(triangleColor);
        System.out.println("\nPolygon operations:");
        triangle.draw();
        System.out.printf("Triangle area : %.2f , Color : %s %n",triangle.area(), triangle.getColor());
        input.close();
    }
}
