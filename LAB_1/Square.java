import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = takeInput.nextInt();
        int square = num * num;
        System.out.println("Square of "+num+" = "+square);
        takeInput.close();
    }
}
