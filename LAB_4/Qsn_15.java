import java.util.Arrays;
import java.util.Scanner;

public class Qsn_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = 2;
        int col = 2;
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        System.out.printf("Enter the elements for first metrix(%d*%d):%n",row, col);
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.printf("Enter the elements for second metrix(%d*%d):%n",row,col);
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        System.out.println("First matrix: "+Arrays.deepToString(matrix1));
        System.out.println("Second matrix: "+Arrays.deepToString(matrix2));
        int acc = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(matrix1[i][j] == matrix2[i][j]) {
                    acc++;
                }
            }
        }
        boolean isEqual = (row*col) == acc ? true : false;
        if(isEqual) {
            System.out.println("The matrices are equal.");
        } else {
            System.out.println("The matrices are not equal.~!");
        }
        input.close();
    }
}
