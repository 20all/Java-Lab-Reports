import java.util.Scanner;

public class Qsn_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbres: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.println("What do you want to do?");
        System.out.println("1: Sum");
        System.out.println("2: Difference");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println(n1+" + "+n2+" = "+n1+n2);
                break;
            case 2:
                System.out.println(n1+" - "+n2+" = "+(n1-n2));
                // System.out.printf("%d - %d = %d\n",n1,n2,n1-n2);
            break;
            case 3:
                System.out.println(n1+" * "+n2+" = "+n1*n2);
                break;
            case 4:
                System.out.println(n1+" / "+n2+" = "+n1/n2);
                break;
            default:
                System.out.println("Enter a valid choice(1-4)!");
                break;
        }
        input.close();
    }
}
