import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Qsn_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row,col;
        int size = 2;
        row = col = size;
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        System.out.println("Enter the elements for matrix 1:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the elements for matrix 2:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        // int[][] sumMatrix = new int[row][col]; // initializing sumMatrix
        // // adding two matrices and storing it in sumMatrix
        // for(int i = 0; i < row; i++) {
        //     for(int j = 0; j < col; j++) {
        //         sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
        //     }
        // }
        // //displaying sumMatrix
        // System.out.println("Sum of the matrices:");
        // for(int[] e : sumMatrix) {
        //     System.out.println(Arrays.toString(e));
        // }
        
        // next approach: without iteration
        int[][] matrixSum = IntStream.range(0, size).mapToObj(i -> IntStream.range(0, size).map(j -> matrix1[i][j] + matrix2[i][j]).toArray()).toArray(int[][]::new); 
        System.out.println("Sum of the matrices:");
        for(int[] i : matrixSum) {
            System.out.println(Arrays.toString(i));
        }
        input.close();
    }
}