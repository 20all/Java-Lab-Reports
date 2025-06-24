import java.util.Scanner;

public class Qsn_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 10;
        int[] array = new int[size];
        System.out.println("Enter any "+size+" numbers:");
        for(int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        int sum = 0;
        for(int i: array) {
            sum += i;
        }
        System.out.println("Sum of the "+size+" inputed numbers is "+sum);
        input.close();
    }
}