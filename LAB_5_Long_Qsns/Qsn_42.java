import java.util.Scanner;

class Box {
    private double length, bredth, height;
    Box(double l, double b, double h) {
        this.length = l;
        this.bredth = b;
        this.height = h;
    }
    public double getVolume() {
        return length * bredth * height;
    }
}

class BoxWeight extends Box {
    private double weight;
    BoxWeight(double l, double b, double h, double w) {
        super(l, b, h);
        setWeight(w);
    }
    private void setWeight(double w) {
        this.weight = w;
    }
    public void getWeight() {
        System.out.println("Weight : "+weight+" kg");
    }
}
public class Qsn_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the details of Box,");
        System.out.print("Length: ");
        double length = input.nextDouble();
        System.out.print("Bredth: ");
        double bredth = input.nextDouble();
        System.out.print("Height: ");
        double heigth = input.nextDouble();
        System.out.print("Weigth: ");
        double weigth = input.nextDouble();

        BoxWeight box = new BoxWeight(length, bredth, heigth, weigth);
        BoxWeight box1 = new BoxWeight(2.5, 2, 1.9, 9.1);

        System.out.println("\n Box details,");
        System.out.printf("First Object's volume = %.2f%n",box.getVolume());
        box.getWeight();
        System.out.printf("Second Object's volume = %.2f%n",box1.getVolume());
        box1.getWeight();
        input.close();
    }
}
// -> OUTPUT
// Enter the details of Box,
// Length: 4.5
// Bredth: 2.2
// Height: 3
// Weigth: 10

//  Box details,
// First Object's volume = 29.70
// Weight : 10.0 kg
// Second Object's volume = 9.50
// Weight : 9.1 kg