// import java.util.Arrays;
import java.util.Scanner;

public class Qsn_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = 3;
        int col = 3;
        int[][] arr = new int[row][col];
        System.out.printf("Enter the elements for %d*%d size array:%n",row,col);
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        // System.out.println(Arrays.deepToString(arr)); //  displays all the elements of 2d array without any iteretion
        int sum = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of all elements in the array = "+sum);
        input.close();
    }
}
