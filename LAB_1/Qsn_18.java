import java.util.Scanner;

public class Qsn_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        if(n1 < n2) {
            System.out.println(n1+" < "+n2);
        } else {
            System.out.println(n2+" < "+n1);
        }
        input.close();
    }
}
