import java.util.Arrays;
import java.util.Scanner;

public class Qsn_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers you want to arrange? ");
        int size = input.nextInt();
        System.out.println("Enter any "+size+" numbers:");
        int[] n = new int[size];
        for(int i = 0; i < size; i++) {
            n[i] = input.nextInt();
        } 
        int temp;
        for(int i = 0; i < size; i++) {
            for(int j = i+1; j < size; j++) {
                if(n[i] < n[j]) {
                    temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        System.out.println("Numbers in descending order: ");
        System.out.println(Arrays.toString(n));
        input.close();
    }
}
