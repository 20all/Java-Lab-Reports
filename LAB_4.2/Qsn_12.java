import java.util.Arrays;
import java.util.Scanner;

public class Qsn_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = 2;
        int col = 2;
        int[][] matrix = new int[row][col];
        for(int i = 0; i < row; i++) {
            System.out.printf("Enter elements of %d row:%n",i+1);
            for(int j = 0; j < col; j++) {
                matrix[i][j] = input.nextInt(); 
            }
        }
        System.out.println("Matrix:");
        for(int[] rows : matrix) {
            System.out.println(Arrays.toString(rows));
        }
        int[][] transpose = new int[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        System.out.println("Transpose of Matrix:");
        for(int[] rows : transpose) {
            System.out.println(Arrays.toString(rows));
        }
        input.close();
    }
}
