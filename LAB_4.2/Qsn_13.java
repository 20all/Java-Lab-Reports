import java.util.Arrays;
import java.util.Scanner;

public class Qsn_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = 3;
        int col = 4;
        int[][] table = new int[row][col];
        for(int i = 0; i < row; i++) {
            System.out.println("Enter elements of row "+(i+1));
            for(int j = 0; j < col; j++) {
                table[i][j] = input.nextInt();
            }
        }
        int sumOfEven = Arrays.stream(table).flatMapToInt(Arrays::stream).filter(n -> n%2==0).sum();
        System.out.println("Sum of even numbers in the table is "+sumOfEven);
        input.close();
    }
}
