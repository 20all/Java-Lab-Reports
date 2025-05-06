import java.util.*;
public class Qsn_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int n1 = input.nextInt();
        System.out.println("Enter second number:");
        int n2 = input.nextInt();
        int  sum = n1 + n2;
        int diff = n1 - n2;
        int product = n1 * n2;
        System.out.println("Output:");
        System.out.println(n1+" + "+n2+" = "+sum);
        System.out.println(n1+" - "+n2+" = "+diff);
        System.out.println(n1+" x "+n2+" = "+product);
        input.close();
    }
}
