import java.util.Scanner;

class Animal {
    private String name;
    // constructor
    Animal(String n) {
        this.name = n;
    }

    // method for dynamic binding(overriding)
    public void makeSound() {
        System.out.println(name+" makes a generic animal sound.");
    }

    // method for static binding(overloading) 
    public void describe() {
        System.out.println("This is "+name+", an animal.");
    }

    // method with different paremeter
    public void describe(String charecteristics) {
        System.out.println("This is "+name+" an animal that is "+charecteristics+".");
    }

    // getter
    public String getName() {
        return name;
    }
}
class Dog extends Animal {
    Dog(String n) {
        super(n);
    }
    // override method for dynamic binding
    @Override 
    public void makeSound() {
        System.out.println(getName()+" barks: Woof!");
    }

    @Override
    public void describe() {
        System.out.println("This  is "+getName()+", a dog.");
    }
}
class Cat extends Animal {
    Cat(String n) {
        super(n);
    }
    // override method for dynamic binding  
    @Override
    public void makeSound() {
        System.out.println(getName()+" meows: Meow!");
    }
    @Override
    public void describe() {
        System.out.println("This is "+getName()+", a cat.");
    }
}
public class Qsn_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input for animal names
        System.out.print("Enter name for a dog: ");
        String d = input.nextLine();
        System.out.print("Enter name for a cat: ");
        String c = input.nextLine();

        // creating objects
        Animal genericAnimal = new Animal("Generic");
        Animal dog = new Dog(d);
        Animal cat = new Cat(c);

        // static binding
        System.out.println("\n Static Binding Method:");
        genericAnimal.describe();
        genericAnimal.describe("wild");

        // dynamic binging
        System.out.println("\n Dynamic Binding Method:");
        System.out.println("Generic Animal:");
        genericAnimal.makeSound();
        genericAnimal.describe();

        System.out.println("\nDog:");
        dog.makeSound(); // Calls Dog's makeSound()
        dog.describe(); // Calls Dog's describe()

        System.out.println("\nCat:");
        cat.makeSound(); // Calls Cat's makeSound()
        cat.describe(); // Calls Cat's describe()
        input.close();
    }
}
