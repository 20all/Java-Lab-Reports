import java.util.Scanner;

public class Qsn_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = 3;
        int col = 4;
        int[][] matrix = new int[row][col];
        for(int i = 0; i < row; i++) {
            System.out.printf("Table Row %d:%n",i+1);
            for(int j = 0; j < col; j++) {
                System.out.printf("Column[%d]: ",j+1);
                matrix[i][j] = input.nextInt();
            }
        }
        int sumOfEven = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(matrix[i][j] % 2 == 0) {
                    sumOfEven += matrix[i][j];
                }
            }
        }
        System.out.println("Sum of even elements of the table is : "+sumOfEven);
        input.close();
    }
}
