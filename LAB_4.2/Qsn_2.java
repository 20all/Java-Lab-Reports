import java.util.Arrays;

public class Qsn_2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int n : numbers) {
            sum += n;
        }
        System.out.println("Array values: "+Arrays.toString(numbers));
        System.out.println("Sum : "+sum);
    }
}
