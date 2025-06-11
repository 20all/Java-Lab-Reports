import java.util.Scanner;

public class Qsn_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any three numbers:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        //ternary operator
        int greaterNumber = (((n1>n2) && (n1>n3))? n1 : (n2>n3)? n2 : n3);
        System.out.println(greaterNumber+" is greater!"); 
        input.close();
    }
}
