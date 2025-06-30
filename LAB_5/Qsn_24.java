class Computer {
    private String brand;
    Computer(String b) {
        this.brand = b;
    }
    // stativ nested class
    static class Processor {
        private String model;
        private double speed;
        Processor(String m, double s) {
            this.model = m;
            this.speed = s;
        }
        public void diaplayProcessorInfo() {
            System.out.printf("Processor:  Speed : %.2f, Model : %s%n",model, speed);
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
        public void displayComputerInfo() {
            System.out.printf("RAM: %s and size : %d GB(for %s computer)%n",type, size);
        }
    }
    // method to create and return an inner class instance
    public RAM createRAM(int s, String t) {
        return RAM(s,t);
    }
}
public class Qsn_24 {
    public static void main(String[] args) {
        
    }
}
