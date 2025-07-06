import java.util.Scanner;

abstract class FMachine {
    abstract void getData();
    abstract void putData(String c, String n, double cp);
}

class Airplane extends FMachine {
    private String code;
    private String name;
    private double capacity;
    @Override
    void putData(String c, String n, double cap) {
        this.code = c;
        this.name = n;
        this.capacity = cap;        
    }
    @Override
    public void getData() {
        System.out.println("Code : "+code);
        System.out.println("Name: "+name);
        System.out.println("Capacity: "+capacity    );
    }
}
public class Qsn_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the details of airplane,");
        System.out.print("Code: ");
        String code = input.nextLine();
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Capacity: ");
        double capacity = input.nextDouble();

        System.out.println("\n Instance 1,");
        FMachine airplane = new Airplane();
        airplane.putData(code, name, capacity);
        airplane.getData();

        System.out.println("\n Instance 2,");
        Airplane airplane1 = new Airplane();
        airplane1.putData("code", "name", 0);
        airplane1.getData();
        input.close();
    }
}
// -> OUTPUT
// Enter the details of airplane,
// Code: 0000
// Name: Yeti airlines
// Capacity: 50

//  Instance 1,
// Code : 0000
// Name: Yeti airlines
// Capacity: 50.0

//  Instance 2,
// Code : code
// Name: name
// Capacity: 0.0