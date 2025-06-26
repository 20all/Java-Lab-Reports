import java.util.Arrays;

public class Qsn_3 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int e : n) {
            sum += e;
        }
        double average = sum / n.length;
        System.out.println("Array elements: "+Arrays.toString(n));
        System.out.println("Average : "+average);
    }
}
