import java.util.Scanner;

public class Qsn_3 {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.printf("Enter a number: ");
        // int n = input.nextInt();
        // int i = n;
        // while(i > 0) {
        //     System.out.printf("%2d",i%10);
        //     i/=10;
        // }
        // input.close();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = input.nextLine();

        StringBuilder digits = new StringBuilder();
        for(char ch: number.toCharArray()) {
            if(Character.isDigit(ch)) {
                digits.append(ch).append(" ");
            }
        }
        if(digits.length() > 0) {
            System.out.println("Digits used in the number: "+digits.toString());
        } else {
            System.out.println("No digits found in the string!");
        }
        input.close();
    }
}
