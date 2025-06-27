import java.util.Scanner;
import java.util.Arrays;
public class Qsn_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = 3;
        int col = 3;
        int[][] matrix = new int[row][col];
        System.out.printf("Enter the integers for %d*%d size array:%n",row,col);
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        // displaying the array(matrix)
        for(int[] rows : matrix) {
            System.out.println(Arrays.toString(rows));
        }
        int sum = Arrays.stream(matrix).flatMapToInt(Arrays::stream).sum(); // added all elements without using iteration
        System.out.printf("Sum of all the elements of the Array of size %d*%d is %d\n",row,col,sum);
        input.close();
    }
}
