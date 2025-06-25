import java.util.Scanner;

public class Qsn_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r1, c1;
        int r2, c2;
        while(true) {
            System.out.println("For first matrix:");
            System.out.print("Rows: ");
            r1 = input.nextInt();
            System.out.print("Columns: ");
            c1 = input.nextInt();
            System.out.println("For second matrix:");
            System.out.print("Rows: ");
            r2 = input.nextInt();
            System.out.print("Columns: ");
            c2 = input.nextInt();
            boolean isValid = (r1 == c2 && r2 == c1) ? true : false;
            if(isValid) {
                break;
            }
            System.out.println("Please enter the correct row and columns!\n");
        }
        int[][] matrix1 = new int[r1][c1];
        int[][] matrix2 = new int[r2][c2];
        int[][] productMatrix = new int[r1][c2];
        System.out.printf("Enter the elements for first metrix(%d*%d):%n",r1, c1);
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.printf("Enter the elements for second metrix(%d*%d):%n",r2, c2);
        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        // multiplication process
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c2; j++) {
                int sum = 0;
                for(int k = 0; k < c1; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                productMatrix[i][j] = sum;
            }
        }
        System.out.println("Matrix Multiplication: ");
        for(int i = 0; i < r1; i++) {
            System.out.print("[ ");
            for(int j = 0; j < c2; j++) {
                System.out.print(productMatrix[i][j]+" ");
            }
            System.out.print("]\n");
        }
        input.close();
    }
}
