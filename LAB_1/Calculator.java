import java.util.*;
public class Calculator{
    int num1, num2;
    // public Calculator(int n1, int n2) {
    //     this.num1 = n1;
    //     this.num2 = n2;
    // }
    public void getValue(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }
    public void inputTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        getValue(n1, n2);
        // Calculator c = new Calculator(n1, n2);
    }
    public int sum() {
        return num1+num2;
    }
    public int diff() {
        return num1-num2;
    }
    public int mul() {
        return num1*num2;
    }
    public int div() {
        return num1/num2;
    }
    public void showOutput(int output) {
        System.out.println(": "+output);
    }
    public void selectOperation(int choice){
        int ch = choice;
        switch (ch) {
            case 1:
                // while (0) {
                //     inputTwoNumbers();
                //     showOutput(sum());
                //     System.out.println("press 'q' to exit.....");
                //     if()
                // }
                inputTwoNumbers();
                showOutput(sum());
                break;

            case 2:
                inputTwoNumbers();
                showOutput(diff());
                break;
            case 3:
                inputTwoNumbers();
                showOutput(mul());
                break;

            case 4:
                inputTwoNumbers();
                showOutput(div());
                break;
        
            default:
                break;
        }
    }
    public static void main(String[] args) {
        String s = "";
        while (s != "y") {
            Calculator c = new Calculator();
            Scanner scan = new Scanner(System.in);
            System.out.println("[Addition: 1 || Sutraction: 2 || Multiplication: 3 || Division: 4]");
            System.out.println("What operation do you want to perform?");
            int ch = scan.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Addition:");
                    break;
                    case 2:
                    System.out.println("Subtraction:");
                    break;
                    case 3:
                    System.out.println("Multiplication:");
                    break;
                    case 4:
                    System.out.println("Division:");
                    break;
                    
                    default:
                    break;
                }
                c.selectOperation(ch);
                scan.nextLine();
                System.out.println("Do you want to exit(Y/N)?");
                String str = scan.nextLine();
                scan.nextLine();
                s = str;
        }
    }
}