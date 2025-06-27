import java.util.Arrays;
import java.util.Scanner;

public class Qsn_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = 4; 
        int cols = 4;
        int[][] matrix = new int[rows][cols];
        System.out.printf("Enter the elements of the %d*%d matrix\n",rows,cols); 
        for(int i = 0; i < rows; i++) {
            System.out.println("Row "+(i+1)+" elements:");
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        int sum = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(i == j || i+j == rows-1) {
                    sum += matrix[i][j];
                }
            }
        }
        for(int[] i : matrix) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println("Sum of diagonal elements of the matrix : "+sum);
        input.close();
    }
}
