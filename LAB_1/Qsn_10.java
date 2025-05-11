import java.util.Scanner;

public class Qsn_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First value:");
        int n1 = input.nextInt();
        System.out.print("Second value:");
        int n2 = input.nextInt();
        System.out.println("Values before swap:");
        System.out.println("First value: "+n1+"  Second value: "+n2);
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("Values after swap:");
        System.out.println("First value: "+n1+"  Second value: "+n2);

    }
}
