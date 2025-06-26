import java.util.Arrays;

public class Qsn_9 {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {2, 1}};
        int[][] matrix2 = {{2, 1}, {1, 2}};
        System.out.println("Matrix 1: "+Arrays.deepToString(matrix1));
        System.out.println("Matrix 2: "+Arrays.deepToString(matrix2));
        System.out.println("Addition:");
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sum = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        // System.out.println(" : "+Arrays.deepToString(sum));
        // for(int[] r : sum) {
        //     for(int c : r) {
        //         System.out.print(c+" ");
        //     }
        //     System.out.println();
        // }
        for(int[] row : sum) {
            System.out.println(Arrays.toString(row));
        }
    }
}
