class Vehicle {
    public void move() {
        System.out.println("The vehicle is moving.");
    }
    public void describe() {
        System.out.println("This is a generic vehicle/.");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The car is driving on the road.");
    }
    @Override
    public void describe() {
        System.out.println("The is a car with four wheels.");
    }
}

class Bycycle extends Vehicle {
    @Override
    public void move() {
        System.out.println("The bycycle is pedaling on the path.");
    }
    @Override
    public void describe() {
        System.out.println("This is a bycycle with two wheels.");
    }
}
public class Qsn_19_2 {
    public static void main(String[] args) {
        // creating objects of Vehicle, Car and Bycycle
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car(); // polymorphic reference
        Vehicle bycycle = new Bycycle(); // polymorphic reference

        // calling methods to demonstrate overriding
        System.out.println("Calling methods on Vehile object:");
        vehicle.move();
        vehicle.describe();

        System.out.println("\nCalling methods on Car object(polymorphic): ");
        car.move(); // calls car's overriden method
        car.describe(); // calls car's overriden method

        System.out.println("\nCalling methods on Bycycle object(polymorphic): ");
        bycycle.move(); // calls bycycle's overriden method
        bycycle.describe(); // calls bycycle's overriden method
    }
}
