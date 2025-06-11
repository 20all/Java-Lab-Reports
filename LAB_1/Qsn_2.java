import java.util.Scanner;

public class Qsn_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int n = input.nextInt();
        int sq = n * n;
        System.out.println("Square of "+n+" = "+sq);
        input.close();
    }
}
