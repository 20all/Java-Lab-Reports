import java.util.Scanner;

public class Qsn_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        String number = input.nextLine();
        int acc = 0;
        int count = 0;
        for(char ch: number.toCharArray()) {
            if(Character.isDigit(ch)) {
                count++;
                if(ch%2 == 0) {
                    acc++;
                }
            }
        }
        if(acc == count) {
            System.out.println(number+" is a Riley number.");
        } else {
            System.out.println(number+" is not `a Riley number.");
        }
        input.close();
    }
}
