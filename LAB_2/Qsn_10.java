import java.util.Scanner;

public class Qsn_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter any number: ");
        int n = input.nextInt();
        System.out.println("What do you want to check?");
        System.out.println("1: Odd or Even");
        System.out.println("2: Negative or Positive");
        int choice = input.nextInt();
        boolean isOdd = (n%2 == 0)? false: true;
        boolean isNegative = (n >= 0) ? false : true;
        switch (choice) {
            case 1:
                if(isOdd) {
                    System.out.println(n+" is Odd.");
                } else {
                    System.out.println(n+" is Even.");
                }
                break;
            case 2:
                if(!isNegative) {
                    System.out.println(n+" is Positive.");
                } else {
                    System.out.println(n+" is Negative.");
                }
                break;
            default:
                System.out.println("Enter a valid choice (1 or 2)!");
                break;
        }
        input.close();
    }
}
