import java.util.Arrays;
import java.util.Scanner;

public class Qsn_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, col;
        row = col = 2;
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        System.out.println("Enter the elements for first metrix:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements for second metrix:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix1 : "+Arrays.deepToString(matrix1));
        System.out.println("Matrix2 : "+Arrays.deepToString(matrix2));
        int[][] matrixSum = new int[row][col]; // matrix for sum defined
        // addition operation
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum of the two matrics is: ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(matrixSum[i][j]+" ");
            }
            System.out.println();
        }
        input.close();
    }
}
