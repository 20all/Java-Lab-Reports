import java.util.Arrays;
import java.util.Scanner;

public class Qsn_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = 2;
        int col = 3;
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[col][row];
        int[][] productMatrix = new int[row][row];
        System.out.printf("Enter the elements for first metrix(%d*%d):%n",row, col);
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.printf("Enter the elements for second metrix(%d*%d):%n",col,row);
        for(int i = 0; i < col; i++) {
            for(int j = 0; j < row; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        System.out.println("First matrix: "+Arrays.deepToString(matrix1));
        System.out.println("Second matrix: "+Arrays.deepToString(matrix2));
        System.out.println("\nMatrix multiplication:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < row; j++) {
                int sum = 0;
                for(int k = 0; k < col; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                productMatrix[i][j] = sum;
            }
        }
        System.out.println(Arrays.deepToString(productMatrix));
        input.close();
    }
}
