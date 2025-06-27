import java.util.Arrays;
import java.util.Scanner;

public class Qsn_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row1 = 3;
        int col1 = 3;
        int row2 = col1;
        int col2 = row1;
        int[][] matrix1 = new int[row1][col1];
        int[][] matrix2 = new int[row2][col2];
        System.out.printf("Enter the elements of %d*%d matrix:%n",row1, col1);
        for(int i = 0; i < row1; i++) {
            for(int j = 0; j < col1; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.printf("Enter the elements of %d*%d matrix:%n",row2, col2);
        for(int i = 0; i < row2; i++) {
            for(int j = 0; j < col2; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        // multiplication operation
        int[][] productMatrix = new int[row1][col2];
        for(int i = 0; i < row1; i++) {
            for(int j = 0; j < col2; j++) {
                int sum = 0;
                for(int k = 0; k < row1; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                productMatrix[i][j] = sum;
            }
        }
        // displaying the product matrix
        System.out.println("Matrix Multiplication:");
        for(int[] i : productMatrix) {
            System.out.println(Arrays.toString(i));
        }
        input.close();
    }
}
