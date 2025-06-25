import java.util.Arrays;
import java.util.Scanner;

public class Qsn_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r, c;
        System.out.print("How many rows? ");
        r = input.nextInt();
        System.out.print("How many columns? ");
        c = input.nextInt();
        int[][] matrix1 = new int[r][c];
        int[][] matrix2 = new int[c][r];
        int[][] productMatrix = new int[r][r];
        System.out.printf("Enter the elements for first metrix(%d*%d):%n",r,c);
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix1: "+Arrays.deepToString(matrix1));
        // // displaying matrix2
        // for(int i = 0; i < r; i++) {
        //     for(int j = 0; j < c; j++) {
        //         System.out.print(matrix1[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        System.out.printf("Enter the elements for second metrix(%d*%d):%n",c,r);
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        System.out.println("Matrix2: "+Arrays.deepToString(matrix2));
        // // displaying matrix2
        // for(int i = 0; i < c; i++) {
        //     for(int j = 0; j < r; j++) {
        //         System.out.print(matrix2[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // multiplication operation
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < r; j++) {
                int sum = 0;
                for(int k = 0; k < c; k++) {
                    sum += matrix1[i][k]*matrix2[k][j];
                }
                productMatrix[i][j] = sum;
            }
        }
        System.out.printf("Matrix Multiplication(%d*%d):%n",r,r);
        for(int i = 0; i < r; i++) {
            System.out.print("[ ");
            for(int j = 0; j < r; j++) {
                System.out.print(productMatrix[i][j]+" ");
            }
            System.out.print("]");
            System.out.println();
        }
        input.close();
    }
}
