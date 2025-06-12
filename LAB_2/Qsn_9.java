import java.util.Scanner;

public class Qsn_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        System.out.println("What do you want to calculate?");
        System.out.println("1: Area");
        System.out.println("2: Circumference");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Area = "+(3.14*radius*radius));
                break;
            case 2:
                System.out.println("Circumference = "+(2*3.14*radius));
                break;
            default:
                System.out.println("Enter a valid choice (1 or 2)!");
                break;
        }
        input.close();
    }
}
