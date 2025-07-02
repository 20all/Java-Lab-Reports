import java.util.Scanner;

class Computer {
    private String brand;
    Computer(String b) {
        this.brand = b;
    }
    // static nested class
    static class Processor {
        private String model;
        private double speed;
        Processor(String m, double s) {
            this.model = m;
            this.speed = s;
        }
        public void diaplayProcessorInfo() {
            System.out.printf("Processor: %s, Speed : %.2f%n",model, speed);
        }
    }
    // non-static nested class
    class RAM {
        private int size;
        private String type;
        RAM(int s, String t) {
            this.size = s;
            this.type = t;
        }
        public void displayRamInfo() {
            System.out.printf("RAM: %s and size : %d GB(for %s computer)%n",type, size, brand);
        }
    }
    // method to create and return an inner class instance
    public RAM createRAM(int s, String t) {
        return new RAM(s,t);
    }

    // method to display computer brand
    public void displayComputerInfo() {
        System.out.println("Computer Brand: "+ brand);
    }
}
public class Qsn_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Computer brand: ");
        String brandName = input.nextLine();

        // creating Computer object
        Computer computer = new Computer(brandName);

        // 1. using static nested class(Processor)
        System.out.println("Enter processsor's");
        System.out.print("Model: ");
        String modelName = input.nextLine();
        System.out.print("Speed: ");
        double speed = input.nextDouble();
        input.nextLine(); // clear buffer
        Computer.Processor processor = new Computer.Processor(modelName, speed);

        // 2. using non-static inner class(RAM)
        System.out.print("Enter RAM size(GB): ");
        int ramSize = input.nextInt();
        input.nextLine(); // clear buffer 
        System.out.print("Enter RAM type(eg: DDR4, DDR5): ");
        String ramType =  input.nextLine();
        Computer.RAM ram = computer.createRAM(ramSize, ramType);

        // Displaying information:
        System.out.println(" \n COMPUTER INFORMATION:");
        computer.displayComputerInfo();
        processor.diaplayProcessorInfo();
        ram.displayRamInfo();

        input.close();
    }
}
