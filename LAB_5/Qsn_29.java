import java.util.Scanner;

class Pencil {
    protected String brand;
    Pencil(String b) {
        this.brand = b;
    }
    // method to be overritten
    public void startWriting() {
        System.out.println("Writing started via Pencil of "+brand);
    }
    // method to display info of pencil
    public void displayInfo() {
        System.out.println("Pencil: "+brand);
    }
}
class RegularPencil extends Pencil {
    RegularPencil(String b) {
        super(b);
    }
    // override startWriting for dynamic dispatch
    @Override
    public void startWriting() {
        System.out.println("Pencil of brand "+brand+" Started writing letters.");
    }
    // override displayInfo
    @Override
    public void displayInfo() {
        System.out.println("Regular Pencil "+brand+"(withour color)");
    }
}
class ColorPencil extends Pencil {
    ColorPencil(String b) {
        super(b);
    }
    // overriding startWriting for dynamic dispatch
    @Override
    public void startWriting() {
        System.out.println("Color Pencil of "+brand+" started writing letters.");
    }
    // override displayInfo
    @Override
    public void displayInfo() {
        System.out.println("Color pencil "+brand+"(with color)");
    }
}
public class Qsn_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter brand for Normal pencil: ");
        String brandRegularPencil = input.nextLine();
        System.out.print("Enter brand for Color pencil: ");
        String brandColorPencil = input.nextLine();

        Pencil pencil = new Pencil("Unknown");
        Pencil regularPencil = new RegularPencil(brandRegularPencil);
        Pencil colorPencil = new ColorPencil(brandColorPencil);

        System.out.println("\nDemonstrating Dynamic Dispatch:");

        System.out.println("\n Normal pencil,");
        pencil.displayInfo();
        pencil.startWriting();

        System.out.println("\n Regular Pencil,");
        regularPencil.displayInfo();
        regularPencil.startWriting();

        System.out.println("\n Color Pencil,");
        colorPencil.displayInfo();
        colorPencil.startWriting();
        input.close();
    }
}
