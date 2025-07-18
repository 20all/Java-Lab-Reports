class Animal {
    private String name;
    private int age;
    Animal(String n, int a) {
        this.name = n;
        this.age = a;
    }
    public void makeSound() {
        System.out.println("Animals make sound.....");
    }
    public int getAge() {
        return age;
    }
}

class Lion extends Animal {
    Lion(String n, int a) {
        super(n, a);
    }
    @Override
    public void makeSound() {
        System.out.println("Lions make sound.");
    }
}

class Tiger extends Animal {
    Tiger(String n, int a) {
        super(n, a);
    }
    @Override
    public void makeSound() {
        System.out.println("Tigers make sound.");
    }
}

class Giraffe extends Animal {
    Giraffe(String n, int a) {
        super(n, a);
    }
    @Override
    public void makeSound() {
        System.out.println("Giraffe make sound.");
    }
}

class Zebra extends Animal {
    Zebra(String n, int a) {
        super(n, a);
    }
    @Override
    public void makeSound() {
        System.out.println("Zebras make sound.");
    }
}
public class Qsn_43 {
    public static void main(String[] args) {
        Animal animal = new Animal("animal", 1);
        Animal lion = new Lion("lion", 5);
        Animal tiger = new Tiger("tiger", 7);
        Animal giraffe = new Giraffe("giraffe", 2);
        Animal zebra = new Zebra("zebra", 5);

        animal.makeSound();
        System.out.println("Age : "+animal.getAge());
        lion.makeSound();
        tiger.makeSound();
        giraffe.makeSound();
        zebra.makeSound();
    }
}
// -> OUTPUT
// Animals make sound.....
// Age : 1
// Lions make sound.
// Tigers make sound.
// Giraffe make sound.
// Zebras make sound.