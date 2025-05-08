import java.util.*;
public class Qsn_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        // System.out.println("Area: "+area);
        // System.out.println("Circumference: "+circumference);
        // using printf for reducin the ouput to 2 decimal places          
        System.out.printf("Area: %.2f%n",area);
        System.out.printf("Circumference: %.2f\n",circumference);// here i have used '\n' and '%n' interchangably since both works as newline character but %n is more portable
        input.close();
    }
}
