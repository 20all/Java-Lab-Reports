import java.util.Scanner;

public class Qsn_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 10;
        System.out.println("Enter any "+size+" numbers:");
        int[] n = new int[size];
        for(int i = 0; i < size; i++) {
            n[i] = input.nextInt();
        }
        int max = n[0], min = n[0];
        for(int i : n) {
            if(i > max){
                max = i;
            }
            if(i < min) {
                min = i;
            }
        }
        System.out.println("Maximum value: "+max);
        System.out.println("Minimum value: "+min);
        input.close();
    }
}
