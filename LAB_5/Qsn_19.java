import java.util.Arrays;
import java.util.Scanner;

class Calculator {
    private double result;
    // constructor
    Calculator() {
        this.result = 0.0;
    }
    // overloaded method : add two integers
    public int add(int n1, int n2) {
        result = n1 + n2;
        return (int) result;
    }
    // overloded method : add three integers
    public int add(int n1, int n2, int n3) {
        result = n1 + n2 + n3;
        return (int) result;
    }
    // overloaded method: add two doubles
    public double add(double n1, double n2) {
        result = n1 + n2;
        return result;
    }
    // overloaaded method: add array of integers
    public int add(int[] numbers) {
        result = 0;
        for(int n : numbers) {
            result += n;
        }
        return (int) result;
    }
    // method to get result
    public double getResult() {
        return result;
    }
}
public class Qsn_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();
        // Adding two integers:
        System.out.println("Enter any two integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int addition1 = calculator.add(n1, n2);
        System.out.printf("%d + %d = %d%n",n1, n2, addition1);

        // Adding three integers:
        System.out.println("Enter any three integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int addition2 = calculator.add(a, b, c);
        System.out.printf("%d + %d + %d = %d%n",a,b,c,addition2);

        // Adding two doubles
        System.out.println("Enter any two doubles: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        double addition3 = calculator.add(x, y);
        System.out.printf("%f + %f = %f%n",x,y,addition3);

        // Adding array of integers:
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int[] numbers = new int[size];
        System.out.printf("Enter any %d numbers:%n",size);
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int addition4 = calculator.add(numbers);
        System.out.println("Array: "+Arrays.toString(numbers));
        System.out.println("Sum : "+addition4);
        input.close();
    }
}
