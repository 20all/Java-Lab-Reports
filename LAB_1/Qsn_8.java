import java.util.Scanner;

public class Qsn_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rectangle's,");
        System.out.print("Length: ");
        int l = input.nextInt();
        System.out.print("Bredth: ");
        int b = input.nextInt();
        int area = l * b;
        System.out.println("Area of the rectangle : "+area);
        input.close();
    }
}
