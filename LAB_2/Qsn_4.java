import java.util.Scanner;
public class Qsn_4 {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int n = input.nextInt();
        // int count = 0;
        // while(n>0) {
        //     count++;
        //     n/=10;
        // }
        // System.out.println("The number have "+count+" digits");
        // input.close();
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        String number = input.nextLine();

        int count = 0;
        for(char ch: number.toCharArray()) {
            if(Character.isDigit(ch))
              count++;
        }
        if(count > 0) {
            String digitWord = (count == 1) ? "digit" : "digits";
            System.out.println("The number has "+count+" "+digitWord);
        } else {
            System.out.println("NO valid digits found in the input!");
        }
        input.close();
    }
}
