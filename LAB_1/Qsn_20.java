import java.util.Scanner;

public class Qsn_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n = new int[4];
        System.out.println("Enter any four numbers: ");
        for(int i = 0; i < n.length; i++) {
            n[i] = input.nextInt();
        }
        int smallest  = n[0];
        for(int i = 1; i < n.length; i++) {
            if(n[i] < smallest)
                smallest = n[i];
        }
        // int smallest = ((n)) ? : ;
        System.out.println(smallest+" is Smallest.");
        input.close();
    }
}
