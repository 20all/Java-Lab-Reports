import java.util.Scanner;

public class Qsn_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row , col;
        row= col = 4;
        int[][] matrix = new int[row][col];
        System.out.printf("Enter the elements of %d*%d matrix:%n",row,col);
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        int sumOfDiagonalElements = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(i == j || i+j == row-1) {
                    sumOfDiagonalElements += matrix[i][j];
                }
            }
        }
        // for(int i = 0; i < row; i++) {
        //     for(int j = 0; j < col; j++) {
        //         System.out.print("["+matrix[i][j]+"] ");
        //     }
        //     System.out.println();
        // }
        System.out.println("Sum of Diagonal Elements is "+sumOfDiagonalElements);
        input.close();
    }
}
// 11 12 13 14
// 21 22 23 24
// 31 32 33 34
// 41 42 43 44
