import java.util.Arrays;
import java.util.Scanner;

public class Qsn_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = 2;
        int col = 2;
        int[][] matrix = new int[row][col];
        System.out.printf("Enter the elements of %d*%d matrix:%n",row,col);
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("Element [%d][%d]: ",i+1,j+1);
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix: ");
        // for(int i = 0; i < row; i++) {
        //     for(int j = 0; j < col; j++) {
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        System.out.println(Arrays.deepToString(matrix));
        int[][] transposeMatrix = new int[col][row];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        System.out.println("Transpose matrix: ");
        // for(int i = 0; i < row; i++) {
        //     for(int j = 0; j < col; j++) {
        //         System.out.print(transposeMatrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        System.out.println(Arrays.deepToString(transposeMatrix));
        input.close();
    }
}
